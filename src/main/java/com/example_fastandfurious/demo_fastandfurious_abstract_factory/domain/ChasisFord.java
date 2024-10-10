package com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain;

public class ChasisFord implements Chasis{

    @Override
    public String getTipoTransmision() {
        return "Manual";
    }

    @Override
    public int getNumeroEjes() {
        return 2;
    }

    @Override
    public String getNumeroPieza() {
        return "CHF-5678";
    }

}
