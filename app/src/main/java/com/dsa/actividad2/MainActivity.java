package com.dsa.actividad2;

import android.os.Bundle;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.ImageButton;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnRetro), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btnDashboard1 = findViewById(R.id.btn_dashboard_1);
        ImageButton btnDashboard2 = findViewById(R.id.btn_dashboard_2);
        ImageButton btnDashboard3 = findViewById(R.id.btn_dashboard_3);
        ImageButton btnDashboard4 = findViewById(R.id.btn_dashboard_4);
        ImageButton btnDashboard5 = findViewById(R.id.btn_dashboard_5);
        ImageButton btnDashboard6 = findViewById(R.id.btn_dashboard_6);


        btnDashboard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Craft", Toast.LENGTH_SHORT).show();
                Intent intencion1 = new Intent(MainActivity.this, Craft.class);
                startActivity(intencion1);
            }
        });
        btnDashboard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Jordan Rio", Toast.LENGTH_SHORT).show();
                Intent intencion1 = new Intent(MainActivity.this, jordan_rio.class);
                startActivity(intencion1);
            }
        });
        btnDashboard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Mid", Toast.LENGTH_SHORT).show();
                Intent intencion1 = new Intent(MainActivity.this, Mid.class);
                startActivity(intencion1);
            }
        });
        btnDashboard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Spizike", Toast.LENGTH_SHORT).show();
                Intent intencion1 = new Intent(MainActivity.this, spizike.class);
                startActivity(intencion1);
            }

        });
        btnDashboard5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Retro", Toast.LENGTH_SHORT).show();
                Intent intencion1 = new Intent(MainActivity.this, Retro.class);
                startActivity(intencion1);
            }

        });
        btnDashboard6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Metcom", Toast.LENGTH_SHORT).show();
                Intent intencion1 = new Intent(MainActivity.this, Metcom.class);
                startActivity(intencion1);
            }

        });
    }

    @Override
    public void onClick(View view) {
        Intent intencion1 = new Intent(this, Craft.class);
        startActivity(intencion1);
    }
}