package com.ling.Decorator.Suit;

public abstract class Suit {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Suit(String name){
        this.name =name;
    }

    public abstract int price();

    @Override
    public String toString() {
        return "Suit{" +
                "name='" + this.getName() + '\'' +
                "price='" + price() + '\'' +
                '}';
    }
}
