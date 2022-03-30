package com.ty.car.Car_app_boot.carDao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.car.Car_app_boot.Repository.carRepository;
import com.ty.car.Car_app_boot.carDto.Car;

@Repository
public class CarDao {
	
	@Autowired
	carRepository carRepository;
	
	public Car saveCar(Car car) {
		return carRepository.save(car);
	}
	
	public Car getCarById(int id) {
		Optional<Car> optional=carRepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		return optional.get();
	}
	public List<Car> getAllCar(){
		return carRepository.findAll();
	}
	public boolean deleteCarById(int id) {
		Car car = getCarById(id);
		if(car!=null) {
			carRepository.deleteById(id);
			return true;
		}
		return false;
	}
}
