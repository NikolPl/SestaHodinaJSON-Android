package com.example.sestahodina_json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // tohle by vlastně mělo být v asyntasku --> protože v jsonu toho může být kvanta
    //GSON - knihovna od googlu na zracování jsonu - na githubu
    private static String data = "[{\"name\":\"b\",\"image\":\"d\",\"description\":\"f\"},{\"name\":\"b\",\"image\":\"d\",\"description\":\"f\"},{\"name\":\"b\",\"image\":\"d\",\"description\":\"f\"}]";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // nastavujeme výstup
        Type listMovies = new TypeToken<ArrayList<Movie>>() {}.getType();

        // použítí gsonu
        ArrayList <Movie> movies = new Gson().fromJson(data, listMovies); //tohle nám bere data a přvede je na ten arrylist


    }
}
