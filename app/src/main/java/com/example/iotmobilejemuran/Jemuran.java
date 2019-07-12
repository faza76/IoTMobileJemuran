package com.example.iotmobilejemuran;

public class Jemuran {
    private int id;
    private String name;
    private boolean status;
    private String userId;
    private Location lokasi;
    private Weather weather;

    public Jemuran(int id, String name) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.userId = userId;
        this.lokasi = lokasi;
        this.weather = weather;
    }

    public Jemuran(int id, String name, boolean status, String userId, Location lokasi, Weather weather)
    {
        this.id = id;
        this.name = name;
        this.status = status;
        this.userId = userId;
        this.lokasi = lokasi;
        this.weather = weather;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Location getLokasi() {
        return lokasi;
    }

    public void setLokasi(Location lokasi) {
        this.lokasi = lokasi;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
