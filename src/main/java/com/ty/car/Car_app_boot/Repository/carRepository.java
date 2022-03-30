package com.ty.car.Car_app_boot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.car.Car_app_boot.carDto.Car;

public interface carRepository extends JpaRepository<Car, Integer> {

}
