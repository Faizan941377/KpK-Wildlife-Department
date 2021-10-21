package com.example.kpkwildlifedepartment.Survey.Spinners;

public class SexOfSpecie {

    public String Id;
    public String SexOfSpecie;

    public SexOfSpecie(String id, String sexOfSpecie) {
        Id = id;
        SexOfSpecie = sexOfSpecie;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getSexOfSpecie() {
        return SexOfSpecie;
    }

    public void setSexOfSpecie(String sexOfSpecie) {
        SexOfSpecie = sexOfSpecie;
    }

    @Override
    public String toString() {
        return SexOfSpecie;
    }
}
