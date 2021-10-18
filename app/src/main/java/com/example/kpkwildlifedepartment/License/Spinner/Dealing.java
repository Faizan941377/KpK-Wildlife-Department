package com.example.kpkwildlifedepartment.License.Spinner;

public class Dealing {

    public String Id;
    public String Dealing;

    public Dealing(String id, String dealing) {
        Id = id;
        this.Dealing = dealing;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getDealing() {
        return Dealing;
    }

    public void setDealing(String dealing) {
        Dealing = dealing;
    }

    @Override
    public String toString() {
        return Dealing;
    }
}
