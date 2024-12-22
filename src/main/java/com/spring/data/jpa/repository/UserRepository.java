package com.spring.data.jpa.repository;

import com.spring.data.jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    //QueryMethods :
    // returnType findBy<Property>(Type value)
    Optional<User> findByEmailOrderByNameAsc(String email);

    List<User> findByNameIgnoreCase(String name);

    List<User> findByNameAndEmailAllIgnoreCase(String name, String email);

    List<User> findByNameOrEmail(String name, String email);

    int countByName(String name);

    boolean existsByEmail(String email);

    List<User> findByNameContaining(String nameKeyword);

    List<User> findByNameLike(String pattern);


    // manual defined query :
//    @Query(value = "select *from jpa_user", nativeQuery = true)
//    public List<User> getUsers();
//
//    @NativeQuery("select *from jpa_user where email =:email")
//    public List<User> getUsersByEmail(@Param("email") String email);
//
//    @NativeQuery("select *from jpa_user where name =:name AND email =:email")
//    public List<User> getUserByNameAndEmail(@Param("name") String name, @Param("email") String email);
//
//
//    //{HQL/JPQL}
//    @Query("SELECT u FROM User u WHERE u.email =:email AND u.name =:name")
//    public List<User> getUsers1(@Param("email") String email, @Param("name") String name);
//
//    @Query("SELECT u from User u where u.address.country =:country")
//    public List<User> getUserByCountry(@Param("country") String country);

}