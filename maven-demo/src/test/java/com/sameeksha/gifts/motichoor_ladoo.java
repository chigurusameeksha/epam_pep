package com.sameeksha.gifts;

import com.sameeksha.gifts.sweets;

public class motichoor_ladoo extends sweets
{

    public motichoor_ladoo(int calories,int weight,int price,String name,String gift_type,String sweet_type) {
        super(calories,weight,price,name,gift_type,sweet_type);
    }

    @Override
    void description() {
        System.out.println("I am MotiChoorLadoo and i am Sphere in shape");
    }
}