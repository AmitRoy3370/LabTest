package com.hms.model;

public class PathologicalTest extends LabTest {

    private String reagent;

    public PathologicalTest(String title, double cost, boolean isAvailable, String reagent) {
        super(title, cost, isAvailable);
        this.reagent = reagent;
    }

    @Override
    public String returnLabTestInfo() {
        return String.format("Test Type: Pathological\nTest Title: %s\nCost: %.2f\nAvailable: %s\nReagent: %s",
                title, cost, isAvailable ? "Yes" : "No", reagent);
    }

    public String getReagent() {
        return reagent;
    }

    public void setReagent(String reagent) {
        this.reagent = reagent;
    }

}
