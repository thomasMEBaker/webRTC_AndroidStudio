package com.shivam.androidwebrtc;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import com.myhexaville.androidwebrtc.R;
import com.shivam.androidwebrtc.tutorial.CompleteActivity;

import pub.devrel.easypermissions.EasyPermissions;

public class LauncherActivity extends AppCompatActivity {
    private static final String TAG = "LauncherActivity";
    private static final int CAPTURE_PERMISSION_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_launch);
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
    }

    public void openSampleSocketActivity(View view) {
        startActivity(new Intent(this, CompleteActivity.class));

    }
}
