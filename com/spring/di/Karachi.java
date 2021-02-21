package com.spring.di;

public class Karachi implements EngineService {

    private HondaService hondaservice;

    public Karachi(HondaService hondaservice){
        this.hondaservice=hondaservice;
    }

    @Override
    public String upgradeEngine() {
        return "Karachi Service "+hondaservice.upgradeEngine();
    }
}
