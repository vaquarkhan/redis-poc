package com.sp.redisdemo.service;


import com.sp.redisdemo.model.Vehicle;
import com.sp.redisdemo.repository.VehicleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class JedisDemoService implements CommandLineRunner {


    private final VehicleRepository vehicleRepository;

    public JedisDemoService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Vehicle vehicle = new Vehicle();
        vehicle.setColor("Blue");
        vehicle.setModel("BMW");

        vehicleRepository.save(vehicle);
    }
}
