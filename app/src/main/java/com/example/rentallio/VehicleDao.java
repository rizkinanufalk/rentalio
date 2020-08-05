package com.example.rentallio;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface VehicleDao {
    @Insert
    void insert(Vehicle vehicle);

    @Query("SELECT * FROM VEHICLE_TABLE")
    LiveData<List<Vehicle>> getVehicle();
}
