
package com.hms.model;

import javax.swing.DefaultListModel;

public interface DatabaseHandler {
    
    public void addData(String title, String TestCost, boolean IsAvaiable, String additionalInput);
    public void searchByTitle(String testTitle, DefaultListModel<String> listModel);
    public void searchByTestCost(String testCost, DefaultListModel<String> listModel);
    
}
