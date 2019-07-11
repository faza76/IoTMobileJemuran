package com.example.iotmobilejemuran.Model;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "User")
public class Jemuran {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;

    @SerializedName("status")
    @ColumnInfo(name = "status")
    private boolean status;

    @SerializedName("user_id")
    @ColumnInfo(name = "user_id")
    private String userId;

    @SerializedName("latitude")
    @ColumnInfo(name = "latitude")
    private double Latitude;

    @SerializedName("longitude")
    @ColumnInfo(name = "longitude")
    private double Longitude;

}
