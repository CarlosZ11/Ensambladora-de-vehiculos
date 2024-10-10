package com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain.factory;

import com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain.Chasis;
import com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain.Cojineria;
import com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain.Motor;

public interface VehiculoFactory {

    Chasis crearChasis();
    Motor crearMotor();
    Cojineria crearCojineria();

}
