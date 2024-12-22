package com.spring.data.jpa.concepts;

import com.spring.data.jpa.entities.Laptop;
import com.spring.data.jpa.entities.User;
import com.spring.data.jpa.repository.LaptopRepository;
import com.spring.data.jpa.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class ConceptsMain {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LaptopRepository laptopRepository;

    @Test
    public void testSaveOneToOne(){
        User user = userRepository.findById(113).orElseThrow(() -> new RuntimeException("User not found"));
        // new laptop
        Laptop laptop = new Laptop();
//        laptop.setId(741); no need to write because it is auto increment
        laptop.setModel("HP");
        laptop.setAbout("window-11 include");
//        user.setLaptop(laptop);
        laptop.setUser(user);

        laptopRepository.save(laptop);
        userRepository.save(user);
        System.out.println("laptop added");
    }

    @Test
//    @Transactional
    public void testGetOneToOne(){
//        User user = userRepository.findById(113).orElseThrow(() -> new RuntimeException("User not found"));
//        System.out.println(user.getName());
//        System.out.println(user.getLaptop());


        Laptop laptop = laptopRepository.findById(743).orElseThrow();
        System.out.println(laptop.getModel());
        //session : jpa ne close:
        User user = laptop.getUser();
        System.out.println(user.getName());

    }


    @Test
//    @Transactional // Ensures that the persistence context is maintained during the test.
    public void testSaveOneToMany() {
        // Fetch the user by ID
        User user = userRepository.findById(114).orElseThrow(() -> new RuntimeException("User not found"));

        // Update the user's name
        user.setName("Vinay");

        // Create and set up the first laptop
        Laptop laptop1 = new Laptop();
        laptop1.setModel("Macbook Air");
        laptop1.setAbout("First laptop");
        laptop1.setUser(user); // Set the user for the laptop

        // Create and set up the second laptop
        Laptop laptop2 = new Laptop();
        laptop2.setModel("Macbook Pro");
        laptop2.setAbout("Second laptop");
        laptop2.setUser(user); // Set the user for the laptop

        // Add the laptops to the user's list
        user.getLaptops().add(laptop1);
        user.getLaptops().add(laptop2);

        // Save the user along with the associated laptops
        userRepository.save(user);

        System.out.println("User updated successfully.");
    }



}
