package com.example.iotmobilejemuran.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.iotmobilejemuran.R;

import java.util.Timer;

public class activity_detail_jemuran extends AppCompatActivity {

    TextView id;
    TextView nama;
    TextView status;
    TextView lokasi;
    TextView weather;

    Timer durasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_jemuran);
        Intent intent = getIntent();

        int Id = intent.getIntExtra("id",0);
        String Name = intent.getStringExtra("name");

        id = (TextView) findViewById(R.id.idDetail);
        nama = (TextView) findViewById(R.id.namaDetail);

        id.setText(String.valueOf(Id));
        id.setText(Name);

    }
}
