package com.ezanetta.databindingexamples;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ezanetta.databindingexamples.Handlers.MainActivityHandlers;
import com.ezanetta.databindingexamples.databinding.MainLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainLayout binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setHandlers(new MainActivityHandlers());
    }
}

