package com.pacuebra.petgram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pacuebra.petgram.R;

public class Acerca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
