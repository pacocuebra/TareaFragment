package com.pacuebra.petgram.Menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pacuebra.petgram.R;

public class Favoritos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
