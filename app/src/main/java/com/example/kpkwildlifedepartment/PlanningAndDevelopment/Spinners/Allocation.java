package com.example.kpkwildlifedepartment.PlanningAndDevelopment.Spinners;

public class Allocation {
    public String Id;
    public String Allocation;

    public Allocation(String id, String allocation) {
        Id = id;
        this.Allocation = allocation;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAllocation() {
        return Allocation;
    }

    public void setAllocation(String allocation) {
        Allocation = allocation;
    }

    @Override
    public String toString() {
        return Allocation;
    }
}
