package com.example.findmybus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnPassenger, btnDriver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassenger = findViewById(R.id.btnPassenger);
        btnDriver = findViewById(R.id.btnDriver);

        btnPassenger.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, PassengerLoginActivity.class))
        );
        btnDriver.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, DriverProfileActivity.class))
        );
    }
}


