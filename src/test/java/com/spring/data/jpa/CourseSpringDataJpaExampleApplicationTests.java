package com.spring.data.jpa;

import com.spring.data.jpa.dto.UserType;
import com.spring.data.jpa.entities.Address;
import com.spring.data.jpa.entities.User;
import com.spring.data.jpa.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CourseSpringDataJpaExampleApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	public void testUser(){

//		if(3>2){
//			throw new RuntimeException("This is error");
//		}


		User user = new User();

		user.setUserId(115);
		user.setName("vimal");
		user.setEmail("targetit09@gmail.com");
		user.setAge(23);
		user.setActive(true);
		user.setExtraInformation("student of mca");
		user.setType(UserType.STUDENT);

		Address address = new Address();
		address.setCountry("India");
		address.setStreet("eh-14 ada colony");
		address.setPinCode("211009");

		user.setAddress(address);

		User savedUser = userService.save(user);
		System.out.println(savedUser.getName());

	}


	@Test
	public void getUserTest(){
		User user = userService.get(112);
		System.out.println(user.getName());

	}

}
