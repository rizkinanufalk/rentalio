package com.example.rentallio;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = Vehicle.class, version = 1, exportSchema = false)
public abstract class VehicleDatabase extends RoomDatabase {
    private static VehicleDatabase instance;
    public abstract VehicleDao vehicleDao();
    public static synchronized VehicleDatabase getInstance(Context context){
        if (instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(), VehicleDatabase.class, "vehicle_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build();
        }
        return instance;
    }

    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsynctask(instance).execute();
        }
    };

    private static class PopulateDbAsynctask extends AsyncTask<Void, Void, Void>{
        private VehicleDao vehicleDao;

        private PopulateDbAsynctask(VehicleDatabase db){
            vehicleDao = db.vehicleDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            vehicleDao.insert(new Vehicle("City", 300000, 400000));
            vehicleDao.insert(new Vehicle("Suv", 450000, 550000));
            vehicleDao.insert(new Vehicle("Mpv", 350000,450000));
            return null;
        }
    }
}
