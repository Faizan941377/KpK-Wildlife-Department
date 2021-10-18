package com.example.kpkwildlifedepartment.ProtectedAreas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.Image;
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

public class ProtectedAreasActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView backBT;
    CardView protectedAreasInfoBT;
    CardView protectedAreasOfKPBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protected_areas);


        backBT = findViewById(R.id.iv_ProtectedAreas_back);
        protectedAreasInfoBT = findViewById(R.id.bt_ProtectedAreas_protectedAreasInfo);
        protectedAreasOfKPBT = findViewById(R.id.bt_ProtectedAreas_protectedAreasKP);


        backBT.setOnClickListener(this);
        protectedAreasInfoBT.setOnClickListener(this);
        protectedAreasOfKPBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.iv_ProtectedAreas_back:
                finish();
                break;

            case R.id.bt_ProtectedAreas_protectedAreasInfo:
                AddViewProtectedAreasInfo();
                break;

            case R.id.bt_ProtectedAreas_protectedAreasKP:
                AddViewProtectedAreasOfKP();
                break;
        }
    }

    private void AddViewProtectedAreasOfKP() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(ProtectedAreasActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProtecctAreasOfKPActivity.class);
                startActivity(intent);
                Toast.makeText(ProtectedAreasActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProtectedAreasActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void AddViewProtectedAreasInfo() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(ProtectedAreasActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProtectedAreasInfoActivity.class);
                startActivity(intent);
                Toast.makeText(ProtectedAreasActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProtectedAreasActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }
}