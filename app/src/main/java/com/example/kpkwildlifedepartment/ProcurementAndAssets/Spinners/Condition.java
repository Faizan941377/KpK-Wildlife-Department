package com.example.kpkwildlifedepartment.ProcurementAndAssets.Spinners;

public class Condition {
    public String Id;
    public String Condition;

    public Condition(String id, String condition) {
        Id = id;
        this.Condition = condition;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    @Override
    public String toString() {
        return Condition;
    }
}
