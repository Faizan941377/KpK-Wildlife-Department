package com.example.kpkwildlifedepartment.License.Spinner;

public class ShootingType {

    public String Id;
    public String ShootingType;

    public ShootingType(String id, String shootingType) {
        Id = id;
        this.ShootingType = shootingType;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getShootingType() {
        return ShootingType;
    }

    public void setShootingType(String shootingType) {
        ShootingType = shootingType;
    }

    @Override
    public String toString() {
        return ShootingType;
    }

}
