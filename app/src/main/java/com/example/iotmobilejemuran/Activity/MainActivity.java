package com.example.iotmobilejemuran.Activity;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import com.example.iotmobilejemuran.Model.Jemuran;
import com.example.iotmobilejemuran.R;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] items;
//    FloatingActionButton fab;
    TypedArray img;

    //Drawable[] img;


    ArrayList<Jemuran> listJM = new ArrayList<Jemuran>();;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Drawable draw = getResources().getDrawable(R.drawable.ic_directions_car_black_24dp);

        Jemuran jm = new Jemuran("01","Device 01");
        listJM.add(jm);

//        String[] desc = {"Kendaraan versi darat","Kendaraan versi udara","kendaraan versi sehat","Kendaraan versi hemat"};;
        String[] id = getResources().getStringArray(R.array.id);
        //img = getResources().getDrawable(R.array.gambar,MainActivity.this);
        TypedArray name = getResources().obtainTypedArray(R.array.name);



        recyclerView = findViewById(R.id.Recyview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

//        recyclerView.setAdapter(new Adapter(MainActivity.this,listJM));

//        fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NewDialog dialog = new NewDialog();
//                dialog.show(getSupportFragmentManager(), "Hello");
//            }
//        });


    }

}
