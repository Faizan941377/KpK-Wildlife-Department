package com.example.kpkwildlifedepartment.HumanRecourse.Spinner;

public class PositionEmployee {

    public String id;
    public String Select_Position;

    public PositionEmployee(String id, String select_Position) {
        this.id = id;
        Select_Position = select_Position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSelect_Position() {
        return Select_Position;
    }

    public void setSelect_Position(String select_Position) {
        Select_Position = select_Position;
    }

    @Override
    public String toString() {
        return getSelect_Position();
    }
}
