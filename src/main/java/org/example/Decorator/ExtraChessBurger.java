package org.example.Decorator;

public class ExtraChessBurger extends BurgerDecorator{

    private Burger burger;

    public ExtraChessBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + "Extra Cheese";
    }

    @Override
    public double getCost() {
        return 30+burger.getCost();
    }
}
