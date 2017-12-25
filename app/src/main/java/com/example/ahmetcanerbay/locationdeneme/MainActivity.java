package com.example.ahmetcanerbay.locationdeneme;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ahmetcanerbay on 12/25/17.
 */

public class MainActivity extends AppCompatActivity {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
