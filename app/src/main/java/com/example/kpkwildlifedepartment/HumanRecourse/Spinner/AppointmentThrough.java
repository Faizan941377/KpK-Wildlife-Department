package com.example.kpkwildlifedepartment.HumanRecourse.Spinner;

public class AppointmentThrough {

    public String Id;
    public String AppointmentThrough;

    public AppointmentThrough(String id, String appointmentThrough) {
        Id = id;
        this.AppointmentThrough = appointmentThrough;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAppointmentThrough() {
        return AppointmentThrough;
    }

    public void setAppointmentThrough(String appointmentThrough) {
        AppointmentThrough = appointmentThrough;
    }

    @Override
    public String toString() {
        return AppointmentThrough;
    }
}
