package com.example.kpkwildlifedepartment.HumanRecourse.Spinner;

public class EmployeePromotionBPS {

    public String Id;
    public String BPS;

    public EmployeePromotionBPS(String id, String BPS) {
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
