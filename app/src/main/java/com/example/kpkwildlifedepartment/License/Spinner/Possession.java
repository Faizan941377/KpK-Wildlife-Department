package com.example.kpkwildlifedepartment.License.Spinner;

public class Possession {

    public String Id;
    public String Possession;

    public Possession(String id, String possession) {
        Id = id;
        this.Possession = possession;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPossession() {
        return Possession;
    }

    public void setPossession(String possession) {
        Possession = possession;
    }

    @Override
    public String toString() {
        return Possession;
    }
}
