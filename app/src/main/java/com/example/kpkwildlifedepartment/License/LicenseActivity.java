package com.example.kpkwildlifedepartment.License;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceActivity;
import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceForms.EmployeeTransferActivity;
import com.example.kpkwildlifedepartment.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class LicenseActivity extends AppCompatActivity implements View.OnClickListener {


    CardView shootingLicenseTypeBT;
    CardView licenseTypeBT;
    ImageView backBT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license);

        shootingLicenseTypeBT= findViewById(R.id.bt_License_shootingLicense);
        licenseTypeBT = findViewById(R.id.bt_License_LicenseType);
        backBT = findViewById(R.id.iv_License_back);



        shootingLicenseTypeBT.setOnClickListener(this);
        licenseTypeBT.setOnClickListener(this);
        backBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.bt_License_shootingLicense:
                AddViewShootingLicenseType();
                break;

            case R.id.bt_License_LicenseType:
                AddViewLicenseType();
                break;

            case R.id.iv_License_back:
                finish();
                break;
        }
    }

    private void AddViewLicenseType() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(LicenseActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LicenseTypeActivity.class);
                startActivity(intent);
                Toast.makeText(LicenseActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LicenseActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void AddViewShootingLicenseType() {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(LicenseActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ShootingLicenseTypeActivity.class);
                startActivity(intent);
                Toast.makeText(LicenseActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LicenseActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

    }
}