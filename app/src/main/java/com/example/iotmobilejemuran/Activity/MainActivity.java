package com.example.iotmobilejemuran.Activity;

import android.app.DialogFragment;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.iotmobilejemuran.Adapter.Adapter;
import com.example.iotmobilejemuran.Model.Jemuran;
import com.example.iotmobilejemuran.NewDialog;
import com.example.iotmobilejemuran.R;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements NewDialog.NoticeDialogListener {

    FloatingActionButton fab;

    RecyclerView recyclerView;
    String[] items;

    ArrayList<Jemuran> list_jemuran = new ArrayList<Jemuran>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Jemuran jm = new Jemuran(1,"Device",true,"faza",2,3);
        Jemuran jm2 = new Jemuran(2,"DeviceA",true,"fazaa",3,9);


        list_jemuran.add(jm);
        list_jemuran.add(jm2);

        recyclerView = findViewById(R.id.Recyview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        recyclerView.setAdapter(new Adapter(MainActivity.this,list_jemuran));



        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewDialog dialog = new NewDialog();
                dialog.show(getFragmentManager(),"Hello");
            }
        });
    }



    @Override
    public void onDialogPositiveClick(DialogFragment fragment, Jemuran jemur) {

    }
}
