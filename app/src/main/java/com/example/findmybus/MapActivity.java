package com.example.findmybus;

import android.os.Bundle;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private TextView etaText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        etaText = findViewById(R.id.etaText);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapFragment);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Set sample bus location and user location marker
        LatLng busLocation = new LatLng(22.5726, 88.3639); // Kolkata sample
        LatLng userLocation = new LatLng(22.5600, 88.3700);

        mMap.addMarker(new MarkerOptions().position(busLocation).title("Bus Location"));
        mMap.addMarker(new MarkerOptions().position(userLocation).title("Boarding Point"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(busLocation, 13));

        // Set ETA text (mock)
        etaText.setText("Estimated Arrival: 8 min");
    }
}
