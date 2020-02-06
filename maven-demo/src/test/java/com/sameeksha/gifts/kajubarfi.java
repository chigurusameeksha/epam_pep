package com.sameeksha.gifts;

import com.sameeksha.gifts.sweets;

public class kajubarfi extends sweets
{

    public kajubarfi(int calories,int weight,int price,String name,String gift_type,String sweet_type) {
        super(calories,weight,price,name,gift_type,sweet_type);
    }

    @Override
    void description() {
        System.out.println("I am KajuBarfi and i am diamond in shape");
    }
}