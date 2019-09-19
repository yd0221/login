package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // TextView를 객체로(변수) 만들고 클릭했을 때 이벤트가 발생하도록 한다.
        TextView registerButton = (TextView) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // 새로운 화면으로 넘어가도록 한다.
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                // 인텐트 실행
                LoginActivity.this.startActivity(registerIntent);
            }
        });
    }
}
