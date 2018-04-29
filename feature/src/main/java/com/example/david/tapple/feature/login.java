package com.example.david.tapple.feature;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;


@Entity
public class login {

    @PrimaryKey
    public final int id;
    public final String user;
    public final String password;

    public login(int id, String user, String password){
        this.id = id;
        this.user=user;
        this.password=password;
    }


}
