package com.example.callme.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.callme.R;
import com.example.callme.activity.ShowActivity;

public class MainActivity extends AppCompatActivity {

    private EditText et_input;
    private Button btn_submit;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        initUI();
    }

    private void initUI() {
        et_input = findViewById(R.id.et_input);
        btn_submit = findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取输入框中输入的内容
                String input = et_input.getText().toString().trim();
                Intent intent = new Intent(mContext, ShowActivity.class);
                intent.putExtra("show", input);
                startActivity(intent);

                // overridePendingTransition(R.anim.next_in_show_anim, R.anim.next_out_anim);

            }
        });
    }
}
