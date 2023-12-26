package com.example.galetova_v_15;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button btn = (Button) findViewById(R.id.EnterBtn);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(view.getContext(), PersonalAreaActivity.class);
        startActivity(intent);
    }
}



