package com.example.kpkwildlifedepartment.PlanningAndDevelopment;

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
import com.example.kpkwildlifedepartment.PlanningAndDevelopment.Spinners.Allocation;
import com.example.kpkwildlifedepartment.PlanningAndDevelopment.Spinners.ListOfCompletedProjects;
import com.example.kpkwildlifedepartment.PlanningAndDevelopment.Spinners.NatureOfProject;
import com.example.kpkwildlifedepartment.R;

import java.util.ArrayList;

public class PlanningAndDevelopmentActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton backBT;
    Spinner listOfCompletedProjectSP;
    Spinner allocationSP;
    Spinner natureOfProjectSP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planning_and_development);

        backBT = findViewById(R.id.iv_PlanningAndDevelopment_back);
        listOfCompletedProjectSP = findViewById(R.id.sp_PlanningAndDevelopment_listOfCompletedProjects);
        allocationSP = findViewById(R.id.sp_PlanningAndDevelopment_Allocation);
        natureOfProjectSP = findViewById(R.id.sp_PlanningAndDevelopment_NatureOfProject);


        backBT.setOnClickListener(this);

        ListOfCompletedProjects();
        Allocation();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.iv_PlanningAndDevelopment_back:
                finish();
                break;
        }
    }
    private void ListOfCompletedProjects() {
        ArrayList<ListOfCompletedProjects> dataList = new ArrayList<>();
        ListOfCompletedProjects user = new ListOfCompletedProjects("1","Select List");
        ListOfCompletedProjects user1 = new ListOfCompletedProjects("1","Ongoing");
        ListOfCompletedProjects user2 = new ListOfCompletedProjects("1","Complete Project");
        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        listOfCompletedProjectSP.setAdapter(arrayAdapter);

        listOfCompletedProjectSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                listOfCompletedProjectSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(PlanningAndDevelopmentActivity.this, "Please Select your gender!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Allocation() {
        ArrayList<Allocation> dataList = new ArrayList<>();
        Allocation user = new Allocation("1","Select Allocation");
        Allocation user1 = new Allocation("1","ADP");
        Allocation user2 = new Allocation("1","PSDP");
        Allocation user3 = new Allocation("1","AIP");
        Allocation user4 = new Allocation("1","Foreign Aid");
        Allocation user5 = new Allocation("1","Other");
        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);
        dataList.add(user3);
        dataList.add(user4);
        dataList.add(user5);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        allocationSP.setAdapter(arrayAdapter);

        allocationSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                allocationSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(PlanningAndDevelopmentActivity.this, "Please Select your gender!", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void NatureOfProject() {
        ArrayList<NatureOfProject> dataList = new ArrayList<>();
        NatureOfProject user = new NatureOfProject("1","Select Nature of Project");
        NatureOfProject user1 = new NatureOfProject("1","Umbrella");
        NatureOfProject user2 = new NatureOfProject("1","Localization");
        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        natureOfProjectSP.setAdapter(arrayAdapter);

        natureOfProjectSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                natureOfProjectSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(PlanningAndDevelopmentActivity.this, "Please Select your gender!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}