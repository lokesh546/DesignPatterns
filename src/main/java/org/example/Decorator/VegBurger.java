package org.example.Decorator;

public class VegBurger extends Burger{
    @Override
    public String getDescription() {
        return "Veg Burger";
    }

    @Override
    public double getCost() {
        return 190;
    }
}
