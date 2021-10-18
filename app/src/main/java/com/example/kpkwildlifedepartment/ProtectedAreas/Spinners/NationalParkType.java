package com.example.kpkwildlifedepartment.ProtectedAreas.Spinners;

public class NationalParkType {

    public String Id;
    public String Type;


    public NationalParkType(String id, String type) {
        Id = id;
        this.Type = type;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return Type;
    }
}
