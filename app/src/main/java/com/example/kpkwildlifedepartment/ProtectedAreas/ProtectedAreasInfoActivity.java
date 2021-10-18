package com.example.kpkwildlifedepartment.ProtectedAreas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.kpkwildlifedepartment.R;

public class ProtectedAreasInfoActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView backBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protected_areas_info);

        backBT = findViewById(R.id.iv_ProtectedAreasInfo_back);


        backBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.iv_ProtectedAreasInfo_back:
                finish();
                break;
        }
    }
}