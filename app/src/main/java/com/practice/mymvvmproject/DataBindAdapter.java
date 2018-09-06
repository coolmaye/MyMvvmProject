package com.practice.mymvvmproject;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.practice.mymvvmproject.databinding.ItemListBinding;

import java.util.List;

public class DataBindAdapter extends RecyclerView.Adapter<DataBindAdapter.ViewHolder> {

    private List<DataBindModel> listBeen;
    private Context context;

    public DataBindAdapter(List<DataBindModel> listBeen, Context context) {//构造函数要数据跟上下文
        this.listBeen = listBeen;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemListBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_list,
                parent, false);
        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ItemListBinding binding = DataBindingUtil.getBinding(holder.itemView);
        binding.setUser(listBeen.get(position));
        binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return listBeen.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}