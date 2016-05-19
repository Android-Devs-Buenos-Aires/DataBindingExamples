package com.ezanetta.databindingexamples.Adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.ezanetta.databindingexamples.Models.Language;
import com.ezanetta.databindingexamples.R;
import com.ezanetta.databindingexamples.databinding.LanguageItemBinding;

import java.util.List;

/**
 * Created by ezequielzanetta on 5/18/16.
 */
public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.LanguageVH>{

    private List<Language> mLanguages;

    public LanguageAdapter(List<Language> languages) {
        this.mLanguages = languages;
    }

    @Override
    public LanguageVH onCreateViewHolder(ViewGroup parent, int viewType) {
        LanguageItemBinding binding = DataBindingUtil
                                        .inflate(LayoutInflater.from(parent.getContext()),
                                                R.layout.language_item, parent, false);

        return new LanguageVH(binding);
    }

    @Override
    public void onBindViewHolder(LanguageVH holder, int position) {
        holder.bindConnection(mLanguages.get(position));
    }

    @Override
    public int getItemCount() {
        return mLanguages.size();
    }

    public class LanguageVH extends RecyclerView.ViewHolder{

        private LanguageItemBinding mBinding;

        public LanguageVH(LanguageItemBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }

        public void bindConnection(Language language){
            mBinding.setLanguage(language);
        }
    }
}

