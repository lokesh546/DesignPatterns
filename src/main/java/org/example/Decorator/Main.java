package org.example.Decorator;

public class Main {

    public static void main(String[] args) {

        Burger burger = new VegBurger();
        burger = new ExtraChessBurger(burger);
        System.out.println(burger.getCost());
    }
}
