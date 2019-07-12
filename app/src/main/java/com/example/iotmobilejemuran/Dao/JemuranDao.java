package com.example.iotmobilejemuran.Dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.iotmobilejemuran.Model.Jemuran;

import java.util.List;

@Dao
public interface JemuranDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Jemuran> items);

    @Query("SELECT * FROM " + "User")
    List<Jemuran> getAll();

}
