package com.example.ahmetcanerbay.locationdeneme;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ahmetcanerbay on 12/25/17.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button signUpButton;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        initViews();
    }


    private void initViews() {
        Button loginButton = findViewById(R.id.login_button);
        signUpButton = findViewById(R.id.sign_up_button);
        loginButton.setOnClickListener(this);
        signUpButton.setOnClickListener(this);
        permissionRequest();
    }

    private void permissionRequest() {
        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.ACCESS_COARSE_LOCATION,
                        Manifest.permission.ACCESS_FINE_LOCATION},
                2);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sign_up_button:

                break;
            case R.id.login_button:
                Intent intent = new Intent(this, MapsActivity.class);
                System.out.println("zaaaaaaa");
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case 2: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    System.out.println("ahmetcan1 " + "access granted");
                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.

                } else {
                    System.out.println("ahmetcan2 " + "access denied");
                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
                return;
            }
        }
    }
}
