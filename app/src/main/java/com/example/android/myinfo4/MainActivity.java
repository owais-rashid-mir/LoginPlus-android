package com.example.android.myinfo4;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText loginName;
    EditText password;
    Button login;
    TextView msg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginName = (EditText)findViewById(R.id.etLoginName);
        password = (EditText)findViewById(R.id.etPassword);
        login = (Button)findViewById(R.id.btnLogin);
        msg = (TextView) findViewById(R.id.tvIncorrectMsg);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginCheck(loginName.getText().toString(), password.getText().toString());
            }
        });
    }

    private void loginCheck(String userLoginName, String userPassword){
        if((userLoginName.equals("owais")) && (userPassword.equals("qwerty"))){
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            startActivity(intent);
        }

        else {
            msg.setText("Incorrect Password. Try Again.");
        }


    }

}