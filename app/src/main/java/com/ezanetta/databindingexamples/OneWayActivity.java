package com.ezanetta.databindingexamples;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ezanetta.databindingexamples.Models.Language;
import com.ezanetta.databindingexamples.databinding.ActivityOneWayBinding;

public class OneWayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Language language = new Language("Kotlin", "http://i.imgur.com/qwwjdjZ.png");

        ActivityOneWayBinding binding = DataBindingUtil
                                            .setContentView(this, R.layout.activity_one_way);
        binding.setLanguage(language);
    }
}


