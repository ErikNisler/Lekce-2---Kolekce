package com.company;

public enum Fuel {
    DIESEL("Nafta"),
    PETROL("Benzín"),
    LPG("Plyn"),
    CNG("Stlačený plyn"),
    ELECTRIC("Elektřina");

    private String description;

    private Fuel(String description){
        this.description = description;
    }

    public String toString(){
        return description;
    }
}
