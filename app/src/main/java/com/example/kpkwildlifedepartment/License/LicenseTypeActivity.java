package com.example.kpkwildlifedepartment.License;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.kpkwildlifedepartment.License.Spinner.Dealing;
import com.example.kpkwildlifedepartment.License.Spinner.Export;
import com.example.kpkwildlifedepartment.License.Spinner.Import;
import com.example.kpkwildlifedepartment.License.Spinner.Possession;
import com.example.kpkwildlifedepartment.License.Spinner.ShootingLicenseType;
import com.example.kpkwildlifedepartment.License.Spinner.ShootingType;
import com.example.kpkwildlifedepartment.License.Spinner.Trapping;
import com.example.kpkwildlifedepartment.R;

import java.util.ArrayList;

public class LicenseTypeActivity extends AppCompatActivity implements View.OnClickListener {


    Spinner shootingTypeSP;
    Spinner possessionSP;
    Spinner trappingSP;
    Spinner dealingSP;
    Spinner exportSP;
    Spinner importSP;
    Spinner campSP;
    ImageView backBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license_type);

        shootingTypeSP = findViewById(R.id.sp_License_shootingType);
        possessionSP = findViewById(R.id.sp_License_possession);
        trappingSP = findViewById(R.id.sp_License_Trapping);
        dealingSP = findViewById(R.id.sp_License_dealing);
        exportSP = findViewById(R.id.sp_License_export);
        importSP = findViewById(R.id.sp_License_import);
        campSP = findViewById(R.id.sp_License_camp);
        backBT = findViewById(R.id.iv_License_back);


        backBT.setOnClickListener(this);

        ShootingType();
        Possession();
        Trapping();
        Dealing();
        Export();
        Import();
        Camp();
    }

    private void Camp() {
        ArrayList<Import> dataList = new ArrayList<>();
        Import user = new Import("1", "Select Camp");
        Import user1 = new Import("1", "Crane Camp");
        Import user2 = new Import("1", "Crane");

        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        campSP.setAdapter(arrayAdapter);

        campSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                campSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(LicenseTypeActivity.this, "Please Select Camp!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Import() {
        ArrayList<Import> dataList = new ArrayList<>();
        Import user = new Import("1", "Select Export");
        Import user1 = new Import("1", "Black Partidge");
        Import user2 = new Import("1", "Grey Partidge");
        Import user3 = new Import("1", "Quail Partidge");
        Import user4 = new Import("1", "Parrot");
        Import user5 = new Import("1", "Myna");
        Import user6 = new Import("1", "Crane");
        Import user7 = new Import("1", "Pigeon");
        Import user8 = new Import("1", "Dove");

        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);
        dataList.add(user3);
        dataList.add(user4);
        dataList.add(user5);
        dataList.add(user6);
        dataList.add(user7);
        dataList.add(user8);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        importSP.setAdapter(arrayAdapter);

        importSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                importSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(LicenseTypeActivity.this, "Please Select Import!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Export() {
        ArrayList<Export> dataList = new ArrayList<>();
        Export user = new Export("1", "Select Export");
        Export user1 = new Export("1", "Black Partidge");
        Export user2 = new Export("1", "Grey Partidge");
        Export user3 = new Export("1", "Quail Partidge");
        Export user4 = new Export("1", "Parrot");
        Export user5 = new Export("1", "Myna");
        Export user6 = new Export("1", "Crane");
        Export user7 = new Export("1", "Pigeon");
        Export user8 = new Export("1", "Dove");

        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);
        dataList.add(user3);
        dataList.add(user4);
        dataList.add(user5);
        dataList.add(user6);
        dataList.add(user7);
        dataList.add(user8);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        exportSP.setAdapter(arrayAdapter);

        exportSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                exportSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(LicenseTypeActivity.this, "Please Select Export!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Dealing() {
        ArrayList<Dealing> dataList = new ArrayList<>();
        Dealing user = new Dealing("1", "Select Dealing");
        Dealing user1 = new Dealing("1", "Quail Partidge");
        Dealing user2 = new Dealing("1", "Love Birds");
        Dealing user3 = new Dealing("1", "Parrot");
        Dealing user4 = new Dealing("1", "Myna");

        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);
        dataList.add(user3);
        dataList.add(user4);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        dealingSP.setAdapter(arrayAdapter);

        dealingSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                dealingSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(LicenseTypeActivity.this, "Please Select Dealing!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Trapping() {
        ArrayList<Trapping> dataList = new ArrayList<>();
        Trapping user = new Trapping("1", "Select Trapping");
        Trapping user1 = new Trapping("1", "Quail Trapping");
        Trapping user2 = new Trapping("1", "Crane");

        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        trappingSP.setAdapter(arrayAdapter);

        trappingSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                trappingSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(LicenseTypeActivity.this, "Please Select Possession!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Possession() {
        ArrayList<Possession> dataList = new ArrayList<>();
        Possession user = new Possession("1", "Select Possession");
        Possession user1 = new Possession("1", "Black Partidge");
        Possession user2 = new Possession("1", "Grey Partidge");
        Possession user3 = new Possession("1", "Chakor Partidge");
        Possession user4 = new Possession("1", "See - See Partidge");
        Possession user5 = new Possession("1", "Quail Partidge");
        Possession user6 = new Possession("1", "Crane Partidge");
        Possession user7 = new Possession("1", "Pointer Dog");

        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);
        dataList.add(user3);
        dataList.add(user4);
        dataList.add(user5);
        dataList.add(user6);
        dataList.add(user7);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        possessionSP.setAdapter(arrayAdapter);

        possessionSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                possessionSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(LicenseTypeActivity.this, "Please Select Possession!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void ShootingType() {

        ArrayList<ShootingType> dataList = new ArrayList<>();
        ShootingType user = new ShootingType("1", "Select Shooting Type");
        ShootingType user1 = new ShootingType("1", "Small Game Shooting");
        ShootingType user2 = new ShootingType("1", "Big Game Shooting");

        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        shootingTypeSP.setAdapter(arrayAdapter);

        shootingTypeSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                shootingTypeSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(LicenseTypeActivity.this, "Please Select Shooting Type!", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.iv_License_back:
                finish();
                break;
        }
    }
}