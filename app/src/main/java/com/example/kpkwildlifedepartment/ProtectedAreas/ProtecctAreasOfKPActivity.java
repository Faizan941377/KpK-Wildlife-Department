package com.example.kpkwildlifedepartment.ProtectedAreas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceForms.EmployeeInitialAppointmentActivity;
import com.example.kpkwildlifedepartment.HumanRecourse.Spinner.AppointmentThrough;
import com.example.kpkwildlifedepartment.ProtectedAreas.Spinners.NationalParkType;
import com.example.kpkwildlifedepartment.R;

import java.util.ArrayList;

public class ProtecctAreasOfKPActivity extends AppCompatActivity implements View.OnClickListener {


    Spinner nationalParkTypeDP;
    ImageButton backBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protecct_areas_of_k_p);

        nationalParkTypeDP = findViewById(R.id.sp_ProtectedAreasOfKp_NationalParkType);
        backBT = findViewById(R.id.iv_ProtectedAreasOfKP_back);

        backBT.setOnClickListener(this);


        NationalParkTypeDropDown();
    }

    private void NationalParkTypeDropDown() {

        ArrayList<NationalParkType> dataList = new ArrayList<>();
        NationalParkType user = new NationalParkType("1", "National Parks");
        NationalParkType user1 = new NationalParkType("1", "WILDLIFE SANCTUARIES");
        NationalParkType user2 = new NationalParkType("1", "WATERFOWL REFUGES");
        NationalParkType user3 = new NationalParkType("1", "WILDLIFE PARKS");
        NationalParkType user4 = new NationalParkType("1", "GAME RESERVES");
        NationalParkType user5 = new NationalParkType("1", "TOTAL PROTECTED AREA");
        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);
        dataList.add(user3);
        dataList.add(user4);
        dataList.add(user5);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        nationalParkTypeDP.setAdapter(arrayAdapter);

        nationalParkTypeDP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                nationalParkTypeDP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(ProtecctAreasOfKPActivity.this, "Please Select your gender!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.iv_ProtectedAreasOfKP_back:
                finish();
                break;
        }
    }
}