package com.practice.mymvvmproject.builder;

/**
 * Created by Administrator on 2018/7/9.
 */

public abstract class Human {
    protected String food;
    protected String hobby;
    protected String sex;
    protected String from;

    public Human(){}

    public String getFood() {
        return food;
    }

    public abstract void setFood();

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }


}
