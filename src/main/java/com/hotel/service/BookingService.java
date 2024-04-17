package com.hotel.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entities.Booking;
import com.hotel.entities.Hotel;
import com.hotel.entities.User;
import com.hotel.repository.BookingRepository;
import com.hotel.repository.HotelRepository;
import com.hotel.repository.UserRepository;


@Service
public class BookingService {
	
	    @Autowired
	    private BookingRepository bookingRepository;
	    
	    @Autowired
	    private HotelRepository hotelRepository;
	    @Autowired 
	    private UserRepository userRepository;

	    public Booking bookHotel(Long userId, Long hotelId, Date checkInDate, Date checkOutDate) {
	        Hotel hotel = hotelRepository.findById(hotelId).orElseThrow();
	        User user = userRepository.findById(userId).orElseThrow();

	        Booking booking = new Booking();
	        booking.setUser(user);
	        booking.setHotel(hotel);
	        booking.setCheckInDate(checkInDate);
	        booking.setCheckOutDate(checkOutDate);

	        return bookingRepository.save(booking);
	    }
}






//    public List<Booking> getAllBookings() {
//        return bookingRepository.findAll();
//    }
//  
//    public Booking createBooking(Booking booking) {
//        return bookingRepository.save(booking);
//    }
//
//    public Booking updateBooking(Long id, Booking updatedBooking) {
//        Optional<Booking> optionalBooking = bookingRepository.findById(id);
//        if (optionalBooking.isPresent()) {
//            Booking existingBooking = optionalBooking.get();
//            // Update existing booking with new details
//            existingBooking.setCheckInDate(updatedBooking.getCheckInDate());
//           existingBooking.setCheckOutDate(updatedBooking.getCheckOutDate());
//         
//            return bookingRepository.save(existingBooking);
//        } else {
//            return null; // Or throw an exception
//        }
//    }
//
//    public boolean deleteBooking(Long id) {
//        Optional<Booking> optionalBooking = bookingRepository.findById(id);
//        if (optionalBooking.isPresent()) {
//            bookingRepository.deleteById(id);
//            return true;
//        } else {
//            return false;
//        }
//    }

	
   
