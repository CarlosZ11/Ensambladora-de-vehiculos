package com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain.factory;

import com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain.*;

public class MazdaFactory implements VehiculoFactory{

    @Override
    public Chasis crearChasis() {
        return new ChasisMazda();
    }

    @Override
    public Motor crearMotor() {
        return new MotorMazda();
    }

    @Override
    public Cojineria crearCojineria() {
        return new CojineriaMazda();
    }

}
