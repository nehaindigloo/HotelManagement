package com.hotel.controller;

import com.hotel.entities.Hotel;
import com.hotel.service.HotelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	
    @Autowired
    private HotelService hotelService;

    @GetMapping("/findall")
    public List<Hotel> getAllHotels(){
        return hotelService.listAllHotels();
    }
    
	/*
	 * @GetMapping("/{id}") public Hotel getHotel(@PathVariable Long id){ return
	 * hotelService.getHotelById(id); }
	 */
    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable Long id) {
        Hotel hotel = hotelService.getHotelById(id);
        if (hotel != null) {
            return new ResponseEntity<>(hotel, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/addHotel")
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel) {
        Hotel savedHotel = hotelService.addHotel(hotel);
        return ResponseEntity.ok(savedHotel); 
    }
  

    @PutMapping("/{id}")
    public ResponseEntity<Hotel> updateHotel(@PathVariable Long id, @RequestBody Hotel updatedHotel) {
        Hotel existingHotel = hotelService.getHotelById(id);
        if (existingHotel != null) {
            existingHotel.setName(updatedHotel.getName());
            existingHotel.setLocation(updatedHotel.getLocation());
            Hotel updated = hotelService.addHotel(existingHotel);
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHotel(@PathVariable Long id) {
        hotelService.deleteHotel(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
   
}
