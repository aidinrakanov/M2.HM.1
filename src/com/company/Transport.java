package com.company;

import java.util.Random;

public class Transport {

    private int year;
    private String model;
    private Colour colour;

    private int Mileage() {
        Random r = new Random();
        return r.nextInt(100000);
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public Colour getColour() {
        return colour;
    }

    public Transport(int year, String model, Colour colour) {
        this.year = year;
        this.model = model;
        this.colour = colour;
    }

    public String getInfo (){
        return (getModel() + " цвет: " + getColour()+ " год: " + getYear());
    }

    public void lights(){
        System.out.println("Светит фарами");
    }

}

