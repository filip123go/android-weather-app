package com.stavros.weather_aplication;

import com.stavros.weather_aplication.model.OpenWeathwerMap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherAPI {


    @GET("weather?appid=&units=metric")
    Call<OpenWeathwerMap> getWeatherWithLocation(@Query("lat") double lat, @Query("lon") double lon);

    @GET("weather?appid=&units=metric")
    Call<OpenWeathwerMap> getWeatherWithCityName(@Query("q") String name);

}
