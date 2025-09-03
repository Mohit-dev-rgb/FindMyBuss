package com.example.findmybus;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PassengerHomeActivity extends AppCompatActivity {
    EditText inputBoarding, inputDestination;
    Button btnFindBus;
    TextView busInfoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_home);

        inputBoarding = findViewById(R.id.inputBoarding);
        inputDestination = findViewById(R.id.inputDestination);
        btnFindBus = findViewById(R.id.btnFindBus);
        busInfoText = findViewById(R.id.busInfoText);

        btnFindBus.setOnClickListener(v -> {
            // Simple mock Response
            busInfoText.setText("Bus Found! Estimated Arrival: 10 min");
            Toast.makeText(this, "Bus found and info updated (Mock)", Toast.LENGTH_SHORT).show();
            // You can add intent to start Map activity here
        });
    }
}
