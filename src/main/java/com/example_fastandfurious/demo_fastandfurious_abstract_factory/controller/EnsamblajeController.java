package com.example_fastandfurious.demo_fastandfurious_abstract_factory.controller;

import com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain.Chasis;
import com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain.Cojineria;
import com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain.Motor;
import com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain.Vehiculo;
import com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain.factory.FordFactory;
import com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain.factory.MazdaFactory;
import com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain.factory.ToyotaFactory;
import com.example_fastandfurious.demo_fastandfurious_abstract_factory.domain.factory.VehiculoFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.UUID;

@RestController
@RequestMapping("/ensamblaje")
public class EnsamblajeController {

    @PostMapping("/vehiculo")
    public ResponseEntity<Vehiculo> ensamblarVehiculo(@RequestBody EnsamblajeRequest request) {
        VehiculoFactory factory;
        switch (request.getMarca()) {
            case "Toyota":
                factory = new ToyotaFactory();
                break;
            case "Ford":
                factory = new FordFactory();
                break;
            case "Mazda":
                factory = new MazdaFactory();
                break;
            default:
                return ResponseEntity.badRequest().build();
        }

        Chasis chasis = factory.crearChasis();
        Motor motor = factory.crearMotor();
        Cojineria cojineria = factory.crearCojineria();

        Vehiculo vehiculo = new Vehiculo(
                UUID.randomUUID().toString(),
                request.getMarca(),
                request.getColor(),
                LocalDate.now().toString(),
                chasis, motor, cojineria
        );

        return ResponseEntity.ok(vehiculo);
    }

}
