package com.caravan_booking.caravanbooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

public interface CaravanBookingRepository extends JpaRepository<CaravanBooking, Long> {

    @Query(value = "SELECT * FROM caravan_bookings", nativeQuery = true)
    List<CaravanBooking> findAllBookings();

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO caravan_bookings (full_name, email, phone_number, check_in_date, check_out_date, caravan_type, number_of_guests, special_requests, payment_method, expiration_date) " +
            "VALUES (:fullName, :email, :phoneNumber, :checkInDate, :checkOutDate, :caravanType, :numberOfGuests, :specialRequests, :paymentMethod, :expirationDate)", nativeQuery = true)
    void insertCaravanBooking(@Param("fullName") String fullName, @Param("email") String email, @Param("phoneNumber") String phoneNumber,
                              @Param("checkInDate") Date checkInDate, @Param("checkOutDate") Date checkOutDate,
                              @Param("caravanType") String caravanType, @Param("numberOfGuests") int numberOfGuests,
                              @Param("specialRequests") String specialRequests, @Param("paymentMethod") String paymentMethod,
                              @Param("expirationDate") String expirationDate);


    @Modifying
    @Transactional
    @Query(value = "UPDATE caravan_bookings " +
            "SET full_name = :fullName, " +
            "email = :email, " +
            "phone_number = :phoneNumber, " +
            "check_in_date = :checkInDate, " +
            "check_out_date = :checkOutDate, " +
            "caravan_type = :caravanType, " +
            "number_of_guests = :numberOfGuests, " +
            "special_requests = :specialRequests, " +
            "payment_method = :paymentMethod, " +
            "expiration_date = :expirationDate " +
            "WHERE id = :id", nativeQuery = true)
    void updateBooking(@Param("id") Long id,
                       @Param("fullName") String fullName,
                       @Param("email") String email,
                       @Param("phoneNumber") String phoneNumber,
                       @Param("checkInDate") Date checkInDate,
                       @Param("checkOutDate") Date checkOutDate,
                       @Param("caravanType") String caravanType,
                       @Param("numberOfGuests") int numberOfGuests,
                       @Param("specialRequests") String specialRequests,
                       @Param("paymentMethod") String paymentMethod,
                       @Param("expirationDate") String expirationDate);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM caravan_bookings WHERE id = :id", nativeQuery = true)
    void deleteBooking(@Param("id") Long id);
}
