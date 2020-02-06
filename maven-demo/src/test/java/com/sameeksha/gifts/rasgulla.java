package com.sameeksha.gifts;

import com.sameeksha.gifts.sweets;

public class rasgulla extends sweets
{

    public rasgulla(int calories,int weight,int price,String name,String gift_type,String sweet_type) {
        super(calories,weight,price,name,gift_type,sweet_type);
    }

    @Override
    void description() {
        System.out.println("I am Rasgulla and i am sphere in shape");
    }
}