package com.example.kpkwildlifedepartment.License.Spinner;

public class ShootingLicenseType {

    public String Id;
    public String ShootingLicenseType;

    public ShootingLicenseType(String id, String shootingLicenseType) {
        Id = id;
        this.ShootingLicenseType = shootingLicenseType;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getShootingLicenseType() {
        return ShootingLicenseType;
    }

    public void setShootingLicenseType(String shootingLicenseType) {
        ShootingLicenseType = shootingLicenseType;
    }

    @Override
    public String toString() {
        return ShootingLicenseType;
    }

}
