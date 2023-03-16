package com.example.android.myinfo4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ShowDetailsActivity extends AppCompatActivity {

    TextView tvName2;
    TextView tvAge2;
    TextView tvEmail2;
    TextView tvPhone2;
    TextView tvRollno2;
    TextView tvBatch2;

    Button btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);

        tvName2 = (TextView) findViewById(R.id.tvName2);
        String myName2 =   getIntent().getStringExtra("myName");
        tvName2.setText("Name : " + myName2);

        tvAge2 = (TextView) findViewById(R.id.tvAge2);
        String myAge2 =   getIntent().getStringExtra("myAge");
        tvAge2.setText("Age : " + myAge2);

        tvEmail2 = (TextView) findViewById(R.id.tvEmail2);
        String myEmail2 = getIntent().getStringExtra("myEmail");
        tvEmail2.setText("Email : " + myEmail2);

        tvPhone2 = (TextView) findViewById(R.id.tvPhone2);
        String myPhone2 =   getIntent().getStringExtra("myPhone");
        tvPhone2.setText("Phone : " + myPhone2);

        tvRollno2 = (TextView) findViewById(R.id.tvRollno2);
        String myRollno2 = getIntent().getStringExtra("myRollno");
        tvRollno2.setText("Roll No. : " + myRollno2);

        tvBatch2 = (TextView) findViewById(R.id.tvBatch2);
        String myBatch2 =   getIntent().getStringExtra("myBatch");
        tvBatch2.setText("Batch : " + myBatch2);


        btnBack  = (Button) findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i =  new Intent(ShowDetailsActivity.this, MainActivity.class);
                startActivity(i);
            }
        });


    }
}
