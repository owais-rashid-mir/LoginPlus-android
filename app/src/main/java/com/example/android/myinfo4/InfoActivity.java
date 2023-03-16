package com.example.android.myinfo4;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {

    EditText etName;
    EditText etAge;
    EditText etEmail;
    EditText etPhone;
    EditText etRollno;
    EditText etBatch;

    Button btnSubmit;
    Button btnDevDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        etName =  (EditText) findViewById(R.id.etName);
        etAge =  (EditText) findViewById(R.id.etAge);
        etEmail =  (EditText) findViewById(R.id.etEmail);
        etPhone =  (EditText) findViewById(R.id.etPhone);
        etRollno =  (EditText) findViewById(R.id.etRollno);
        etBatch =  (EditText) findViewById(R.id.etBatch);

        btnSubmit  = (Button) findViewById(R.id.btnSubmit);
        btnDevDetails = (Button) findViewById(R.id.btnDevDetails);

        // Button SUBMIT
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String vName = etName.getText().toString();
                String vAge = etAge.getText().toString();
                String vEmail = etEmail.getText().toString();
                String vPhone = etPhone.getText().toString();
                String vRollno = etRollno.getText().toString();
                String vBatch = etBatch.getText().toString();

                Intent i =  new Intent(InfoActivity.this, ShowDetailsActivity.class);

                i.putExtra("myName", etName.getText().toString().trim());
                i.putExtra("myAge", etAge.getText().toString().trim());
                i.putExtra("myEmail", etEmail.getText().toString().trim());
                i.putExtra("myPhone", etPhone.getText().toString().trim());
                i.putExtra("myRollno", etRollno.getText().toString().trim());
                i.putExtra("myBatch", etBatch.getText().toString().trim());


                startActivity(i);
            }
        });


        // Button ABOUT THE DEVELOPER.
        btnDevDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i2 = new Intent(InfoActivity.this , DevDetailsActivity.class);
                startActivity(i2);

            }
        });




    }
}
