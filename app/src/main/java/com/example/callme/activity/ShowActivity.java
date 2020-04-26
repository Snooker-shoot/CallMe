package com.example.callme.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.callme.R;

public class ShowActivity extends AppCompatActivity {

    private TextView tv_show;
    private static final String TAG = "ShowActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        //全屏下隐藏状态栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_show);

        initUI();
    }

    private void initUI() {
        tv_show = findViewById(R.id.tv_show);
        tv_show.setSelected(true);
        Intent intent = getIntent();
        String show = intent.getStringExtra("show");

        Log.d(TAG, "initUI: " + show);
        tv_show.setText(show);

    }
}
