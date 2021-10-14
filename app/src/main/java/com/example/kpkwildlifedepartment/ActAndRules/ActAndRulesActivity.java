package com.example.kpkwildlifedepartment.ActAndRules;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.kpkwildlifedepartment.R;

public class ActAndRulesActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView actAndRulesIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_and_rules);

        actAndRulesIV = findViewById(R.id.iv_ActAndRules_back);


        actAndRulesIV.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.iv_ActAndRules_back:
                finish();
                break;
        }
    }
}