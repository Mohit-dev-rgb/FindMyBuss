package com.example.findmybus;

import android.content.Intent;   // <-- Add this import
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PassengerLoginActivity extends AppCompatActivity {
    EditText inputPhone, inputOtp;
    Button btnSendOtp, btnVerifyOtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_login);

        inputPhone = findViewById(R.id.inputPhone);
        inputOtp = findViewById(R.id.inputOtp);
        btnSendOtp = findViewById(R.id.btnSendOtp);
        btnVerifyOtp = findViewById(R.id.btnVerifyOtp);

        btnSendOtp.setOnClickListener(v ->
                Toast.makeText(this, "OTP Sent (Mock)", Toast.LENGTH_SHORT).show()
        );

        btnVerifyOtp.setOnClickListener(v -> {
            // Mock verification; always success here
            Toast.makeText(this, "OTP Verified!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(PassengerLoginActivity.this, PassengerHomeActivity.class));
        });
    }
}
