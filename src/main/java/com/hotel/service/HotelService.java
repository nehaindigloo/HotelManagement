package com.hotel.service;

import com.hotel.entities.Hotel;
import com.hotel.repository.HotelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@Service
public class HotelService {
	
  @Autowired
  private HotelRepository hotelRepository;

    public List<Hotel> listAllHotels() {
        return hotelRepository.findAll();
    }

    public  Hotel getHotelById(Long id) {
        return hotelRepository.findById(id).orElseThrow();
    }

    public Hotel addHotel(Hotel hotel) {
        return hotelRepository.save(hotel); 
    }

	public Hotel saveOrUpdate(Hotel hotel) {
		 return hotelRepository.save(hotel); 		
	}
    
	
	    public void deleteHotel(Long id) {
	        hotelRepository.deleteById(id);
	    }

  
}
