package com.ling.Decorator.Decorate;

import com.ling.Decorator.Suit.Suit;

public abstract class Decorate extends Suit{
    protected Suit suit;

    public Decorate(Suit suit){
        super(suit.getName());
        this.suit = suit;
    }
}
