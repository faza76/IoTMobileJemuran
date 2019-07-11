package com.example.iotmobilejemuran.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "User")
public class User {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;


    @SerializedName("first_name")
    @ColumnInfo(name = "first_name")
    private String firstName;


    @SerializedName("last_name")
    @ColumnInfo(name = "last_name")
    private String lastName;
}