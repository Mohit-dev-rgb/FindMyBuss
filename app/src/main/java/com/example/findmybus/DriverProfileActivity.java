package com.example.findmybus;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DriverProfileActivity extends AppCompatActivity {
    EditText inputFullName, inputAadhar, inputPan, inputVoterId, inputLicense;
    Button btnUploadDocs, btnSubmitProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_profile);

        inputFullName = findViewById(R.id.inputFullName);
        inputAadhar = findViewById(R.id.inputAadhar);
        inputPan = findViewById(R.id.inputPan);
        inputVoterId = findViewById(R.id.inputVoterId);
        inputLicense = findViewById(R.id.inputLicense);

        btnUploadDocs = findViewById(R.id.btnUploadDocs);
        btnSubmitProfile = findViewById(R.id.btnSubmitProfile);

        btnUploadDocs.setOnClickListener(v ->
                Toast.makeText(this, "Documents Uploaded (Mock)", Toast.LENGTH_SHORT).show()
        );

        btnSubmitProfile.setOnClickListener(v -> {
            // Mock verification here
            Toast.makeText(this, "Profile Submitted for Verification!", Toast.LENGTH_SHORT).show();
            // You can add intent to start Driver dashboard/map
        });
    }
}
