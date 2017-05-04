package com.epam.androidlab.first_module;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    private Button sendMessageBtn;
    private EditText enterEmailView;
    private EditText enterSubjectView;
    private EditText enterTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        sendMessageBtn = (Button) findViewById(R.id.btn_send_message);
        sendMessageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                enterEmailView = (EditText) findViewById(R.id.edt_email);
                enterSubjectView = (EditText) findViewById(R.id.edt_subject);
                enterTextView = (EditText) findViewById(R.id.edt_text);

                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {enterEmailView.getText().toString()});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, enterSubjectView.getText().toString());
                emailIntent.putExtra(Intent.EXTRA_TEXT, enterTextView.getText().toString());
                emailIntent.setType("message/rfc822");
                startActivity(Intent.createChooser(emailIntent, "Send Email Via"));
            }
        });

    }
}
