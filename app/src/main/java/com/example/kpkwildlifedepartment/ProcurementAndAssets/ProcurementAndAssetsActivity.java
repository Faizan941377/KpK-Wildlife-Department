package com.example.kpkwildlifedepartment.ProcurementAndAssets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.kpkwildlifedepartment.License.LicenseTypeActivity;
import com.example.kpkwildlifedepartment.License.Spinner.Import;
import com.example.kpkwildlifedepartment.ProcurementAndAssets.Spinners.Condition;
import com.example.kpkwildlifedepartment.ProcurementAndAssets.Spinners.PaymentMode;
import com.example.kpkwildlifedepartment.R;

import java.util.ArrayList;

public class ProcurementAndAssetsActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton backBT;
    Spinner paymentModeSP;
    Spinner conditionSP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procurement_and_assets);

        backBT = findViewById(R.id.iv_ProcurementAndAssets_back);
        paymentModeSP = findViewById(R.id.sp_ProcurementAndAssets_paymentMode);
        conditionSP = findViewById(R.id.sp_ProcurementAndAssets_condition);



        backBT.setOnClickListener(this);

        PaymentMode();
        Condition();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.iv_ProcurementAndAssets_back:
                finish();
                break;
        }
    }

    private void Condition() {
        ArrayList<Condition> dataList = new ArrayList<>();
        Condition user = new Condition("1", "Choose");
        Condition user1 = new Condition("1", "Serviceable");
        Condition user2 = new Condition("1", "Unserviceable");

        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        conditionSP.setAdapter(arrayAdapter);

        conditionSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                conditionSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(ProcurementAndAssetsActivity.this, "Please Select Camp!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void PaymentMode() {
        ArrayList<PaymentMode> dataList = new ArrayList<>();
        PaymentMode user = new PaymentMode("1", "Choose");
        PaymentMode user1 = new PaymentMode("1", "Cash");
        PaymentMode user2 = new PaymentMode("1", "Cheque");

        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        paymentModeSP.setAdapter(arrayAdapter);

        paymentModeSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                paymentModeSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(ProcurementAndAssetsActivity.this, "Please Select Camp!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}