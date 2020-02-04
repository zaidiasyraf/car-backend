package com.zaidi.cardatabase.controller;

import com.zaidi.cardatabase.entity.Car;
import com.zaidi.cardatabase.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public Iterable<Car> getAllCars() {
        return carRepository.findAll();
    }
}
