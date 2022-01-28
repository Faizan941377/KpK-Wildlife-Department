package com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceForms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.kpkwildlifedepartment.HumanRecourse.Spinner.EmployeePromotionBPS;
import com.example.kpkwildlifedepartment.HumanRecourse.Spinner.PositionEmployee;
import com.example.kpkwildlifedepartment.R;

import java.util.ArrayList;

public class Personal_InfoActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView backBT;
    Spinner maritalStatusSP;
    EditText firstNameET;
    EditText lastNameET;
    EditText emailET;
    EditText CNICET;
    EditText addressET;
    EditText cityET;
    Spinner positionEmployeeSP;
    EditText postalCodeET;
    Spinner BPS_SP;
    EditText designationET;
    EditText mobileNumberET;
    EditText officeNumberET;
    EditText dateOfBirthET;
    EditText religionET;
    Spinner GenderSP;
    EditText divisionET;
    EditText maritalStatusET;



    LinearLayout personalInfoBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal__info);

        backBT = findViewById(R.id.iv_personalInfo_back);
        positionEmployeeSP = findViewById(R.id.sp_PersonalInfo);
        BPS_SP = findViewById(R.id.sp_PersonalInfo_BPS);
        GenderSP = findViewById(R.id.sp_PersonalInfo_Gender);
        maritalStatusSP = findViewById(R.id.sp_PersonalInfo_Marital_Status);
        personalInfoBT = findViewById(R.id.bt_PersonalInfo_submit);
        firstNameET = findViewById(R.id.et_personalInfo_firstName);
        lastNameET = findViewById(R.id.et_personalInfo_ListName);
        emailET = findViewById(R.id.et_personalInfo_email);
        CNICET = findViewById(R.id.et_personalInfo_CNIC);
        addressET = findViewById(R.id.et_personalInfo_address);
        cityET = findViewById(R.id.et_personalInfo_city);
        postalCodeET = findViewById(R.id.et_personalInfo_postalCode);
        designationET = findViewById(R.id.et_personalInfo_designation);
        mobileNumberET = findViewById(R.id.et_personalInfo_mobileNumber);
        officeNumberET = findViewById(R.id.et_personalInfo_officeNumber);
        dateOfBirthET = findViewById(R.id.et_personalInfo_dateOfBirth);
        religionET = findViewById(R.id.et_personalInfo_religion);
        divisionET = findViewById(R.id.et_personalInfo_division);


        backBT.setOnClickListener(this);

        Please_Select_Position();
        Select_BPS();
        Select_Gender();
        marital_Status();
    }

    private void marital_Status() {

        ArrayList<EmployeePromotionBPS> dataList = new ArrayList<>();
        EmployeePromotionBPS user = new EmployeePromotionBPS("1", "Choose");
        EmployeePromotionBPS user1 = new EmployeePromotionBPS("1", "Married");
        EmployeePromotionBPS user2 = new EmployeePromotionBPS("1", "Unmarried");

        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        maritalStatusSP.setAdapter(arrayAdapter);

        maritalStatusSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                maritalStatusSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Personal_InfoActivity.this, "Choose", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Select_Gender() {

        ArrayList<EmployeePromotionBPS> dataList = new ArrayList<>();
        EmployeePromotionBPS user = new EmployeePromotionBPS("1", "Select Gender");
        EmployeePromotionBPS user1 = new EmployeePromotionBPS("1", "Male");
        EmployeePromotionBPS user2 = new EmployeePromotionBPS("1", "Female");
        EmployeePromotionBPS user3 = new EmployeePromotionBPS("1", "Other");

        dataList.add(user);
        dataList.add(user1);
        dataList.add(user2);
        dataList.add(user3);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        GenderSP.setAdapter(arrayAdapter);

        GenderSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                GenderSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Personal_InfoActivity.this, "Please Select your Gender", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Select_BPS() {

        ArrayList<EmployeePromotionBPS> dataList = new ArrayList<>();
        EmployeePromotionBPS user = new EmployeePromotionBPS("1", "Select BPS");
        EmployeePromotionBPS user1 = new EmployeePromotionBPS("1", "1");
        EmployeePromotionBPS user2 = new EmployeePromotionBPS("1", "2");
        EmployeePromotionBPS user3 = new EmployeePromotionBPS("1", "3");
        EmployeePromotionBPS user4 = new EmployeePromotionBPS("1", "4");
        EmployeePromotionBPS user5 = new EmployeePromotionBPS("1", "5");
        EmployeePromotionBPS user6 = new EmployeePromotionBPS("1", "6");
        EmployeePromotionBPS user7 = new EmployeePromotionBPS("1", "7");
        EmployeePromotionBPS user8 = new EmployeePromotionBPS("1", "8");
        EmployeePromotionBPS user9 = new EmployeePromotionBPS("1", "9");
        EmployeePromotionBPS user10 = new EmployeePromotionBPS("1", "10");
        EmployeePromotionBPS user11 = new EmployeePromotionBPS("1", "11");
        EmployeePromotionBPS user12 = new EmployeePromotionBPS("1", "12");
        EmployeePromotionBPS user13 = new EmployeePromotionBPS("1", "13");
        EmployeePromotionBPS user14 = new EmployeePromotionBPS("1", "14");
        EmployeePromotionBPS user15 = new EmployeePromotionBPS("1", "15");
        EmployeePromotionBPS user16 = new EmployeePromotionBPS("1", "16");
        EmployeePromotionBPS user17 = new EmployeePromotionBPS("1", "17");
        EmployeePromotionBPS user18 = new EmployeePromotionBPS("1", "18");
        EmployeePromotionBPS user19 = new EmployeePromotionBPS("1", "19");
        EmployeePromotionBPS user20 = new EmployeePromotionBPS("1", "20");
        EmployeePromotionBPS user21 = new EmployeePromotionBPS("1", "21");
        EmployeePromotionBPS user22 = new EmployeePromotionBPS("1", "22");
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
        BPS_SP.setAdapter(arrayAdapter);

        BPS_SP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                BPS_SP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Personal_InfoActivity.this, "Please Select your BPS", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Please_Select_Position() {
        ArrayList<PositionEmployee> dataList = new ArrayList<>();
        PositionEmployee user = new PositionEmployee("1","Please Select Position Employee");
        PositionEmployee user1 = new PositionEmployee("1","Chief Conservator Wildlife ");
        PositionEmployee user2 = new PositionEmployee("1","Conservator Wildlife");
        PositionEmployee user3 = new PositionEmployee("1","DFO Wildlife");
        PositionEmployee user4 = new PositionEmployee("1","SDFO Wildlife");
        PositionEmployee user5 = new PositionEmployee("1","Veterinary Doctor/Officer");
        PositionEmployee user6 = new PositionEmployee("1","PMO");
        PositionEmployee user7 = new PositionEmployee("1","GIS Specialist");
        PositionEmployee user8 = new PositionEmployee("1","Superintendent");
        PositionEmployee user9 = new PositionEmployee("1","Statistical Investigator");
        PositionEmployee user10 = new PositionEmployee("1","Senior Scale Stenographer");
        PositionEmployee user12 = new PositionEmployee("1","Range Officer Wildlife");
        PositionEmployee user13 = new PositionEmployee("1","Assistant");
        PositionEmployee user14 = new PositionEmployee("1","Tourism Coordinator");
        PositionEmployee user15 = new PositionEmployee("1","Social Organizer");
        PositionEmployee user16 = new PositionEmployee("1","Computer Operator");
        PositionEmployee user17 = new PositionEmployee("1","Senior Clerk");
        PositionEmployee user18 = new PositionEmployee("1","Junior Scale Stenographer");
        PositionEmployee user19 = new PositionEmployee("1","Camera Man/Photographer");
        PositionEmployee user20 = new PositionEmployee("1","Taxidermist");
        PositionEmployee user22 = new PositionEmployee("1","Sub-Eng(Civil)");
        PositionEmployee user23 = new PositionEmployee("1","Sub-Eng(Electric)");
        PositionEmployee user24 = new PositionEmployee("1","Junior Clerk");
        PositionEmployee user25 = new PositionEmployee("1","Deputy Range Wildlife");
        PositionEmployee user26 = new PositionEmployee("1","Veterinary Assistant");
        PositionEmployee user27 = new PositionEmployee("1","Stock Assistant");
        PositionEmployee user28 = new PositionEmployee("1","Pheasant Breading Assistant");
        PositionEmployee user29 = new PositionEmployee("1","Field Assistant");
        PositionEmployee user30 = new PositionEmployee("1","Head Watcher");
        PositionEmployee user31 = new PositionEmployee("1","Draftsman");
        PositionEmployee user32 = new PositionEmployee("1","Wildlife Watcher");
        PositionEmployee user33 = new PositionEmployee("1","Painter");
        PositionEmployee user34 = new PositionEmployee("1","Electrician");
        PositionEmployee user35 = new PositionEmployee("1","Masson");
        PositionEmployee user36 = new PositionEmployee("1","Carpenter");
        PositionEmployee user37 = new PositionEmployee("1","Watch & Ward Assistant");
        PositionEmployee user38 = new PositionEmployee("1","Driver");
        PositionEmployee user39 = new PositionEmployee("1","Receptionist");
        PositionEmployee user40 = new PositionEmployee("1","Security Gard(Male)");
        PositionEmployee user41 = new PositionEmployee("1","Security Gard(Female)");
        PositionEmployee user42 = new PositionEmployee("1","Animal Attendant");
        PositionEmployee user43 = new PositionEmployee("1","Boatman");
        PositionEmployee user44 = new PositionEmployee("1","Sweeper");
        PositionEmployee user45 = new PositionEmployee("1","Naib Qasid");
        PositionEmployee user46 = new PositionEmployee("1","Mali");
        PositionEmployee user47 = new PositionEmployee("1","Dak Runner");
        PositionEmployee user48 = new PositionEmployee("1","Crane Keeper");
        PositionEmployee user49 = new PositionEmployee("1","Cook");
        PositionEmployee user50 = new PositionEmployee("1","Wildlife Chokidar");
        PositionEmployee user51 = new PositionEmployee("1","Plumber Sanitary/Worker");
        PositionEmployee user52 = new PositionEmployee("1","Tube Wall Operator");
        PositionEmployee user53 = new PositionEmployee("1","Carpenter / Welder");
        PositionEmployee user54 = new PositionEmployee("1","Animal Keeper Attendant");
        PositionEmployee user55 = new PositionEmployee("1","Bird Keeper Attendant");
        PositionEmployee user56 = new PositionEmployee("1","Helper to Texi Dermist");
        PositionEmployee user57 = new PositionEmployee("1","Sneak Keeper/Sapera");


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
        dataList.add(user12);
        dataList.add(user13);
        dataList.add(user14);
        dataList.add(user15);
        dataList.add(user16);
        dataList.add(user17);
        dataList.add(user18);
        dataList.add(user19);
        dataList.add(user20);
        dataList.add(user22);
        dataList.add(user23);
        dataList.add(user24);
        dataList.add(user25);
        dataList.add(user26);
        dataList.add(user27);
        dataList.add(user28);
        dataList.add(user29);
        dataList.add(user30);
        dataList.add(user31);
        dataList.add(user32);
        dataList.add(user33);
        dataList.add(user34);
        dataList.add(user35);
        dataList.add(user36);
        dataList.add(user37);
        dataList.add(user38);
        dataList.add(user39);
        dataList.add(user40);
        dataList.add(user41);
        dataList.add(user42);
        dataList.add(user43);
        dataList.add(user44);
        dataList.add(user45);
        dataList.add(user46);
        dataList.add(user47);
        dataList.add(user48);
        dataList.add(user49);
        dataList.add(user50);
        dataList.add(user51);
        dataList.add(user52);
        dataList.add(user53);
        dataList.add(user54);
        dataList.add(user55);
        dataList.add(user56);
        dataList.add(user57);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, dataList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        positionEmployeeSP.setAdapter(arrayAdapter);

        positionEmployeeSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                positionEmployeeSP.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Personal_InfoActivity.this, "Please Select Position Employee", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.iv_personalInfo_back:
                finish();
                break;

            case R.id.bt_PersonalInfo_submit:
                SubmitPersonalInfo();
                break;
        }
    }

    private void SubmitPersonalInfo() {

        String firstName = firstNameET.getText().toString().trim();
        String lastName = lastNameET.getText().toString().trim();
        String email = emailET.getText().toString().trim();
        String CNIC = CNICET.getText().toString().trim();
        String address = addressET.getText().toString().trim();
        String city = cityET.getText().toString().trim();
        String positionEmployee = positionEmployeeSP.getSelectedItem().toString();
        String postalCode = postalCodeET.getText().toString().trim();
        String selectBPS = BPS_SP.getSelectedItem().toString();
        String designation = designationET.toString().trim();
        String mobileNumber = mobileNumberET.toString().trim();
        String officeNumber = officeNumberET.toString().trim();
        String dateOfBirth = dateOfBirthET.toString().trim();
        String religion = religionET.toString().trim();
        String gender = GenderSP.getSelectedItem().toString();
        String division = divisionET.toString().trim();
        String maritalStatus = maritalStatusSP.getSelectedItem().toString();



    }
}