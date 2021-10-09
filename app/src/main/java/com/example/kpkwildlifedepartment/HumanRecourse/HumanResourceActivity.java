package com.example.kpkwildlifedepartment.HumanRecourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.kpkwildlifedepartment.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class HumanResourceActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView backBT;
    CardView personalInfoBT;
    CardView qualificationBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_resource);

        backBT = findViewById(R.id.iv_humanResource_back);
        personalInfoBT = findViewById(R.id.cd_humanResource_personalInfo);
        qualificationBT = findViewById(R.id.bt_HumanResource_Employee_Qualification);


        backBT.setOnClickListener(this);
        personalInfoBT.setOnClickListener(this);
        qualificationBT.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.iv_humanResource_back:
                finish();
                break;

            case R.id.cd_humanResource_personalInfo:
                AddViewPersonalInfo();
                break;

            case R.id.bt_HumanResource_Employee_Qualification:
                AddViewEmployeeQualification();
        }
    }

    private void AddViewEmployeeQualification() {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(HumanResourceActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EmployeeQualificationActivity.class);
                startActivity(intent);
                Toast.makeText(HumanResourceActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(getApplicationContext(), View_VDC_DataActivity.class);
                startActivity(intent);
                Toast.makeText(CD_Activity.this, "View Record", Toast.LENGTH_SHORT).show();*/
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void AddViewPersonalInfo() {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(HumanResourceActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Personal_InfoActivity.class);
                startActivity(intent);
                Toast.makeText(HumanResourceActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(getApplicationContext(), View_VDC_DataActivity.class);
                startActivity(intent);
                Toast.makeText(CD_Activity.this, "View Record", Toast.LENGTH_SHORT).show();*/
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }
}