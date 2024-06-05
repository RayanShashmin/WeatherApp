package com.example.e2145348_weatherapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherSupport {
    @GET("weather")
    Call<WeatherStatus> getCurrentWeather(@Query("lat") double lat, @Query("lon") double lon, @Query("appid") String appid, @Query("units") String units);
}
