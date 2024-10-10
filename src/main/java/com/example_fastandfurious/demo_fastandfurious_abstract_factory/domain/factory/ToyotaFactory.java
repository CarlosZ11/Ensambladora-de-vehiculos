package com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain.factory;

import com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain.*;

public class ToyotaFactory implements VehiculoFactory{

    @Override
    public Chasis crearChasis() {
        return new ChasisToyota();
    }

    @Override
    public Motor crearMotor() {
        return new MotorToyota();
    }

    @Override
    public Cojineria crearCojineria() {
        return new CojineriaToyota();
    }

}
