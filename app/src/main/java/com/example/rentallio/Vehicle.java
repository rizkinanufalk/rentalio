package com.example.rentallio;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "vehicle_table")
public class Vehicle {
    @PrimaryKey(autoGenerate = true)
    private int vehicleId;

    private String category;


    private int price;

    private int priceDriver;

    public Vehicle(String category, int price, int priceDriver) {
        this.category = category;
        this.price = price;
        this.priceDriver = priceDriver;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public int getPriceDriver() {
        return priceDriver;
    }
}
