package com.sameeksha.gifts;

import java.util.Comparator;

import com.sameeksha.gifts.gift;
public class sorter implements Comparator<gift>
{

    public int compare(gift g1, gift g2) {
        if(g1.get_type().equals("Chocolates") && g2.get_type().equals("Chocolates") )
        return g1.get_weight()-g2.get_weight();
        return 0;
    }
  

}
