package com.sameeksha.gifts;

abstract class gift
{
  private int price;
  private int weight;
  private String gifttype; 
  gift(int price,int weight,String gifttype)
   {
       this.price=price;
       this.weight=weight;
       this.gifttype=gifttype;
   }
public int get_weight()
{
    return weight;
}
public int get_price()
{
    return price;
}
public String get_type()
{
    return gifttype;
}
 abstract void description();
  
@Override
public String toString() {    
    return "Gift type"+this.gifttype+"Price is "+this.price+"Weight is "+this.weight;
}

}

