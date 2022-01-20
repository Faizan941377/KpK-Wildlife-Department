package com.example.kpkwildlifedepartment.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponse {

    @SerializedName("succeeded")
    @Expose
    private String  succeeded;
    @SerializedName("isLockedOut")
    @Expose
    private String isLockedOut;
    @SerializedName("isNotAllowed")
    @Expose
    private String isNotAllowed;
    @SerializedName("requiresTwoFactor")
    @Expose
    private String requiresTwoFactor;

    public String getSucceeded() {
        return succeeded;
    }

    public void setSucceeded(String succeeded) {
        this.succeeded = succeeded;
    }

    public String getIsLockedOut() {
        return isLockedOut;
    }

    public void setIsLockedOut(String isLockedOut) {
        this.isLockedOut = isLockedOut;
    }

    public String getIsNotAllowed() {
        return isNotAllowed;
    }

    public void setIsNotAllowed(String isNotAllowed) {
        this.isNotAllowed = isNotAllowed;
    }

    public String getRequiresTwoFactor() {
        return requiresTwoFactor;
    }

    public void setRequiresTwoFactor(String requiresTwoFactor) {
        this.requiresTwoFactor = requiresTwoFactor;
    }
}
