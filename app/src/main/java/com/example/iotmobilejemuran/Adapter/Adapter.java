package com.example.iotmobilejemuran.Adapter;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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

import com.example.iotmobilejemuran.Activity.activity_detail_jemuran;
import com.example.iotmobilejemuran.Model.Jemuran;
import com.example.iotmobilejemuran.R;

import java.util.ArrayList;

public class Adapter extends  RecyclerView.Adapter<ViewHolder> {
    Context context;
    int id;
    String name;
    ArrayList<Jemuran> listjemur;

    public Adapter(Context context, ArrayList<Jemuran> listjemur) {
        this.context = context;
        this.listjemur = listjemur;
    }

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
        ((Items)viewHolder).mid.setText(listjemur.get(i).getUserId());
        ((Items) viewHolder).mname.setText(listjemur.get(i).getName());


        ((Items) viewHolder).parentlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Bundle extras =new Bundle();
//                extras.putInt(listjemur.get(i).getUserId());
//                extras.putString(listjemur.get(i).getName());
//                Intent intent=new Intent(context, activity_detail_jemuran.class);;
//                intent.putExtras(extras);
//                context.startActivity(intent);
                Intent intent = new Intent(context,activity_detail_jemuran.class);
                intent.putExtra("id",listjemur.get(i).getId());
                intent.putExtra("name",listjemur.get(i).getName());
                context.startActivity(intent);
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
