package com.example.kpkwildlifedepartment.Survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.kpkwildlifedepartment.R;
import com.example.kpkwildlifedepartment.RoadKills.RoadKillsActivity;
import com.example.kpkwildlifedepartment.RoadKills.Spinners.VictimStatus;
import com.example.kpkwildlifedepartment.Survey.Spinners.SexOfSpecie;

import java.util.ArrayList;

public class SurveyActivity extends AppCompatActivity implements View.OnClickListener {


    ImageButton backBT;
    Spinner sexOfSpecieSP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        backBT = findViewById(R.id.iv_ProcurementAndAssets_back);
        sexOfSpecieSP = findViewById(R.id.sp_Survey_sexOfSpecie);




        backBT.setOnClickListener(this);


        SexOfSpecie();
    }

    private void SexOfSpecie() {

        ArrayList<SexOfSpecie> dataList = new ArrayList<>();
        SexOfSpecie user = new SexOfSpecie("1", "Sex of Specie");
        SexOfSpecie user1 = new SexOfSpecie("1", "Male");
        SexOfSpecie user2 = new SexOfSpecie("1", "Female");
        SexOfSpecie user3 = new SexOfSpecie("1", "Other");

        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);
        dataList.add(user3);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sexOfSpecieSP.setAdapter(arrayAdapter);

        sexOfSpecieSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                sexOfSpecieSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(SurveyActivity.this, "Please Select Camp!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.iv_ProcurementAndAssets_back:
                finish();
                break;
        }
    }
}