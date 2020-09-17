package com.ling.Decorator.Decorate;

import com.ling.Decorator.Suit.Suit;

public class Sports_Shoes extends Decorate{

    public Sports_Shoes(Suit suit) {
        super(suit);
    }


    @Override
    public String getName() {
        return super.getName()+"  +运动鞋";
    }
    @Override
    public int price() {
        return suit.price()+599;
    }
}
