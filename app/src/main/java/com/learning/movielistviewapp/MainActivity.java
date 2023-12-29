package com.learning.movielistviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView list;
    List<movie> movieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieList = new ArrayList<>(); 
        list = findViewById(R.id.ListView);
        movieList.add(new movie("Bajrangi Bhaijaan","Action",2014));
        movieList.add(new movie("Dil De Chuke Sanam", "Romance",1990));
        movieAdapter adapter = new movieAdapter(this, movieList);
        list.setAdapter(adapter);
    }
}