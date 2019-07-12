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


    @SerializedName("name")
    @ColumnInfo(name = "name")
    private String name;

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


    public Jemuran(int id, String name, boolean status, String userId, double latitude, double longitude) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.userId = userId;
        Latitude = latitude;
        Longitude = longitude;
    }

    public Jemuran(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }
}
