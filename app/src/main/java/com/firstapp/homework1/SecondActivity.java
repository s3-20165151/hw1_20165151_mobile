package com.firstapp.homework1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        private EditText id; //아이디
        private EditText password; //비밀번호
        private EditText passwordCheck; //비밀번호확인
        private Button btnDone; //등록
        private Button btnCancel; //취소_돌아가기

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("Second 액티비티");

        btnCancel = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.printf("Back into FirstActivity");
                finish();
            }
        });



    }

}