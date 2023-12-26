package com.example.galetova_v_15;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class PersonalAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);

    }
    public void BackBtn(View v){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    public void PushBtn(View v){
        Intent intent = new Intent(this, NoticeActivity.class);
        startActivity(intent);
    }
    public void onClickInternet(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.invitro.ru/?utm_medium=cpc&utm_source=yandex&utm_campaign=mg_y_sibir_brand_gen_search&utm_term=инвитро%20официальный%20сайт&utm_content=k50id%7C0100000039841977869_39841977869%7Ccid%7C76199609%7Cgid%7C4966498643%7Caid%7C12532839323%7Cadp%7Cno%7Cpos%7Cpremium1%7Csrc%7Csearch_none%7Cdvc%7Cdesktop%7Cmain&utmstat=us%7Cyandex%7Ccid%7C76199609%7Caid%7C12532839323%7Cgid%7C4966498643%7Cpid%7C39841977869%7Ckeyword%7Cинвитро%20официальный%20сайт%7Cposition_type%7Cpremium%7Csource%7Cnone%7Cregion%7C65%7Cdevice%7Cdesktop&yclid=7975966686934728703"));
        startActivity(intent);
    }
}