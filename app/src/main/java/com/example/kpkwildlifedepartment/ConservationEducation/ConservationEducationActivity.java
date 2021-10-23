package com.example.kpkwildlifedepartment.ConservationEducation;

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

import com.example.kpkwildlifedepartment.ConservationEducation.ConservationEducationForms.CompetitionsActivity;
import com.example.kpkwildlifedepartment.ConservationEducation.ConservationEducationForms.DustbinsActivity;
import com.example.kpkwildlifedepartment.ConservationEducation.ConservationEducationForms.EducationAndAwarenessMaterialActivity;
import com.example.kpkwildlifedepartment.ConservationEducation.ConservationEducationForms.EducationalVideosActivity;
import com.example.kpkwildlifedepartment.ConservationEducation.ConservationEducationForms.GamesActivity;
import com.example.kpkwildlifedepartment.ConservationEducation.ConservationEducationForms.LecturesActivity;
import com.example.kpkwildlifedepartment.ConservationEducation.ConservationEducationForms.NoticeBoardActivity;
import com.example.kpkwildlifedepartment.ConservationEducation.ConservationEducationForms.PublicityBoardsActivity;
import com.example.kpkwildlifedepartment.ConservationEducation.ConservationEducationForms.SchoolNatureClubActivity;
import com.example.kpkwildlifedepartment.ConservationEducation.ConservationEducationForms.StallExhibitionsActivity;
import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceActivity;
import com.example.kpkwildlifedepartment.HumanRecourse.HumanResourceForms.EmployeeTransferActivity;
import com.example.kpkwildlifedepartment.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class ConservationEducationActivity extends AppCompatActivity implements View.OnClickListener {

    CardView dustbinsBT;
    ImageView backBT;
    CardView competitionBT;
    CardView billBoardsBT;
    CardView gamesBT;
    CardView stallExhibitionBT;
    CardView schoolOfNatureBT;
    CardView lecturesBT;
    CardView noticeBoardBT;
    CardView educationAndAwarenessBT;
    CardView educationalVideosBT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conservation_education);

        dustbinsBT = findViewById(R.id.bt_ConservationEducation_dustbins);
        backBT = findViewById(R.id.iv_ConservationEducation_back);
        competitionBT = findViewById(R.id.bt_ConservationEducation_competition);
        billBoardsBT = findViewById(R.id.bt_ConservationEducation_billBoard);
        gamesBT = findViewById(R.id.bt_ConservationEducation_games);
        stallExhibitionBT = findViewById(R.id.bt_ConservationEducation_stallExhibitions);
        schoolOfNatureBT = findViewById(R.id.bt_ConservationEducation_schoolNatureClub);
        lecturesBT = findViewById(R.id.bt_ConservationEducation_Lectures);
        noticeBoardBT = findViewById(R.id.bt_ConservationEducation_noticeBoard);
        educationAndAwarenessBT = findViewById(R.id.bt_ConservationEducation_EducationAndAwareness);
        educationalVideosBT = findViewById(R.id.bt_ConservationEducation_educationalVideos);


        dustbinsBT.setOnClickListener(this);
        backBT.setOnClickListener(this);
        competitionBT.setOnClickListener(this);
        billBoardsBT.setOnClickListener(this);
        gamesBT.setOnClickListener(this);
        stallExhibitionBT.setOnClickListener(this);
        schoolOfNatureBT.setOnClickListener(this);
        lecturesBT.setOnClickListener(this);
        noticeBoardBT.setOnClickListener(this);
        educationAndAwarenessBT.setOnClickListener(this);
        educationalVideosBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.iv_ConservationEducation_back:
                finish();
                break;

            case R.id.bt_ConservationEducation_dustbins:
                AddViewDustbins();
                break;

            case R.id.bt_ConservationEducation_competition:
                AddViewCompetitions();
                break;

            case R.id.bt_ConservationEducation_billBoard:
                AddViewPublicityBoards();
                break;

            case R.id.bt_ConservationEducation_games:
                AddViewGames();
                break;

            case R.id.bt_ConservationEducation_stallExhibitions:
                AddViewStallExhibitions();
                break;

            case R.id.bt_ConservationEducation_schoolNatureClub:
                AddViewSchoolNatureClub();
                break;

            case R.id.bt_ConservationEducation_Lectures:
                AddViewLectures();
                break;

            case R.id.bt_ConservationEducation_noticeBoard:
                AddViewNoticeBoard();
                break;

            case R.id.bt_ConservationEducation_EducationAndAwareness:
                AddViewEducationAwarenessMaterials();
                break;

            case R.id.bt_ConservationEducation_educationalVideos:
                AddViewEducationalVideos();
                break;
        }
    }

    private void AddViewEducationalVideos() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(ConservationEducationActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EducationalVideosActivity.class);
                startActivity(intent);
                Toast.makeText(ConservationEducationActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConservationEducationActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void AddViewEducationAwarenessMaterials() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(ConservationEducationActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EducationAndAwarenessMaterialActivity.class);
                startActivity(intent);
                Toast.makeText(ConservationEducationActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConservationEducationActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void AddViewNoticeBoard() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(ConservationEducationActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NoticeBoardActivity.class);
                startActivity(intent);
                Toast.makeText(ConservationEducationActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConservationEducationActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void AddViewLectures() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(ConservationEducationActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LecturesActivity.class);
                startActivity(intent);
                Toast.makeText(ConservationEducationActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConservationEducationActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void AddViewSchoolNatureClub() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(ConservationEducationActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SchoolNatureClubActivity.class);
                startActivity(intent);
                Toast.makeText(ConservationEducationActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConservationEducationActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void AddViewStallExhibitions() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(ConservationEducationActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), StallExhibitionsActivity.class);
                startActivity(intent);
                Toast.makeText(ConservationEducationActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConservationEducationActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void AddViewGames() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(ConservationEducationActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GamesActivity.class);
                startActivity(intent);
                Toast.makeText(ConservationEducationActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConservationEducationActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void AddViewPublicityBoards() {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(ConservationEducationActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PublicityBoardsActivity.class);
                startActivity(intent);
                Toast.makeText(ConservationEducationActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConservationEducationActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void AddViewCompetitions() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(ConservationEducationActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CompetitionsActivity.class);
                startActivity(intent);
                Toast.makeText(ConservationEducationActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConservationEducationActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }

    private void AddViewDustbins() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(ConservationEducationActivity.this
                , R.style.BottomSheetDialogTheme);

        View bottomSheetView = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.bottom_sheet_layout, (LinearLayout) findViewById(R.id.bottom_sheet_container));
        bottomSheetView.findViewById(R.id.bt_bottom_sheet_enterNewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DustbinsActivity.class);
                startActivity(intent);
                Toast.makeText(ConservationEducationActivity.this, "Add new Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();

        bottomSheetView.findViewById(R.id.bt_bottom_sheet_viewRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConservationEducationActivity.this, "View Record", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }
}