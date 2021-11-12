package com.discitex.nurtaniomobile.database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.MutableLiveData;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.discitex.nurtaniomobile.database.dao.UserDao;
import com.discitex.nurtaniomobile.database.entitas.User;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase sInstance;
    private final MutableLiveData<Boolean> mIsDatabaseCreate = new MutableLiveData<>();

    @VisibleForTesting
    public static final String DATABASE_NAME = "nurtanio_mobile";

    public abstract UserDao userDao();

    private void setDatabaseCreated(){
        mIsDatabaseCreate.postValue(true);
    }

    private void updateDatabaseCreate(final Context context) {
        if (context.getDatabasePath(DATABASE_NAME).exists()) {
            setDatabaseCreated();
        }
    }

    public static AppDatabase buildDatabase(final Context context) {
        return Room.databaseBuilder(context, AppDatabase.class, DATABASE_NAME)
                .addCallback(new Callback() {
                    @Override
                    public void onCreate(@NonNull SupportSQLiteDatabase db) {
                        super.onCreate(db);
                        AppDatabase database = AppDatabase.getInstance(context);
                        database.setDatabaseCreated();
                    }
                }).allowMainThreadQueries().fallbackToDestructiveMigration().build();
    }

    public static AppDatabase getInstance(final Context context){
        if (sInstance == null) {
            synchronized (AppDatabase.class) {
                if (sInstance == null) {
                    sInstance = buildDatabase(context);
                    sInstance.updateDatabaseCreate(context.getApplicationContext());
                }
            }
        }
        return sInstance;
    }

}
