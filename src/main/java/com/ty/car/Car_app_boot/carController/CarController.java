package com.ty.car.Car_app_boot.carController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.car.Car_app_boot.carDto.Car;
import com.ty.car.Car_app_boot.service.CarService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class CarController {
	
	@Autowired
	private CarService carService;

	@ApiOperation(value="save the car details",produces="application/json",consumes="application/json")
	@ApiResponses({
		@ApiResponse(code = 200, message="car saved"),
		@ApiResponse(code = 405, message="bad request,not proper car data")
	})

	@PostMapping("/car")
	public Car saveCar(@RequestBody Car car) {
		return carService.saveCar(car);
	}

	@GetMapping("/car")
	public Car getCarById(int id) {
		return carService.getCarById(id);
	}
}
