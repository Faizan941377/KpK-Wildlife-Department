package com.example.kpkwildlifedepartment.Offences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.kpkwildlifedepartment.R;

public class CasesDecidedByCourtActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView backBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cases_decided_by_court);


        backBT = findViewById(R.id.iv_CasesDecidedByCourt_back);



        backBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.iv_CasesDecidedByCourt_back:
                finish();
                break;
        }
    }
}