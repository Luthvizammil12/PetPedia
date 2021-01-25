package com.example.remidi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnAnjing, btnKucing, btnBurung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }

    private void inisialisasiView(){
        btnKucing = findViewById(R.id.btn_buka_ras_kucing);
        btnAnjing = findViewById(R.id.btn_buka_ras_anjing);
        btnBurung = findViewById(R.id.btn_buka_ras_burung);
        btnKucing.setOnClickListener(view -> bukaKucingActivity());
        btnAnjing.setOnClickListener(view -> bukaAnjingActivity());
        btnBurung.setOnClickListener(view -> bukaBurungActivity());
    }

    private void bukaKucingActivity(){
        Log.d("MAIN","Buka activity kucing");
        Intent intent = new Intent(this, KucingActivity.class);
        startActivity(intent);
    }

    private void bukaAnjingActivity(){
        Log.d("MAIN","Buka activity anjing");
        Intent intent = new Intent(this, AnjingActivity.class);
        startActivity(intent);
    }

    private void bukaBurungActivity(){
        Log.d("MAIN","Buka activity burung");
        Intent intent = new Intent(this, BurungActivity.class);
        startActivity(intent);
    }
}