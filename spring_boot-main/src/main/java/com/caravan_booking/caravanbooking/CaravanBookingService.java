package com.caravan_booking.caravanbooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CaravanBookingService {

    private final CaravanBookingRepository bookingRepository;

    @Autowired
    public CaravanBookingService(CaravanBookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<CaravanBooking> getAllBookings() {
        return bookingRepository.findAllBookings();
    }

    public CaravanBooking saveBooking(CaravanBooking booking) {
        return bookingRepository.save(booking);
    }


    public void updateBooking(Long id, String fullName, String email, String phoneNumber,
                              Date checkInDate, Date checkOutDate, String caravanType,
                              int numberOfGuests, String specialRequests, String paymentMethod,
                              String expirationDate) {
        bookingRepository.updateBooking(id, fullName, email, phoneNumber,
                checkInDate, checkOutDate, caravanType, numberOfGuests,
                specialRequests, paymentMethod, expirationDate);
    }



    public void deleteBooking(Long id) {
        bookingRepository.deleteBooking(id);
    }


}
