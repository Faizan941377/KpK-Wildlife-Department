package com.example.kpkwildlifedepartment.HumanRecourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.kpkwildlifedepartment.R;

public class HumanResourceActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView backBT;
    CardView personalInfoBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_resource);

        backBT = findViewById(R.id.iv_humanResource_back);
        personalInfoBT = findViewById(R.id.cd_humanResource_personalInfo);


        backBT.setOnClickListener(this);
        personalInfoBT.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.iv_humanResource_back:
                finish();
                break;

            case R.id.cd_humanResource_personalInfo:
                Intent intent = new Intent(this,Personal_InfoActivity.class);
                startActivity(intent);
                break;
        }
    }
}