package com.example.harry.harryandrian_1202150014_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.harry.harryandrian_1202150014_modul3.AirMineral.KoleksiAirMineral;
import com.example.harry.harryandrian_1202150014_modul3.AirMineral.RecyclerAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        RecyclerAdapter adapter=new RecyclerAdapter(this, KoleksiAirMineral.getAirMineral());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
