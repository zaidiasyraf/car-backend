package com.zaidi.cardatabase.repositorytest;

import com.zaidi.cardatabase.entity.Car;
import com.zaidi.cardatabase.repository.CarRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest
@RunWith(SpringRunner.class)
public class CarRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;
    @Autowired
    private CarRepository carRepository;

    @org.junit.Test
    public void saveCar() {
        Car car = new Car("Tesla", "Model X", "White", "ABC-1234", 2017, 86000);
        testEntityManager.persistAndFlush(car);

        Assertions.assertThat(car.getId()).isNotNull();
    }

    @Test
    public void deleteCars() {
        testEntityManager.persistAndFlush(new Car("Tesla", "Model X", "White",
                "ABC-1234", 2017, 86000));
        testEntityManager.persistAndFlush(new Car("Mini", "Cooper", "Yellow",
                "BWS-3007", 2015, 24500));

        carRepository.deleteAll();
        Assertions.assertThat(carRepository.findAll()).isEmpty();
    }
}
