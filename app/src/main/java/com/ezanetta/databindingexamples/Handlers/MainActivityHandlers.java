package com.ezanetta.databindingexamples.Handlers;

import android.content.Intent;
import android.view.View;

import com.ezanetta.databindingexamples.ListBindingActivity;
import com.ezanetta.databindingexamples.OneWayActivity;
import com.ezanetta.databindingexamples.TwoWayActivity;

/**
 * Created by ezequielzanetta on 5/15/16.
 */
public class MainActivityHandlers {

    public void onClickOneWayBinding(View view){
        Intent intent = new Intent(view.getContext(), OneWayActivity.class);
        view.getContext().startActivity(intent);
    }

    public void onClickTwoWayBinding(View view){
        Intent intent = new Intent(view.getContext(), TwoWayActivity.class);
        view.getContext().startActivity(intent);
    }

    public void onClickListBinding(View view){
        Intent intent = new Intent(view.getContext(), ListBindingActivity.class);
        view.getContext().startActivity(intent);
    }
}
