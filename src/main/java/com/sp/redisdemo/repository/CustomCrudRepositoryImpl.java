package com.sp.redisdemo.repository;

import com.sp.redisdemo.model.Vehicle;

public class CustomCrudRepositoryImpl implements CustomCrudRepository {
    @Override
    public void init(Vehicle vehicle) {
        System.out.println(vehicle.toString());
    }
}
