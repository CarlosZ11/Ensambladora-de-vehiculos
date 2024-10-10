package com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain;

public class MotorToyota implements Motor{

    @Override
    public int getCaballosFuerza() {
        return 180;
    }

    @Override
    public String getNumeroSerie() {
        return "MTY-1111";
    }

}
