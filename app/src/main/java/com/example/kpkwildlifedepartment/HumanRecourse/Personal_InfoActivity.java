package com.example.kpkwildlifedepartment.HumanRecourse;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.kpkwildlifedepartment.R;

public class Personal_InfoActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView backBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal__info);

        backBT = findViewById(R.id.iv_personalInfo_back);


        backBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.iv_personalInfo_back:
                finish();
                break;
        }
    }
}