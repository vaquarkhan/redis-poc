package com.sp.redisdemo.service;


import com.sp.redisdemo.model.Vehicle;
import com.sp.redisdemo.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.expression.spel.ast.Literal;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class JedisDemoService implements CommandLineRunner {


    private final VehicleRepository vehicleRepository;

    @Autowired
    public JedisDemoService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Vehicle vehicle = new Vehicle();
        vehicle.setId("Test 2");
        vehicle.setColor("Blue");
        vehicle.setModel("Audi");

        //vehicleRepository.save(vehicle);

        Optional<Vehicle> optionalVehicle = vehicleRepository.findById("Test 2");

        Vehicle result = optionalVehicle.orElse(null);

        if (result == null) {
            System.out.println("no element found");
            return;
        }
        System.out.println(result.toString());
        System.out.println(optionalVehicle.get().toString());


    }
}
