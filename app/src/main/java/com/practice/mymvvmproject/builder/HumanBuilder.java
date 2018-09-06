package com.practice.mymvvmproject.builder;

/**
 * Created by Administrator on 2018/7/9.
 */

public abstract class HumanBuilder {
    public abstract Human Create();
    public abstract HumanBuilder buildHobby(String hobby);
    public abstract HumanBuilder buildSex(String sex);
    public abstract HumanBuilder buildFrom(String from);
    public abstract HumanBuilder buildFood();
}
