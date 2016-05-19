package com.ezanetta.databindingexamples;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ezanetta.databindingexamples.Handlers.MainActivityHandlers;
import com.ezanetta.databindingexamples.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setHandlers(new MainActivityHandlers());
    }
}
