package com.company;

import java.time.LocalDate;

public class Car {

    private String brand;
    private String make;
    private int numOfSeats;
    private String licenseNumber;
    private int power;
    private LocalDate nextCheckDate;
    private Fuel fuel;

    public Car(String brand, String licenseNumber, LocalDate nextCheckDate) {
        this(brand, "", 5, licenseNumber, 0, nextCheckDate);
    }

    public Car(String brand, String make, int numOfSeats, String licenseNumber, int power, LocalDate nextCheckDate) {
        this.brand = brand;
        this.make = make;
        this.numOfSeats = numOfSeats;
        this.licenseNumber = licenseNumber;
        this.power = power;
        this.nextCheckDate = nextCheckDate;
    }

    public void setNumOfSeats(String numberAsText) {
        numOfSeats = Integer.parseInt(numberAsText);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setSeats(int seats) {
        this.numOfSeats = seats;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public LocalDate getNextCheckDate() {
        return nextCheckDate;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    /**
     * Pokud je nextCheckDate starší než dnešní datum, použijeme místo něj dnešní datum.
     * @param nextCheckDate
     */
    public void setNextCheckDate(LocalDate nextCheckDate) {
        if (nextCheckDate.isBefore(LocalDate.now())) {
            this.nextCheckDate = LocalDate.now();
        } else {
            this.nextCheckDate = nextCheckDate;
        }
    }

    public String getDescription() {
        return getBrand()+" "+getMake()+" ("+getLicenseNumber()+"): "+getNumOfSeats()+" seats"+", "+getFuel();
    }
}