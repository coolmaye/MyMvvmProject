package com.practice.mymvvmproject;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;

import com.practice.mymvvmproject.builder.Human;
import com.practice.mymvvmproject.builder.WomanMaBuilder;
import com.practice.mymvvmproject.databinding.ActivityRecycleBinding;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/7/9.
 */

public class DataBindActivity extends Activity {

    private ActivityRecycleBinding activityRecycleBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityRecycleBinding = DataBindingUtil.setContentView(this, R.layout.activity_recycle);

        ArrayList<DataBindModel> dataBindModels = new ArrayList<>();
        for (int i = 0;i<30;i++){
            DataBindModel dataBindModel = new DataBindModel();
            dataBindModel.setFirstName("这是第"+i+"个条目");
            dataBindModel.setLastName("这是第"+i+"个条目");
            dataBindModels.add(dataBindModel);
        }
        DataBindAdapter dataBindAdapter = new DataBindAdapter(dataBindModels,this);
        activityRecycleBinding.recylerView.setLayoutManager(new LinearLayoutManager(this));
        activityRecycleBinding.recylerView.setAdapter(dataBindAdapter);


        Human create = new WomanMaBuilder().buildFood().buildFrom("法国").buildHobby("篮球").buildSex("女").Create();

        System.out.println(create.getFood()+create.getFrom()+create.getHobby()+create.getSex());


    }


}
