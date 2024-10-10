package com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain;

public class MotorFord implements Motor{

    @Override
    public int getCaballosFuerza() {
        return 200;
    }

    @Override
    public String getNumeroSerie() {
        return "MFR-2222";
    }

}
