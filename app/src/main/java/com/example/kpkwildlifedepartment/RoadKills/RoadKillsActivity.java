package com.example.kpkwildlifedepartment.RoadKills;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.kpkwildlifedepartment.ProcurementAndAssets.ProcurementAndAssetsActivity;
import com.example.kpkwildlifedepartment.ProcurementAndAssets.Spinners.PaymentMode;
import com.example.kpkwildlifedepartment.R;
import com.example.kpkwildlifedepartment.RoadKills.Spinners.Compensation;
import com.example.kpkwildlifedepartment.RoadKills.Spinners.VictimStatus;

import java.util.ArrayList;

public class RoadKillsActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton backBT;
    Spinner victimStatusSP;
    Spinner compensationSP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_kills);

        victimStatusSP = findViewById(R.id.sp_RoadKills_victimStatus);
        compensationSP = findViewById(R.id.sp_RoadKills_compensation);
        backBT = findViewById(R.id.iv_RoadKills_back);


        backBT.setOnClickListener(this);


        VictimStatus();
        Compensation();
    }

    private void Compensation() {

        ArrayList<Compensation> dataList = new ArrayList<>();
        Compensation user = new Compensation("1", "Compensation");
        Compensation user1 = new Compensation("1", "Yes");
        Compensation user2 = new Compensation("1", "No");

        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        compensationSP.setAdapter(arrayAdapter);

        compensationSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                compensationSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(RoadKillsActivity.this, "Please Select Compensation!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void VictimStatus() {

        ArrayList<VictimStatus> dataList = new ArrayList<>();
        VictimStatus user = new VictimStatus("1", "Victim Status");
        VictimStatus user1 = new VictimStatus("1", "Human Injury");
        VictimStatus user2 = new VictimStatus("1", "Human Died");
        VictimStatus user3 = new VictimStatus("1", "Damage to Crop");
        VictimStatus user4 = new VictimStatus("1", "Cross to Live Stock");

        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);
        dataList.add(user3);
        dataList.add(user4);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        victimStatusSP.setAdapter(arrayAdapter);

        victimStatusSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                victimStatusSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(RoadKillsActivity.this, "Please Select Camp!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.iv_RoadKills_back:
                finish();
                break;
        }
    }
}