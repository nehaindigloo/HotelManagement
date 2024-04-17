package com.hotel.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String availableRoom;
    private String location;
    
//    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
//    private List<User> user = new ArrayList<>();


    public Hotel() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvailableRoom() {
        return availableRoom;
    }

    public void setAvailableRoom(String availableRoom) {
        this.availableRoom = availableRoom;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public Hotel(Long id, String name, String availableRoom, String location) {
        this.id = id;
        this.name = name;
        this.availableRoom = availableRoom;
        this.location = location;
    }

	

}
