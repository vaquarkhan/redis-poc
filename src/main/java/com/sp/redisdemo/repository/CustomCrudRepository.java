package com.sp.redisdemo.repository;

import com.sp.redisdemo.model.Vehicle;

public interface CustomCrudRepository {
    void init(Vehicle vehicle);
}
