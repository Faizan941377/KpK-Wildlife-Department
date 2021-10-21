package com.example.kpkwildlifedepartment.RoadKills.Spinners;

public class VictimStatus {

    public String Id;
    public String VictimStatus;

    public VictimStatus(String id, String victimStatus) {
        Id = id;
        this.VictimStatus = victimStatus;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getVictimStatus() {
        return VictimStatus;
    }

    public void setVictimStatus(String victimStatus) {
        VictimStatus = victimStatus;
    }

    @Override
    public String toString() {
        return VictimStatus;
    }
}
