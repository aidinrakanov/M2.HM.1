package com.company;

public class Cars extends Transport {

    private String madeIN;
    private String transmission;

    public Cars(int year, String model, Colour colour, String madeIN, String transmission) {
        super(year, model, colour);
        this.madeIN = madeIN;
        this.transmission = transmission;
    }

    public String getMadeIN() {
        return madeIN;
    }

    public String getTransmission() {
        return transmission;
    }

    @Override
    public String getInfo() {
        return (super.getInfo() + " произведено в: " + getMadeIN() +
                " коробка передач: " + getTransmission());
    }

    @Override
    public void lights() {
        System.out.println("Выклюает фары");
    }

    public void makeSignal(String signal, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(signal);
        }

    }

    public final void makeSignal(String signal) {
        System.out.println(signal);
    }

    public void makeSignal(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(" beep ");
        }
    }

}
