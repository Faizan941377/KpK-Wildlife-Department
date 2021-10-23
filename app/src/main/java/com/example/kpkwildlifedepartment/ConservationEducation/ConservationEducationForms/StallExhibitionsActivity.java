package com.example.kpkwildlifedepartment.ConservationEducation.ConservationEducationForms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.kpkwildlifedepartment.R;

public class StallExhibitionsActivity extends AppCompatActivity implements View.OnClickListener {


    ImageButton backBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stall_exhibitions);

        backBT = findViewById(R.id.iv_StallExhibition_back);



        backBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.iv_StallExhibition_back:
                finish();
                break;
        }
    }
}