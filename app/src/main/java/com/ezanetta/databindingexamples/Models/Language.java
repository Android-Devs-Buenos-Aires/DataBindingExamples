package com.ezanetta.databindingexamples.Models;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by ezequielzanetta on 5/15/16.
 */
public class Language {

    private String name;
    private String logoUrl;

    public Language(String name, String logoUrl) {
        this.name = name;
        this.logoUrl = logoUrl;
    }

    public String getName() {
        return name;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    @BindingAdapter({"bind:imageUrl", "bind:error"})
    public static void loadImage(ImageView view, String url, Drawable error){
        Picasso.with(view.getContext()).load(url).error(error).into(view);
    }
}




