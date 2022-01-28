package com.example.kpkwildlifedepartment.Netwrok;

import com.example.kpkwildlifedepartment.Model.LoginModel;
import com.example.kpkwildlifedepartment.Response.LoginResponse;
import com.example.kpkwildlifedepartment.Response.PersonalInfoResponse;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface WebServices {

    @FormUrlEncoded
    @POST("Home/LoginAction")
    Call<LoginResponse> loginResponse(
            @Field("email") String email,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("Home/BasicHumanResource")
    Call<PersonalInfoResponse> personalInfoResponse();
}
