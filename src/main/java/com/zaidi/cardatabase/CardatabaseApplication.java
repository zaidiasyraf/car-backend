package com.zaidi.cardatabase;

import com.zaidi.cardatabase.entity.Car;
import com.zaidi.cardatabase.entity.Owner;
import com.zaidi.cardatabase.entity.User;
import com.zaidi.cardatabase.repository.CarRepository;
import com.zaidi.cardatabase.repository.OwnerRepository;
import com.zaidi.cardatabase.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CardatabaseApplication {
	@Autowired
	private CarRepository carRepository;
	@Autowired
	private OwnerRepository ownerRepository;
	@Autowired
	private UserRepository userRepository;

	private static final Logger LOGGER = LoggerFactory.getLogger(CardatabaseApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
		LOGGER.info("Hai Spring Boot!");
	}


	@Bean
	CommandLineRunner runner() {
		return args -> {
			// Save demo data to database
			// Add owner objects and save these to db
			Owner owner1 = new Owner("John" , "Johnson");
			Owner owner2 = new Owner("Mary" , "Robinson");
			ownerRepository.save(owner1);
			ownerRepository.save(owner2);

			// Add car object with link to owners and save these to db.
			Car car = new Car("Ford", "Mustang", "Red",
					"ADF-1121", 2017, 59000, owner1);
			carRepository.save(car);
			car = new Car("Nissan", "Leaf", "White",
					"SSJ-3002", 2014, 29000, owner2);
			carRepository.save(car);
			car = new Car("Toyota", "Prius", "Silver",
					"KKO-0212", 2018, 39000, owner2);
			carRepository.save(car);

			// username: user password: user
			userRepository.save(new User("user",
					"$2a$04$1.YhMIgNX/8TkCKGFUONWO1waedKhQ5KrnB30fl0Q01QKqmzLf.Zi",
					"USER"));
			// username: admin password: admin
			userRepository.save(new User("admin",
					"$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG",
					"ADMIN"));
		};
	}
}
