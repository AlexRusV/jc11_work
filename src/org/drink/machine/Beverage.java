package org.drink.machine;

public class Beverage extends Product {

    private double volume;

    public Beverage(String name, double price) {
        super(name, price);
    }

    public Beverage(String name, double price, int count) {
        super(name, price, count);
    }

    public Beverage(String name, double price, int count, double volume) {
        super(name, price, count);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
