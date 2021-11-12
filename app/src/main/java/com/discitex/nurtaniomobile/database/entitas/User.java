package com.discitex.nurtaniomobile.database.entitas;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "nama")
    public  String fullName;

    public String email;
}
