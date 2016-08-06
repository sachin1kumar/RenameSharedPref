package com.example.sachin.renamesharedpref;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createSharedPref1();
        createSharedPref2();
        createSharedPref3();
        renameSharedPref();

    }

    public void createSharedPref1() {

        SharedPreferences sharedPreferences = getSharedPreferences("Sachin1", MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name", "sachin");
        editor.commit();

    }

    public void createSharedPref2() {

        SharedPreferences sharedPreferences = getSharedPreferences("Sachin2", MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name", "sachin");
        editor.commit();

    }

    public void createSharedPref3() {

        SharedPreferences sharedPreferences = getSharedPreferences("Sachin3", MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name", "sachin");
        editor.commit();

    }

    public void renameSharedPref() {

        String path = "/data/data/com.example.sachin.renamesharedpref/shared_prefs/";
        String fileName = "";

        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        int lastPeriodPos = 0;

        for (int i = 0; i < listOfFiles.length; i++) {

            fileName = listOfFiles[i].getName();
            lastPeriodPos = fileName.lastIndexOf('.');
            if (lastPeriodPos > 0)
                fileName = fileName.substring(0, lastPeriodPos);
            File f = new File(path+fileName+".xml");
            f.renameTo(new File(path+fileName+"_kumar"+".xml"));

        }

    }


}
