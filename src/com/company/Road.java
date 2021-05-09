package com.company;

import java.time.LocalDate;

public class Road {
    Car car;
    String target;
    LocalDate date;
    int distance;
    double fuelConsumption;

    public Road(Car car, int distance, double fuelConsumption) {
        this(car, "not specified", LocalDate.now(), distance, fuelConsumption);
    }

    public Road(Car car, String target, LocalDate date, int distance, double fuelConsumption) {
        this.car = car;
        this.target = target;
        this.date = date;
        this.distance = distance;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return getDescription();
    }

    public String getDescription() {
        return "Business mission: "+getCar().getDescription()+" to "+getTarget()+" on "+date.toString();
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
