package com.company;

public class Main {

    public static void main(String[] args) {


        Cars c1 = new Cars(2010, "Toyota", Colour.BLACK ,"Japan", "automatic");
        System.out.println(c1.getInfo());
        c1.lights();

        Sedan s1 = new Sedan(2012,"Mers", Colour.WHITE ,"Germany",
                "automatic", 25000, 54000);
        System.out.println(s1.getInfo());
        s1.lights();

        Sedan s2 = new Sedan(2008,"Audi", Colour.SILVER, "Germany",
                "Manually", 16000, 85000 );
        System.out.println(s2.getInfo());
        s2.lights();
    }
}
