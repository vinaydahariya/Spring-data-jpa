package com.spring.data.jpa;

import com.spring.data.jpa.entities.User;
import com.spring.data.jpa.repository.DepartmentRepository;
import com.spring.data.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CourseSpringDataJpaExampleApplication implements CommandLineRunner {

//	private DepartmentRepository departmentRepository;

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(CourseSpringDataJpaExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("going to save user: ");

//		User user = new User();
//		user.setUserId(114);
//		user.setName("vishal");
//		user.setAge(23);
//		user.setEmail("targetit89@gmail.com");
//		user.setActive(true);
//		User savedUser = userRepository.save(user);
//		System.out.println(savedUser.getName());
//		System.out.println("user saved:");

		/*
		List<User> all = userRepository.findAll();
		all.forEach(user -> {
			System.out.println(user.getName());
		});
		 */
	}
}
