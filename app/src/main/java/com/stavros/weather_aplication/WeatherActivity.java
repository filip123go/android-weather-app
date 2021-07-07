package com.stavros.weather_aplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class WeatherActivity extends AppCompatActivity {


    private TextView cityWeather, temperatureWeather, condition, humidityWeather, maxTemperatureWeather, minTemperatureWeather, pressureWeather, windWeather;
    private ImageView imageViewWeather;
    private Button search;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);


        cityWeather = findViewById(R.id.textViewCityWeather);
        temperatureWeather = findViewById(R.id.textViewTempWeather);
        condition = findViewById(R.id.textViewWeatherConditionWeather);
        humidityWeather = findViewById(R.id.textViewHumidityWeather);
        maxTemperatureWeather = findViewById(R.id.textViewMaxTempWeather);
        minTemperatureWeather = findViewById(R.id.textViewMinTempWeather);
        pressureWeather = findViewById(R.id.textViewPressureWeather);
        windWeather = findViewById(R.id.textViewWindWather);
        imageViewWeather = findViewById(R.id.imageViewWeather);
        search = findViewById(R.id.search);
        editText = findViewById(R.id.editTextCityName);

        search.setOnClickListener(v -> {
            String cityName = editText.getText().toString();
        });

    }
}