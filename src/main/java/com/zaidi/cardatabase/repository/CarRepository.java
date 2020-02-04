package com.zaidi.cardatabase.repository;

import com.zaidi.cardatabase.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Long> {

    // Get list of car by brand
    List<Car> findByBrand(String brand);

    // Get list of car by color
    List<Car> findByColor(String color);

    // Get list of car by year
    List<Car> findByYear(int year);

    // Get list of car by brand and model
    List<Car> findByBrandAndModel(String brand, String model);

    // Get list of car by brand or color
    List<Car> findByBrandOrModel(String brand, String model);

    // Get list of car by brand and sort by year
    List<Car> findByBrandOrderByYearAsc(String brand);

    // Get list of car by brand using sql
    @Query("select c from Car c where c.brand = ?1")
    List<Car> findByBrandSql(String brand);

    // Get list of car by brand using advanvaced sql
    @Query("select c from Car c where c.brand like %?1")
    List<Car> findByBrandEndsWithSqlAdvance(String brand);
}
