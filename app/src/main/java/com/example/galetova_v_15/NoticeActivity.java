package com.example.galetova_v_15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NoticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice);
    }
    public void ArrowBtn(View v){
        Intent intent = new Intent(this, PersonalAreaActivity.class);
        startActivity(intent);
    }
}