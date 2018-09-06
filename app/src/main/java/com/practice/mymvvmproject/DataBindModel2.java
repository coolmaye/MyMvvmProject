package com.practice.mymvvmproject;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

/**
 * Created by Administrator on 2018/7/9.
 */

public class DataBindModel2 extends BaseObservable{
    public ObservableField<String> firstName = new ObservableField<>();
    public ObservableField<String> lastName = new ObservableField<>();
}
