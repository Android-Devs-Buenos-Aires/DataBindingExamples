package com.ezanetta.databindingexamples.Models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.ezanetta.databindingexamples.BR;

/**
 * Created by ezequielzanetta on 5/16/16.
 */
public class Time extends BaseObservable {

    private String currentTime;

    @Bindable
    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
        notifyPropertyChanged(BR.currentTime);
    }
}


