package com.sp.redisdemo.repository;

import com.sp.redisdemo.model.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, String>, CustomCrudRepository {

}