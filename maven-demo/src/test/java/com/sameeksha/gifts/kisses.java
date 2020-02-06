package com.sameeksha.gifts;

import com.sameeksha.gifts.chocolate;

public class kisses extends chocolate
{

    public kisses(int Chocolate_content, int weight, int price, String chocolate_name,String  gift_type,String chocolate_brand) {
        super(Chocolate_content, weight, price, chocolate_name, gift_type,chocolate_brand);
       
    }

    @Override
    void description() {
   System.out.println("Hello! I am kisses");
    }

}