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

import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceForms.EmployeeInitialAppointmentActivity;
import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceForms.EmployeePromotionsActivity;
import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceForms.EmployeeQualificationActivity;
import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceForms.EmployeeServiceHistoryActivity;
import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceForms.EmployeeTrainingInformationActivity;
import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceForms.EmployeeTransferActivity;
import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceForms.HRFamilyInformationActivity;
import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceForms.Personal_InfoActivity;
import com.example.kpkwildlifedepartment.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class HumanResourceActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView backBT;
    CardView personalInfoBT;
    CardView qualificationBT;
    CardView employeeInitialAppointmentBT;
    CardView employeeServiceHistoryBT;
    CardView employeeTrainingInformationBT;
    CardView employeePromotionBT;
    CardView employeeTransferBT;
    CardView hrFamilyInformationBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_resource);

        backBT = findViewById(R.id.iv_humanResource_back);
        personalInfoBT = findViewById(R.id.cd_humanResource_personalInfo);
        qualificationBT = findViewById(R.id.bt_HumanResource_Employee_Qualification);
        employeeInitialAppointmentBT = findViewById(R.id.cv_HumanResource_EmployeeInitialAppointment);
        employeeServiceHistoryBT = findViewById(R.id.cv_HumanResource_EmployeeServiceHistory);
        employeeTrainingInformationBT = findViewById(R.id.cv_HumanResource_EmployeeTrainingInformation);
        employeePromotionBT = findViewById(R.id.cv_HumanResource_EmployeePromotion);
        employeeTransferBT = findViewById(R.id.cv_HumanResource_EmployeeTransfer);
        hrFamilyInformationBT = findViewById(R.id.cv_HumanResource_HRFamilyInformation);




        backBT.setOnClickListener(this);
        personalInfoBT.setOnClickListener(this);
        qualificationBT.setOnClickListener(this);
        employeeInitialAppointmentBT.setOnClickListener(this);
        employeeServiceHistoryBT.setOnClickListener(this);
        employeeTrainingInformationBT.setOnClickListener(this);
        employeePromotionBT.setOnClickListener(this);
        employeeTransferBT.setOnClickListener(this);
        hrFamilyInformationBT.setOnClickListener(this);


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
                break;

            case R.id.cv_HumanResource_EmployeeInitialAppointment:
                AddViewEmployeeInitialAppointment();
                break;

            case R.id.cv_HumanResource_EmployeeServiceHistory:
                AddViewEmployeeServiceHistory();
                break;

            case R.id.cv_HumanResource_EmployeeTrainingInformation:
                AddViewEmployeeTrainingInformation();
                break;

            case R.id.cv_HumanResource_EmployeePromotion:
                AddViewEmployeePromotion();
                break;

            case R.id.cv_HumanResource_EmployeeTransfer:
                AddViewEmployeeTransfer();
                break;

            case  R.id.cv_HumanResource_HRFamilyInformation:
                ViewHRFamilyInformation();
                break;
        }
    }

    private void ViewHRFamilyInformation() {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(HumanResourceActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.hr_bottom_sheet, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HRFamilyInformationActivity.class);
                startActivity(intent);
                Toast.makeText(HumanResourceActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void AddViewEmployeeTransfer() {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(HumanResourceActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EmployeeTransferActivity.class);
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
                Toast.makeText(HumanResourceActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

    }

    private void AddViewEmployeePromotion() {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(HumanResourceActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EmployeePromotionsActivity.class);
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
                Toast.makeText(HumanResourceActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

    }

    private void AddViewEmployeeTrainingInformation() {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(HumanResourceActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EmployeeTrainingInformationActivity.class);
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
                Toast.makeText(HumanResourceActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

    }

    private void AddViewEmployeeServiceHistory() {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(HumanResourceActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EmployeeServiceHistoryActivity.class);
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
                Toast.makeText(HumanResourceActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void AddViewEmployeeInitialAppointment() {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(HumanResourceActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EmployeeInitialAppointmentActivity.class);
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
                Toast.makeText(HumanResourceActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
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
                Toast.makeText(HumanResourceActivity.this, "View Record", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(HumanResourceActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }
}