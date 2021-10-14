package com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceForms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.kpkwildlifedepartment.HumanRecourse.Spinner.EmployeeServiceHistoryBPS;
import com.example.kpkwildlifedepartment.R;

import java.util.ArrayList;

public class EmployeeTransferActivity extends AppCompatActivity implements View.OnClickListener {


    ImageButton backBT;
    Spinner employeePromotionBPS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_transfer);

        employeePromotionBPS = findViewById(R.id.sp_EmployeePromotions_BPS);
        backBT = findViewById(R.id.iv_EmployeeTransfer_back);


        backBT.setOnClickListener(this);


        EmployeePromotionBPS();
    }

    private void EmployeePromotionBPS() {

        ArrayList<EmployeeServiceHistoryBPS> dataList = new ArrayList<>();
        EmployeeServiceHistoryBPS user = new EmployeeServiceHistoryBPS("1", "Select BPS");
        EmployeeServiceHistoryBPS user1 = new EmployeeServiceHistoryBPS("1", "1");
        EmployeeServiceHistoryBPS user2 = new EmployeeServiceHistoryBPS("1", "2");
        EmployeeServiceHistoryBPS user3 = new EmployeeServiceHistoryBPS("1", "3");
        EmployeeServiceHistoryBPS user4 = new EmployeeServiceHistoryBPS("1", "4");
        EmployeeServiceHistoryBPS user5 = new EmployeeServiceHistoryBPS("1", "5");
        EmployeeServiceHistoryBPS user6 = new EmployeeServiceHistoryBPS("1", "6");
        EmployeeServiceHistoryBPS user7 = new EmployeeServiceHistoryBPS("1", "7");
        EmployeeServiceHistoryBPS user8 = new EmployeeServiceHistoryBPS("1", "8");
        EmployeeServiceHistoryBPS user9 = new EmployeeServiceHistoryBPS("1", "9");
        EmployeeServiceHistoryBPS user10 = new EmployeeServiceHistoryBPS("1", "10");
        EmployeeServiceHistoryBPS user11 = new EmployeeServiceHistoryBPS("1", "11");
        EmployeeServiceHistoryBPS user12 = new EmployeeServiceHistoryBPS("1", "12");
        EmployeeServiceHistoryBPS user13 = new EmployeeServiceHistoryBPS("1", "13");
        EmployeeServiceHistoryBPS user14 = new EmployeeServiceHistoryBPS("1", "14");
        EmployeeServiceHistoryBPS user15 = new EmployeeServiceHistoryBPS("1", "15");
        EmployeeServiceHistoryBPS user16 = new EmployeeServiceHistoryBPS("1", "16");
        EmployeeServiceHistoryBPS user17 = new EmployeeServiceHistoryBPS("1", "17");
        EmployeeServiceHistoryBPS user18 = new EmployeeServiceHistoryBPS("1", "18");
        EmployeeServiceHistoryBPS user19 = new EmployeeServiceHistoryBPS("1", "19");
        EmployeeServiceHistoryBPS user20 = new EmployeeServiceHistoryBPS("1", "20");
        EmployeeServiceHistoryBPS user21 = new EmployeeServiceHistoryBPS("1", "21");
        EmployeeServiceHistoryBPS user22 = new EmployeeServiceHistoryBPS("1", "22");
        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);
        dataList.add(user3);
        dataList.add(user4);
        dataList.add(user5);
        dataList.add(user6);
        dataList.add(user7);
        dataList.add(user8);
        dataList.add(user9);
        dataList.add(user10);
        dataList.add(user11);
        dataList.add(user12);
        dataList.add(user13);
        dataList.add(user14);
        dataList.add(user15);
        dataList.add(user16);
        dataList.add(user17);
        dataList.add(user18);
        dataList.add(user19);
        dataList.add(user20);
        dataList.add(user21);
        dataList.add(user22);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        employeePromotionBPS.setAdapter(arrayAdapter);

        employeePromotionBPS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                employeePromotionBPS.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(EmployeeTransferActivity.this, "Please Select your BPS!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.iv_EmployeeTransfer_back:
                finish();
                break;
        }
    }
}