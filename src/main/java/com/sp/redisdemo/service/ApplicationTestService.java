package com.sp.redisdemo.service;


import com.sp.redisdemo.model.Vehicle;
import com.sp.redisdemo.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApplicationTestService implements CommandLineRunner {
    private final VehicleRepository vehicleRepository;

    @Autowired
    public ApplicationTestService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public void run(String... args) {
        String id = "test-model-1";
        String color = "red";
        String model = "x3";

        Vehicle vehicle = new Vehicle();
        vehicle.setId(id);
        vehicle.setColor(color);
        vehicle.setModel(model);


        testVehicleCustomMethods(vehicle);
        setVehicleCache(vehicle);
        getVehicleCacheById(id);
    }

    private void testVehicleCustomMethods(Vehicle vehicle) {
        vehicleRepository.init(vehicle);
    }

    private void setVehicleCache(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    private void getVehicleCacheById(String id) {
        Optional<Vehicle> optionalVehicle = vehicleRepository.findById(id);
        Vehicle result = optionalVehicle.orElse(null);

        if (result == null) {
            System.out.println("no element found");
            return;
        }
        System.out.println(result.toString());
        System.out.println(optionalVehicle.get().toString());
    }
}
