package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Array Of Strings

    String[] carArray = {"Maruti Esteem", "Fiat", "Ford EcoSport", "Ford Figo", "toyota", "fortuner", "Mercedes", "Ferrari", "bolero", "Scorpio", "mahindra", "Qualis", "Honda amaze", "KIa Somet", "Kia seltoz", "Mahindra xuv700", "Mahindra Thar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter carAdapter = new ArrayAdapter<String>(this, R.layout.car_label, carArray);

        ListView carList = (ListView)findViewById(R.id.list);
        carList.setAdapter(carAdapter);
    }
}