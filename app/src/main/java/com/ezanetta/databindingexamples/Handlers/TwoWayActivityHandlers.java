package com.ezanetta.databindingexamples.Handlers;

import android.view.View;

import com.ezanetta.databindingexamples.Models.Time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by ezequielzanetta on 5/16/16.
 */

public class TwoWayActivityHandlers {

    private Time time;

    public TwoWayActivityHandlers(Time time) {
        this.time = time;
    }

    public void onClickGetTime(View view){
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss", Locale.getDefault());
        String current_time = sdf.format(new Date());
        time.setCurrentTime(current_time);
    }
}
