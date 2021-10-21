package com.example.kpkwildlifedepartment.PlanningAndDevelopment.Spinners;

public class ListOfCompletedProjects {

    public String Id;
    public String ListOfCompletedProjects;

    public ListOfCompletedProjects(String id, String listOfCompletedProjects) {
        Id = id;
        this.ListOfCompletedProjects = listOfCompletedProjects;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getListOfCompletedProjects() {
        return ListOfCompletedProjects;
    }

    public void setListOfCompletedProjects(String listOfCompletedProjects) {
        ListOfCompletedProjects = listOfCompletedProjects;
    }

    @Override
    public String toString() {
        return ListOfCompletedProjects;
    }
}
