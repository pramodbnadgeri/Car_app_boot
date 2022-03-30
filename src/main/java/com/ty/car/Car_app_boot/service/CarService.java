package com.ty.car.Car_app_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.car.Car_app_boot.carDao.CarDao;
import com.ty.car.Car_app_boot.carDto.Car;
import com.ty.car.Car_app_boot.exception.NoIdFoundException;

@Service
public class CarService {

	@Autowired
	private CarDao carDao;

	public Car saveCar(Car car) {
		return carDao.saveCar(car);
	}
	
	public Car getCarById(int id) {
		Car car=carDao.getCarById(id);
		if(car==null) {
			throw new NoIdFoundException("given id : "+ id+"  does not exist");
		}
		return car;
	}

}
