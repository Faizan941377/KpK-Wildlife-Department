package com.example.kpkwildlifedepartment.RoadKills.Spinners;

public class Compensation {

    public String Id;
    public String Compensation;

    public Compensation(String id, String compensation) {
        Id = id;
        this.Compensation = compensation;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCompensation() {
        return Compensation;
    }

    public void setCompensation(String compensation) {
        Compensation = compensation;
    }

    @Override
    public String toString() {
        return Compensation;
    }
}
