package com.hms.model;

public class RadiologicalTest extends LabTest {

    private String plateDimension;

    public RadiologicalTest(String title, double cost, boolean isAvailable, String plateDimension) {
        super(title, cost, isAvailable);
        this.plateDimension = plateDimension;
    }

    @Override
    public String returnLabTestInfo() {
        return String.format("Test Type: Radiological\nTest Title: %s\nCost: %.2f\nAvailable: %s\nPlate Dimension: %s",
                title, cost, isAvailable ? "Yes" : "No", plateDimension);
    }

    public String getPlateDimension() {
        return plateDimension;
    }

    public void setPlateDimension(String plateDimension) {
        this.plateDimension = plateDimension;
    }

}
