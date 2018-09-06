package com.practice.mymvvmproject;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public class BindingHolder extends RecyclerView.ViewHolder {
    private DataBindModel binding;

    public BindingHolder(View itemView) {
        super(itemView);
    }

    public DataBindModel getBinding() {
        return binding;
    }

    public void setBinding(DataBindModel binding) {
        this.binding = binding;
    }
}