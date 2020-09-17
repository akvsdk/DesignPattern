package com.ling.Decorator.Decorate;

import com.ling.Decorator.Suit.Suit;

public class Jeans extends Decorate{

    public Jeans(Suit suit) {
        super(suit);
    }

    @Override
    public String getName() {
        return super.getName()+"   +牛仔裤";
    }
    @Override
    public int price() {
        return suit.price()+399;
    }
}