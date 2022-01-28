package com.example.kpkwildlifedepartment.Users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.kpkwildlifedepartment.Dashboard.DashboardActivity;
import com.example.kpkwildlifedepartment.Netwrok.RetrofitClient;
import com.example.kpkwildlifedepartment.R;
import com.example.kpkwildlifedepartment.Response.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText emailET;
    EditText passwordET;
    LinearLayout loginBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailET = findViewById(R.id.et_email);
        passwordET = findViewById(R.id.et_password);
        loginBT = findViewById(R.id.bt_login);


        loginBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.bt_login:
                LoginUser();
                break;

        }
    }

    private void LoginUser() {

        String email = emailET.getText().toString().trim();
        String password = passwordET.getText().toString().trim();

        if (emailET.length() == 0) {
            emailET.setError("Please enter email");
        } else if (passwordET.length() == 0) {
            passwordET.setError("Enter your password");
        } else {

            Call<LoginResponse> call = RetrofitClient.getInstance().getApi().loginResponse(email, password);
            call.enqueue(new Callback<LoginResponse>() {
                @Override
                public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                    LoginResponse loginResponse = response.body();
                    if (response.isSuccessful()) {
                        Toast.makeText(LoginActivity.this,loginResponse.getSucceeded(),Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }

                @Override
                public void onFailure(Call<LoginResponse> call, Throwable t) {
                    Toast.makeText(LoginActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }

    }
}