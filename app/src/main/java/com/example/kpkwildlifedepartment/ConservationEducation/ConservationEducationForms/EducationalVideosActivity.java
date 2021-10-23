package com.example.kpkwildlifedepartment.ConservationEducation.ConservationEducationForms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.kpkwildlifedepartment.R;

public class EducationalVideosActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton backBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational_videos);

        backBT = findViewById(R.id.iv_EducationVideos_back);


        backBT.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.iv_EducationVideos_back:
                finish();
                break;
        }
    }
}