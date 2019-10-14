package com.firstapp.homework1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("Second 액티비티");

        Button btnCancel = (Button) findViewById(R.id.btnReturn);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.printf("Back into FirstActivity");
                finish();
            }
        });



    }

}