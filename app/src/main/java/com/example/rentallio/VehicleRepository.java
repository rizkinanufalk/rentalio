package com.example.rentallio;

import android.app.Application;
import android.os.AsyncTask;

import java.util.List;

import androidx.lifecycle.LiveData;

public class VehicleRepository {
    private VehicleDao vehicleDao;
    private LiveData<List<Vehicle>> allVehicle;

    public VehicleRepository(Application application){
        VehicleDatabase vehicleDb = VehicleDatabase.getInstance(application);
        vehicleDao = vehicleDb.vehicleDao();
        allVehicle = vehicleDao.getVehicle();
    }

    public void insert(Vehicle vehicle){
        new InsertNoteAsyncTask(vehicleDao).execute(vehicle);
    }

    public LiveData<List<Vehicle>> getVehicle() {
        return allVehicle;
    }

    private static class InsertNoteAsyncTask extends AsyncTask<Vehicle, Void, Void> {
        private VehicleDao vehicleDao;

        private InsertNoteAsyncTask(VehicleDao vehicleDao){
            this.vehicleDao = vehicleDao;
        }

        @Override
        protected Void doInBackground(Vehicle... vehicles) {
            return null;
        }
    }
}
