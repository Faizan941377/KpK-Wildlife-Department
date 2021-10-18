package com.example.kpkwildlifedepartment.License;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.kpkwildlifedepartment.HumanRecourse.Spinner.AppointmentThrough;
import com.example.kpkwildlifedepartment.License.Spinner.ShootingLicenseType;
import com.example.kpkwildlifedepartment.ProtectedAreas.ProtecctAreasOfKPActivity;
import com.example.kpkwildlifedepartment.R;

import java.util.ArrayList;

public class ShootingLicenseTypeActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView backBT;
    Spinner shootingLicenseTypeSP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shooting_license_type);

        backBT = findViewById(R.id.iv_ShootingLicenseType_back);
        shootingLicenseTypeSP = findViewById(R.id.sp_ShootingLicenseType_shootingLicenseType);


        backBT.setOnClickListener(this);
        ShootingLicenseTypeDropDown();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.iv_ShootingLicenseType_back:
                finish();
                break;
        }
    }

    private void ShootingLicenseTypeDropDown() {

        ArrayList<ShootingLicenseType> dataList = new ArrayList<>();
        ShootingLicenseType user = new ShootingLicenseType("1", "Select Type of Shooting");
        ShootingLicenseType user1 = new ShootingLicenseType("1", "Small Game");
        ShootingLicenseType user2 = new ShootingLicenseType("1", "Big Game");

        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        shootingLicenseTypeSP.setAdapter(arrayAdapter);

        shootingLicenseTypeSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                shootingLicenseTypeSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(ShootingLicenseTypeActivity.this, "Please Select your gender!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}