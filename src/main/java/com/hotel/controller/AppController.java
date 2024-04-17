package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hotel.entities.Booking;
import com.hotel.entities.Hotel;
import com.hotel.entities.User;
import com.hotel.service.BookingService;
import com.hotel.service.HotelService;
import com.hotel.service.UserService;

import java.util.Date;
import java.util.List;

@RestController
public class AppController {
	
    @Autowired
    private UserService userService;
    @Autowired
    private BookingService bookingService;
    @Autowired
    private HotelService hotelService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

//    @PostMapping("/book")
//    public Booking bookHotel(@RequestParam Long userId, @RequestParam Long hotelId,
//                             @RequestParam Date checkInDate, @RequestParam Date checkOutDate) {
//        return bookingService.bookHotel(userId, hotelId, checkInDate, checkOutDate);
//    }

    @GetMapping("/hotels")
    public List<Hotel> getAllHotels() {
        return hotelService.listAllHotels();
    }

    @GetMapping("/hotels/{id}")
    public Hotel getHotel(@PathVariable Long id) {
        return hotelService.getHotelById(id);
    }
}