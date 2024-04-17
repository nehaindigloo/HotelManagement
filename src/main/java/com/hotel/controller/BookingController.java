//package com.hotel.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.hotel.entities.Booking;
//import com.hotel.service.BookingService;
//
//@RestController
//@RequestMapping("/bookings")
//public class BookingController {
//    @Autowired
//    private BookingService bookingService;
//
//    @GetMapping
//    public List<Booking> getAllBookings() {
//        return bookingService.getAllBookings();
//    }
// 
//
//    @PostMapping("/book")
//    public Booking createBooking(@RequestBody Booking booking) {
//        return bookingService.createBooking(booking);
//    }
//    
//    @PutMapping("/{id}")
//    public ResponseEntity<Booking> updateBooking(@PathVariable Long id, @RequestBody Booking updatedBooking) {
//        Booking booking = bookingService.updateBooking(id, updatedBooking);
//        if (booking != null) {
//            return new ResponseEntity<>(booking, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteBooking(@PathVariable Long id) {
//        boolean deleted = bookingService.deleteBooking(id);
//        if (deleted) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//}
