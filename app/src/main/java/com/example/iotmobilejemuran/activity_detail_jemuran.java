package com.example.iotmobilejemuran;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

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

    }
}
