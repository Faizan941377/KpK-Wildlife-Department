package com.example.kpkwildlifedepartment.Dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kpkwildlifedepartment.ActAndRules.ActAndRulesActivity;
import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceActivity;
import com.example.kpkwildlifedepartment.R;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    CardView humanResourceBT;
    CardView actAndRulesBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        humanResourceBT = findViewById(R.id.bt_dashboard_HumanResource);
        actAndRulesBT = findViewById(R.id.cv_ActAndRules);



        humanResourceBT.setOnClickListener(this);
        actAndRulesBT.setOnClickListener(this);
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
        }
    }
}