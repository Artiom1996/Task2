package com.epam.androidlab.task2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.epam.androidlab.first_module.FirstActivity;

public class SecondActivity extends AppCompatActivity {

    private Button goToFirstActivityBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        goToFirstActivityBtn = (Button) findViewById(R.id.go_to_first_activity);
        goToFirstActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext() , FirstActivity.class);
                startActivity(intent);
            }
        });
    }
}
