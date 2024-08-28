package com.dsa.actividad2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class spizike extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spizike);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnRetro), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnspizike = findViewById(R.id.btnspizike);
        btnspizike.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intencion1 =new Intent(this,MainActivity.class);
        startActivity(intencion1);
    }
}