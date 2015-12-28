package com.example.park.activitytest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();

        Intent i = getIntent();

        // 값이 없으면 리턴
        if(i == null) return;
        String sMessage = i.getStringExtra("message");
        setTitle(sMessage);

        // 종료 시 필드값을 저장한다.
        i.putExtra("message", "my turn~~");
        setResult(MainActivity.MY_REQUEST, i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
