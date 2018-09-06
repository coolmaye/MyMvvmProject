package com.practice.mymvvmproject.builder;

/**
 * Created by Administrator on 2018/7/9.
 */

public class WomanMaBuilder extends HumanBuilder {
    Human womanMa = new WomanMa();
    @Override
    public Human Create() {
        return womanMa;
    }

    @Override
    public WomanMaBuilder buildHobby(String hobby) {
        womanMa.setHobby(hobby);
        return this;
    }

    @Override
    public WomanMaBuilder buildSex(String sex) {
        womanMa.setSex(sex);
        return this;
    }

    @Override
    public WomanMaBuilder buildFrom(String from) {
        womanMa.setFrom(from);
        return this;
    }

    @Override
    public HumanBuilder buildFood() {
        womanMa.setFood();
        return this;
    }
}
