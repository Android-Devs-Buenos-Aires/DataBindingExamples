package com.ezanetta.databindingexamples;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ezanetta.databindingexamples.Handlers.TwoWayActivityHandlers;
import com.ezanetta.databindingexamples.Models.Time;
import com.ezanetta.databindingexamples.databinding.ActivityTwoWayBinding;

public class TwoWayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Time time = new Time();

        ActivityTwoWayBinding binding = DataBindingUtil
                                        .setContentView(this, R.layout.activity_two_way);
        binding.setTime(time);
        binding.setHandlers(new TwoWayActivityHandlers(time));

    }
}


