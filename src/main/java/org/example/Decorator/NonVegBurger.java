package org.example.Decorator;

public class NonVegBurger extends Burger{
    @Override
    public String getDescription() {
        return "Non-Veg";
    }

    @Override
    public double getCost() {
        return 250;
    }
}
