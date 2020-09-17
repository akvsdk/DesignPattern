package com.ling.Decorator.Decorate;

import com.ling.Decorator.Decorate.Decorate;
import com.ling.Decorator.Suit.Suit;

public class T_shit extends Decorate {

    public T_shit(Suit suit) {
        super(suit);
    }


    @Override
    public String getName() {
        return super.getName()+"   +T恤";
    }

    @Override
    public int price() {
        return suit.price()+199;
    }
}
