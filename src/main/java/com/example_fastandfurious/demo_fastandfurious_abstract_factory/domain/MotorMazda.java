package com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain;

public class MotorMazda implements Motor{

    @Override
    public int getCaballosFuerza() {
        return 170;
    }

    @Override
    public String getNumeroSerie() {
        return "MMZ-3333";
    }

}
