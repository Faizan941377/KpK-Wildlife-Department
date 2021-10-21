package com.example.kpkwildlifedepartment.Dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.kpkwildlifedepartment.ActAndRules.ActAndRulesActivity;
import com.example.kpkwildlifedepartment.ConservationEducation.ConservationEducationActivity;
import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceActivity;
import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceForms.EmployeeTransferActivity;
import com.example.kpkwildlifedepartment.License.LicenseActivity;
import com.example.kpkwildlifedepartment.License.LicenseTypeActivity;
import com.example.kpkwildlifedepartment.Offences.OffencesActivity;
import com.example.kpkwildlifedepartment.PlanningAndDevelopment.PlanningAndDevelopmentActivity;
import com.example.kpkwildlifedepartment.ProcurementAndAssets.ProcurementAndAssetsActivity;
import com.example.kpkwildlifedepartment.ProtectedAreas.ProtectedAreasActivity;
import com.example.kpkwildlifedepartment.ProtectedAreas.ProtectedAreasInfoActivity;
import com.example.kpkwildlifedepartment.R;
import com.example.kpkwildlifedepartment.RoadKills.RoadKillsActivity;
import com.example.kpkwildlifedepartment.Survey.SurveyActivity;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    CardView humanResourceBT;
    CardView actAndRulesBT;
    CardView protectedAreasBT;
    CardView licenseBT;
    CardView offencesBT;
    CardView planningAndDevelopmentBT;
    CardView procurementAndAssetsBT;
    CardView roadKillsBT;
    CardView surveyBT;
    CardView conservationEducationBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        humanResourceBT = findViewById(R.id.bt_dashboard_HumanResource);
        actAndRulesBT = findViewById(R.id.cv_ActAndRules);
        protectedAreasBT = findViewById(R.id.bt_dashboard_protectedAreas);
        licenseBT = findViewById(R.id.bt_dashboard_License);
        offencesBT = findViewById(R.id.bt_dashboard_Offences);
        planningAndDevelopmentBT = findViewById(R.id.bt_dashboard_PlanningAndDevelopment);
        procurementAndAssetsBT = findViewById(R.id.bt_dashboard_ProcurementAndAssets);
        roadKillsBT = findViewById(R.id.bt_dashboard_RoadKills);
        surveyBT = findViewById(R.id.bt_dashboard_Survey);
        conservationEducationBT = findViewById(R.id.bt_dashboard_ConservationEducation);


        humanResourceBT.setOnClickListener(this);
        actAndRulesBT.setOnClickListener(this);
        protectedAreasBT.setOnClickListener(this);
        licenseBT.setOnClickListener(this);
        offencesBT.setOnClickListener(this);
        planningAndDevelopmentBT.setOnClickListener(this);
        procurementAndAssetsBT.setOnClickListener(this);
        roadKillsBT.setOnClickListener(this);
        surveyBT.setOnClickListener(this);
        conservationEducationBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.bt_dashboard_HumanResource:
                Intent intent = new Intent(this, HumanResourceActivity.class);
                startActivity(intent);
                break;

            case R.id.cv_ActAndRules:
                Intent intent1 = new Intent(this, ActAndRulesActivity.class);
                startActivity(intent1);
                break;

            case R.id.bt_dashboard_protectedAreas:
                Intent intent2 = new Intent(this, ProtectedAreasActivity.class);
                startActivity(intent2);
                break;

            case R.id.bt_dashboard_License:
                Intent intent3 = new Intent(this, LicenseActivity.class);
                startActivity(intent3);
                break;

            case R.id.bt_dashboard_Offences:
                Intent intent4 = new Intent(this, OffencesActivity.class);
                startActivity(intent4);
                break;

            case R.id.bt_dashboard_PlanningAndDevelopment:
                AddViewPlanningAndDevelopment();
                break;

            case R.id.bt_dashboard_ProcurementAndAssets:
                AddViewProcurementAndAssets();
                break;

            case R.id.bt_dashboard_RoadKills:
                AddViewRoadKills();
                break;

            case R.id.bt_dashboard_Survey:
                AddViewSurvey();

            case R.id.bt_dashboard_ConservationEducation:
                Intent  intent5 = new Intent(this, ConservationEducationActivity.class);
                startActivity(intent5);
                break;
        }
    }

    private void AddViewSurvey() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(DashboardActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SurveyActivity.class);
                startActivity(intent);
                Toast.makeText(DashboardActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void AddViewRoadKills() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(DashboardActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RoadKillsActivity.class);
                startActivity(intent);
                Toast.makeText(DashboardActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void AddViewProcurementAndAssets() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(DashboardActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProcurementAndAssetsActivity.class);
                startActivity(intent);
                Toast.makeText(DashboardActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void AddViewPlanningAndDevelopment() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(DashboardActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PlanningAndDevelopmentActivity.class);
                startActivity(intent);
                Toast.makeText(DashboardActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }
}