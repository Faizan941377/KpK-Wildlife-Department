package com.example.kpkwildlifedepartment.License.Spinner;

public class Trapping {

    public String Id;
    public String Trapping;

    public Trapping(String id, String trapping) {
        Id = id;
        this.Trapping = trapping;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTrapping() {
        return Trapping;
    }

    public void setTrapping(String trapping) {
        Trapping = trapping;
    }

    @Override
    public String toString() {
        return Trapping;
    }
}
