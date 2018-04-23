package com.example.gabading.jeopardy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class categorySelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_select);
    }

    public void easyFilmPress (View v) {
        Intent intent = new Intent(this, easyFilm.class);
        startActivity(intent);
    }

    public void mediumFilmPress (View v) {
        Intent intent = new Intent(this, medFilm.class);
        startActivity(intent);
    }

    public void hardFilmPress (View v) {
        Intent intent = new Intent(this, hardFilm.class);
        startActivity(intent);
    }

    public void easyGamePress (View v) {
        Intent intent = new Intent(this, easyGame.class);
        startActivity(intent);
    }

    public void mediumGamePress (View v) {
        Intent intent = new Intent(this, medGame.class);
        startActivity(intent);
    }

    public void hardGamePress (View v) {
        Intent intent = new Intent(this, hardGame.class);
        startActivity(intent);
    }

    public void easyMusicPress (View v) {
        Intent intent = new Intent(this, easyMusic.class);
        startActivity(intent);
    }

    public void mediumMusicPress (View v) {
        Intent intent = new Intent(this, medMusic.class);
        startActivity(intent);
    }

    public void hardMusicPress (View v) {
        Intent intent = new Intent(this, hardMusic.class);
        startActivity(intent);
    }
}
