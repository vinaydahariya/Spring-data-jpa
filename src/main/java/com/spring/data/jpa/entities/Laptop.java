package com.spring.data.jpa.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "jpa_laptops")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;
    private String about;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    // User
//    @OneToOne(fetch = FetchType.LAZY)
//    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

//    @Override
//    public String toString() {
//        return "Laptop{" +
//                "id=" + id +
//                ", model='" + model + '\'' +
//                ", about='" + about + '\'' +
//                ", user=" + user +
//                '}';
//    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
