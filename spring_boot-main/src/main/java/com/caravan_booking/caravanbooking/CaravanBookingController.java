package com.caravan_booking.caravanbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/bookings")
public class CaravanBookingController {

    private final CaravanBookingService bookingService;

    @Autowired
    public CaravanBookingController(CaravanBookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    public List<CaravanBooking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @PostMapping
    public CaravanBooking createBooking(@RequestBody CaravanBooking booking) {
        return bookingService.saveBooking(booking);
    }

    @PutMapping("/{id}")
    public void updateBooking(@PathVariable Long id, @RequestBody UpdateBookingRequest request) {
        bookingService.updateBooking(id, request.getFullName(), request.getEmail(),
                request.getPhoneNumber(), request.getCheckInDate(), request.getCheckOutDate(),
                request.getCaravanType(), request.getNumberOfGuests(), request.getSpecialRequests(),
                request.getPaymentMethod(), request.getExpirationDate());
    }


    // Inner class to hold the request data
    public static class UpdateBookingRequest {
        private String fullName;
        private String email;
        private String phoneNumber;
        private Date checkInDate;
        private Date checkOutDate;
        private String caravanType;
        private int numberOfGuests;
        private String specialRequests;
        private String paymentMethod;
        private String expirationDate;

        public UpdateBookingRequest(String fullName, String email, String phoneNumber, Date checkInDate, Date checkOutDate, String caravanType, int numberOfGuests, String specialRequests, String paymentMethod, String expirationDate) {
            this.fullName = fullName;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
            this.caravanType = caravanType;
            this.numberOfGuests = numberOfGuests;
            this.specialRequests = specialRequests;
            this.paymentMethod = paymentMethod;
            this.expirationDate = expirationDate;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Date getCheckInDate() {
            return checkInDate;
        }

        public void setCheckInDate(Date checkInDate) {
            this.checkInDate = checkInDate;
        }

        public Date getCheckOutDate() {
            return checkOutDate;
        }

        public void setCheckOutDate(Date checkOutDate) {
            this.checkOutDate = checkOutDate;
        }

        public String getCaravanType() {
            return caravanType;
        }

        public void setCaravanType(String caravanType) {
            this.caravanType = caravanType;
        }

        public int getNumberOfGuests() {
            return numberOfGuests;
        }

        public void setNumberOfGuests(int numberOfGuests) {
            this.numberOfGuests = numberOfGuests;
        }

        public String getSpecialRequests() {
            return specialRequests;
        }

        public void setSpecialRequests(String specialRequests) {
            this.specialRequests = specialRequests;
        }

        public String getPaymentMethod() {
            return paymentMethod;
        }

        public void setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        public String getExpirationDate() {
            return expirationDate;
        }

        public void setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
        }

        // Getters and setters
        // ...
    }
@DeleteMapping("/{id}")
public void deleteBooking(@PathVariable Long id) {
    bookingService.deleteBooking(id);
}
}
