package com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceForms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.kpkwildlifedepartment.R;

public class HRFamilyInformationActivity extends AppCompatActivity implements View.OnClickListener {


    ImageButton backBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_r_family_information);

        backBT = findViewById(R.id.iv_HRFamilyInformation_back);


        backBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.iv_HRFamilyInformation_back:
                finish();
                break;
        }
    }
}