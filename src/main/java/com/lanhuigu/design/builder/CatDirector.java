package com.lanhuigu.design.builder;

public class CatDirector {
    public Cat constructCat(CatBuilder cb) {
        cb.buildHead();
        cb.buildBody();
        cb.buildFoot();

        return cb.buildCat();
    }

}
