package com.dsa.actividad2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.ImageButton;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btnDashboard1 = findViewById(R.id.btn_dashboard_1);
        ImageButton btnDashboard2 = findViewById(R.id.btn_dashboard_2);
        ImageButton btnDashboard3 = findViewById(R.id.btn_dashboard_3);


        btnDashboard1.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Botón 1 presionado", Toast.LENGTH_SHORT).show());
        btnDashboard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Botón 2 presionado",Toast.LENGTH_SHORT).show();
            }
        });
        btnDashboard3.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Botón 3 presionado",Toast.LENGTH_SHORT).show());
    }
}