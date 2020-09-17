package com.ling.Decorator;


import com.ling.Decorator.Suit.Suit_01;
import com.ling.Decorator.Suit.Suit_02;

/*=====================客户端=========================*/
public class negtive {
    public static void main(String[] args) {
        Suit_02 girl_suit = new Suit_02();
        System.out.println(girl_suit);

        System.out.println("   ");


        Suit_01 boy_suit = new Suit_01();
        System.out.println(boy_suit);
    }
}
