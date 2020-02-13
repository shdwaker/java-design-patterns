package com.jpeony.design.patterns.builder;

public interface CatBuilder {
    void buildHead();

    void buildBody();

    void buildFoot();

    Cat buildCat();
}
