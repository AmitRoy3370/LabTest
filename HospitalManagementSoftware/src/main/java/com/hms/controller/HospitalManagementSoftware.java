package com.hms.controller;

import com.hms.model.PathologicalTest;
import com.hms.model.RadiologicalTest;
import com.hms.model.LabTest;
import com.hms.view.Home;

import javax.swing.JOptionPane;

/**
 * @Atia Azmi
 */
public class HospitalManagementSoftware {

    public static void main(String[] args) {
        System.out.println("Showing the Home Page");
        new Home().setVisible(true);

        /*
        
        String[] options = {"Pathological Test", "Radiological Test"};
        String testType = (String) JOptionPane.showInputDialog(null, "Choose the test type:",
                "Test Type", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        String testTitle = JOptionPane.showInputDialog("Enter the Test Title:");
        String testCostStr = JOptionPane.showInputDialog("Enter the Test Cost:");
        boolean isAvailable = JOptionPane.showConfirmDialog(null, "Is the test available?", "Availability",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        double testCost = 0.0;
        try {
            testCost = Double.parseDouble(testCostStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid cost format. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        LabTest test;
        if ("Pathological Test".equals(testType)) {
            String reagent = JOptionPane.showInputDialog("Enter the Reagent value:");
            test = new PathologicalTest(testTitle, testCost, isAvailable, reagent);
        } else {
            String plateDimension = JOptionPane.showInputDialog("Enter the Plate Dimension:");
            test = new RadiologicalTest(testTitle, testCost, isAvailable, plateDimension);
        }

        // Display
        JOptionPane.showMessageDialog(null, test.returnLabTestInfo(), "Test Details", JOptionPane.INFORMATION_MESSAGE);
    
         */
    }
}
