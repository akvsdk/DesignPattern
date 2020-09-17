package com.ling.Decorator;

import com.ling.Decorator.Decorate.Canvas_Shoes;
import com.ling.Decorator.Decorate.Skirt;
import com.ling.Decorator.Suit.Suit_02;

/*=================客户端====================*/
public class postive {
    public static void main(String[] args) {
        Suit_02 girl_suit = new Suit_02();
        Skirt skirt = new Skirt(girl_suit);
        Canvas_Shoes canvas_shoes = new Canvas_Shoes(skirt);

        System.out.println(canvas_shoes);
    }
}
