package com.spring.di;

public class HondaService implements  EngineService {

    public HondaService(){
        System.out.println("Honda Constructor");
    }

    @Override
    public String upgradeEngine() {
        return "Honda";
    }
}
