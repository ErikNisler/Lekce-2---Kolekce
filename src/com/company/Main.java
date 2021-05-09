package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> listOfCars = new ArrayList<>();
        ArrayList<Road> listOfRoads = new ArrayList<>();

        listOfCars.add(new Car("Škoda", "3Z1 52 13", LocalDate.of(2021, 5, 12)));
        listOfCars.add(new Car("Škoda", "3Z1 52 14", LocalDate.of(2021, 4, 15)));
        listOfCars.add(new Car("Škoda", "3Z1 52 14", LocalDate.of(2021, 4, 15)));

        listOfRoads.add(new Road(listOfCars.get(0), 325, 325/100*6.5));
        listOfRoads.add(new Road(listOfCars.get(1), 215, 215/100*6.45));
        listOfRoads.add(new Road(listOfCars.get(0), 421, 421/100*5.84));

        //Kolekce - cvičení
        //Sečtení délky všech ces
        int sumOfRoads = 0;
        for (Road r: listOfRoads){
            sumOfRoads += r.getDistance();
        }
        System.out.println("Součet délky všech cest je: "+sumOfRoads);

        //Auta po STK
        LocalDate STK = LocalDate.of(2021, 5, 1);
        for (Car c: listOfCars) {
            if (c.getNextCheckDate().isAfter(STK)) {
                System.out.println("Auto po technické: "+c.getDescription());
            }
        }

        //Vyhledávání auta dle SPZky
        HashMap<String, String> map = new HashMap<>();
        map.put(listOfCars.get(0).getLicenseNumber(),listOfCars.get(0).getBrand());
        map.put(listOfCars.get(1).getLicenseNumber(),listOfCars.get(1).getBrand());
        String licenseNum1 = map.get(listOfCars.get(0).getLicenseNumber());
        System.out.println(licenseNum1);

        //Enumy
        listOfCars.get(0).setFuel(Fuel.LPG);
        System.out.println(listOfCars.get(0).getDescription());

    }
}
