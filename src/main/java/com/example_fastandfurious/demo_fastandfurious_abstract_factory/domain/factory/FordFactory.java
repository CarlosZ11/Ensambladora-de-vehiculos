package com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain.factory;

import com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain.*;

public class FordFactory implements VehiculoFactory{

    @Override
    public Chasis crearChasis() {
        return new ChasisFord();
    }

    @Override
    public Motor crearMotor() {
        return new MotorFord();
    }

    @Override
    public Cojineria crearCojineria() {
        return new CojineriaFord();
    }

}
