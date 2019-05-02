package com.example.myapplication;

import android.arch.persistence.room.Room;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    public static MyAppDatabase myAppDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myAppDatabase = Room.databaseBuilder(getApplicationContext(),
                MyAppDatabase.class, "userdb"
        ).allowMainThreadQueries().build();


        String caminhoBanco = getDatabasePath("userdb").getAbsolutePath();



        fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().
                add(R.id.frameContainer, new homeFragment()).commit();

    }
}
