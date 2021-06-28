package com.vj.smartcity.network;

import com.vj.smartcity.modelclass.CountryCodeModel;
import com.vj.smartcity.modelclass.FirebaseStatusModel;
import com.vj.smartcity.modelclass.ForgotEmailModel;
import com.vj.smartcity.modelclass.MapSelectionModel;
import com.vj.smartcity.modelclass.NotificationBannerStatus;
import com.vj.smartcity.modelclass.NotifyModelUser;
import com.vj.smartcity.modelclass.PaymentVia;
import com.vj.smartcity.modelclass.VerifyOtp;
import com.vj.smartcity.modelclass.homemodel.MainHomeModel;
import com.vj.smartcity.modelclass.reordermodel.NewReorderModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("forgot_password")
    @FormUrlEncoded
    Call<ForgotEmailModel> getEmailOtp(@Field("user_email") String userEmail,@Field("user_phone") String userPhone);

    @POST("verify_via_firebase")
    @FormUrlEncoded
    Call<VerifyOtp> getVerifyOtpStatus(@Field("status") String status , @Field("user_phone") String userPhone);

    @GET("checkotponoff")
    Call<ForgotEmailModel> getOtpOnOffStatus();

    @GET("pymnt_via")
    Call<PaymentVia> getPaymentVia();

    @POST("notifyby")
    @FormUrlEncoded
    Call<NotifyModelUser> getNotifyUser(@Field("user_id") String userId);

    @GET("mapby")
    Call<MapSelectionModel> getMapSelectionStatus();

    @GET("firebase")
    Call<FirebaseStatusModel> getFirebaseOtpStatus();

    @GET("countrycode")
    Call<CountryCodeModel> getCountryCode();

    @GET("app_notice")
    Call<NotificationBannerStatus> getNotificationBannerStatus();

    @POST("firebase_otp_ver")
    @FormUrlEncoded
    Call<VerifyOtp> getOtpVerifiyStatus(@Field("status") String status , @Field("user_phone") String userPhone);

    @POST("checknum")
    @FormUrlEncoded
    Call<VerifyOtp> checkNumIsRegisterOrNot(@Field("user_phone") String userPhone);

    @POST("homepage")
    @FormUrlEncoded
    Call<MainHomeModel> getMainHomeModel(@Field("lat") String lat , @Field("lng") String lng);

    @POST("checkstock")
    @FormUrlEncoded
    Call<NewReorderModel> getReorderModel(@Field("cart_id") String cart_id);

}
