package com.caravan_booking.caravanbooking;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "caravan_bookings")
public class CaravanBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    // Getters and setters
    // ...

    public CaravanBooking(Long id, String fullName, String email, String phoneNumber, Date checkInDate, Date checkOutDate, String caravanType, int numberOfGuests, String specialRequests, String paymentMethod, String expirationDate) {
        this.id = id;
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

    public CaravanBooking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
