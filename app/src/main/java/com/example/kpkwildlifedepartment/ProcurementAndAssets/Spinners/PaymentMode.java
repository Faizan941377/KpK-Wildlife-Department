package com.example.kpkwildlifedepartment.ProcurementAndAssets.Spinners;

public class PaymentMode {

    public String Id;
    public String PaymentMode;

    public PaymentMode(String id, String paymentMode) {
        Id = id;
        this.PaymentMode = paymentMode;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPaymentMode() {
        return PaymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        PaymentMode = paymentMode;
    }

    @Override
    public String toString() {
        return PaymentMode;
    }
}
