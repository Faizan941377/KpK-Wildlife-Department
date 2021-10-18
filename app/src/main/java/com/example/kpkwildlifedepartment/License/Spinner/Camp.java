package com.example.kpkwildlifedepartment.License.Spinner;

public class Camp {

    public String Id;
    public String Camp;

    public Camp(String id, String camp) {
        Id = id;
        this.Camp = camp;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCamp() {
        return Camp;
    }

    public void setCamp(String camp) {
        Camp = camp;
    }

    @Override
    public String toString() {
        return Camp;
    }
}
