package com.example.kpkwildlifedepartment.PlanningAndDevelopment.Spinners;

public class NatureOfProject {
    public String Id;
    public String NatureOfProject;

    public NatureOfProject(String id, String natureOfProject) {
        Id = id;
        this.NatureOfProject = natureOfProject;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNatureOfProject() {
        return NatureOfProject;
    }

    public void setNatureOfProject(String natureOfProject) {
        NatureOfProject = natureOfProject;
    }

    @Override
    public String toString() {
        return NatureOfProject;
    }
}
