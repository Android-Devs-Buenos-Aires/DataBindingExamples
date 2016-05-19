package com.ezanetta.databindingexamples;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ezanetta.databindingexamples.Models.Language;
import com.ezanetta.databindingexamples.Adapters.LanguageAdapter;
import com.ezanetta.databindingexamples.Utils.SimpleDividerItemDecoration;
import com.ezanetta.databindingexamples.databinding.ActivityListBindingBinding;

import java.util.ArrayList;
import java.util.List;

public class ListBindingActivity extends AppCompatActivity {

    private List<Language> mLanguages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setupData();

        ActivityListBindingBinding binding = DataBindingUtil
                                            .setContentView(this, R.layout.activity_list_binding);
        RecyclerView recyclerView = binding.recyclerView;

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new LanguageAdapter(mLanguages));
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(this));
    }

    private void setupData(){
        String[] names = getResources().getStringArray(R.array.languages_names);
        String[] logos = getResources().getStringArray(R.array.languages_logos);

        for(int i = 0; i < names.length; i++){
            mLanguages.add(new Language(names[i],logos[i]));
        }
    }
}


