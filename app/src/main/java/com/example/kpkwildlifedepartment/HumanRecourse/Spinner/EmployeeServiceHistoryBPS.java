package com.example.kpkwildlifedepartment.HumanRecourse.Spinner;

public class EmployeeServiceHistoryBPS {

    public String Id;
    public String BPS;

    public EmployeeServiceHistoryBPS(String id, String BPS) {
        Id = id;
        this.BPS = BPS;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getBPS() {
        return BPS;
    }

    public void setBPS(String BPS) {
        this.BPS = BPS;
    }

    @Override
    public String toString() {
        return BPS;
    }
}
