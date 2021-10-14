package com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceForms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.kpkwildlifedepartment.HumanRecourse.Spinner.AppointmentThrough;
import com.example.kpkwildlifedepartment.R;

import java.util.ArrayList;

public class EmployeeInitialAppointmentActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton backBT;
    Spinner appointmentThroughDP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_initial_appointment);

        backBT = findViewById(R.id.iv_EmployeeInitialAppointment_back);
        appointmentThroughDP= findViewById(R.id.sp_EmployeeInitialAppointment_AppointmentThrough);


        backBT.setOnClickListener(this);
        AppointmentThroughDropDown();
    }

    private void AppointmentThroughDropDown() {

        ArrayList<AppointmentThrough> dataList = new ArrayList<>();
        AppointmentThrough user = new AppointmentThrough("1","Choose");
        AppointmentThrough user1 = new AppointmentThrough("1","Promotion");
        AppointmentThrough user2 = new AppointmentThrough("1","Direct");
        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        appointmentThroughDP.setAdapter(arrayAdapter);

        appointmentThroughDP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                appointmentThroughDP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(EmployeeInitialAppointmentActivity.this, "Please Select your gender!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_EmployeeInitialAppointment_back:
                finish();
                break;
        }
    }
}