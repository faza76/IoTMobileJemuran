package com.example.iotmobilejemuran.Adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.iotmobilejemuran.Model.Jemuran;
import com.example.iotmobilejemuran.R;

import java.util.ArrayList;

public class Adapter extends  RecyclerView.Adapter<ViewHolder> {
    Context context;
    int id;
    String name;
    ArrayList<Jemuran> listjemur;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.item,viewGroup,false);
        Items item = new Items(row);
        return item;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder,final int i) {
        ((Items)viewHolder).mid.setText(listjemur.get(i).getId());
        ((Items) viewHolder).mname.setText(listjemur.get(i).getName());


        ((Items) viewHolder).parentlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                MANGGA JAK ACTIVITY 2 NYA
//                Intent i = new Intent(MainActivity.this, Activity_Kedua.class);
//                startActivity(i);
            }
        });

        ((Items) viewHolder).parentlayout.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(context);
                dialog.setTitle("Testing");
                dialog.setMessage("Long click");
                dialog.show();
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return listjemur.size();
    }

    public class Items extends RecyclerView.ViewHolder{
        TextView mid;
        TextView mname;
        LinearLayout parentlayout;
        public Items(@NonNull View itemView) {
            super(itemView);
            parentlayout = itemView.findViewById(R.id.parentlayout);
            mid = itemView.findViewById(R.id.textid);
            mname = itemView.findViewById(R.id.textname);
        }
    }
}
