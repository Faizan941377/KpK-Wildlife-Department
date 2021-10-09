package com.example.kpkwildlifedepartment.Dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceActivity;
import com.example.kpkwildlifedepartment.R;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    CardView humanResourceBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        humanResourceBT = findViewById(R.id.bt_dashboard_HumanResource);



        humanResourceBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.bt_dashboard_HumanResource:
                Intent intent = new Intent(this, HumanResourceActivity.class);
                startActivity(intent);
                break;
        }
    }
}