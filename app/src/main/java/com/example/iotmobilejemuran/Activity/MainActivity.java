package com.example.iotmobilejemuran.Activity;

import android.app.DialogFragment;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.iotmobilejemuran.Model.Jemuran;
import com.example.iotmobilejemuran.NewDialog;
import com.example.iotmobilejemuran.R;


public class MainActivity extends AppCompatActivity implements NewDialog.NoticeDialogListener {
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
