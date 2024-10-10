package com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain;

public class ChasisMazda implements Chasis{

    @Override
    public String getTipoTransmision() {
        return "Automática";
    }

    @Override
    public int getNumeroEjes() {
        return 2;
    }

    @Override
    public String getNumeroPieza() {
        return "CHM-9876";
    }

}
