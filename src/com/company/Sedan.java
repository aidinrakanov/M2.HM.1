package com.company;

public final class Sedan extends Cars {

    private int price;
    private int mileage;

    public Sedan(int year, String model, Colour colour, String madeIN, String transmission, int price, int mileage) {
        super(year, model, colour, madeIN, transmission);
        this.price = price;
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public int getMileage() {
        return mileage;
    }
@Override
    public String getInfo(){return (super.getInfo() + " цена:" + getPrice() + " пробег:" + getMileage());}

@Override
    public void lights(){
    System.out.println("Быстрая машина");
}

}


