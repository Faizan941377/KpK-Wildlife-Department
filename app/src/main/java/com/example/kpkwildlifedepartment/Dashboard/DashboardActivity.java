package com.example.kpkwildlifedepartment.Dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kpkwildlifedepartment.ActAndRules.ActAndRulesActivity;
import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceActivity;
import com.example.kpkwildlifedepartment.License.LicenseActivity;
import com.example.kpkwildlifedepartment.License.LicenseTypeActivity;
import com.example.kpkwildlifedepartment.ProtectedAreas.ProtectedAreasActivity;
import com.example.kpkwildlifedepartment.ProtectedAreas.ProtectedAreasInfoActivity;
import com.example.kpkwildlifedepartment.R;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    CardView humanResourceBT;
    CardView actAndRulesBT;
    CardView protectedAreasBT;
    CardView licenseBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        humanResourceBT = findViewById(R.id.bt_dashboard_HumanResource);
        actAndRulesBT = findViewById(R.id.cv_ActAndRules);
        protectedAreasBT = findViewById(R.id.bt_dashboard_protectedAreas);
        licenseBT = findViewById(R.id.bt_dashboard_License);



        humanResourceBT.setOnClickListener(this);
        actAndRulesBT.setOnClickListener(this);
        protectedAreasBT.setOnClickListener(this);
        licenseBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

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
        }
    }
}