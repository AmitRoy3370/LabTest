/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author USER
 */
public class RadiologicalTestDataHandler implements DatabaseHandler {

    String connectionString = "mongodb+srv://arponamitroy012:bEs2tbOmm32mrrmi@cluster0.g2xmh.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
    String databaseName = "LabTest";
    String collectionName = "RadiologicalTest";
    String collectionName1 = "PathiologicalTest";

    MongoClient mongoClient = MongoClients.create(connectionString);

    MongoDatabase database = mongoClient.getDatabase(databaseName);

    MongoCollection<Document> collections = database.getCollection(collectionName);

    //MongoCollection<Document> collections1 = database.getCollection(collectionName1);
    @Override
    public void addData(String testTitle, String testCostStr, boolean isAvailable, String extraInput) {

        try {

            Document document = new Document("TestTitle", testTitle)
                    .append("TestCost", Double.valueOf(testCostStr.trim()))
                    .append("IsAvaiable", isAvailable)
                    .append("Plate Dimension", extraInput);

            try {

                collections.insertOne(document);

            } catch (Exception e) {

            }

        } catch (Exception exception) {

            try {
                throw new Exception("Please enter a number for test cost");
            } catch (Exception ex) {
                Logger.getLogger(RadiologicalTestDataHandler.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    @Override
    public void searchByTitle(String searchingTest, DefaultListModel<String> listModel) {

        Document document = new Document("TestTitle", searchingTest);

        for (Document i : collections.find(document)) {

            listModel.addElement(i.toString());

        }

    }

    @Override
    public void searchByTestCost(String testCost, DefaultListModel<String> listModel) {

        try {

            try {

                Double.parseDouble(testCost.trim());

            } catch (Exception e1) {

                try {

                    throw new Exception("Please enter a number");

                } catch (Exception ex) {
                    
                }

            }

            Double cost = Double.valueOf(testCost);

            Document query = new Document("TestCost", new Document("$lte", cost));

            var results = collections.find(query).into(new ArrayList<>());

            for (Document doc : results) {
                listModel.addElement(doc.toJson());
            }

        } catch (NumberFormatException e) {

            try {
                throw new Exception("Please enter a number for test cost");
            } catch (Exception ex) {
                //gger.getLogger(RadiologicalTestDataHandler.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
