package com.example.kpkwildlifedepartment.Offences;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceActivity;
import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceForms.EmployeeTransferActivity;
import com.example.kpkwildlifedepartment.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class OffencesActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView backBT;
    CardView offenceFormBT;
    CardView casesDecidedByCourtBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offences);

        backBT = findViewById(R.id.iv_Offences_back);
        offenceFormBT = findViewById(R.id.bt_Offences_offenceForm);
        casesDecidedByCourtBT = findViewById(R.id.bt_Offences_CasesDecidedByCourt);


        backBT.setOnClickListener(this);
        offenceFormBT.setOnClickListener(this);
        casesDecidedByCourtBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.iv_Offences_back:
                finish();
                break;

            case R.id.bt_Offences_offenceForm:
                AddViewOffenceForm();
                break;

            case R.id.bt_Offences_CasesDecidedByCourt:
               AddViewCasesDecidedByCourt();
                break;
        }
    }

    private void AddViewCasesDecidedByCourt() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(OffencesActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CasesDecidedByCourtActivity.class);
                startActivity(intent);
                Toast.makeText(OffencesActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OffencesActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void AddViewOffenceForm() {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(OffencesActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OffenseFormActivity.class);
                startActivity(intent);
                Toast.makeText(OffencesActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OffencesActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }
}