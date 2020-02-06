package com.sameeksha.gifts;

import com.sameeksha.gifts.gift;

public abstract class sweets extends gift {
	private int weight;
    private int calories;
    private int price;
    private String name;
    private String gift_type;
    private String sweet_type;

   public sweets(int calories,int weight,int price,String name,String gift_type,String sweet_type)
   {
       super(price, weight, gift_type);
       this.name =name;
       this.calories =calories;
       this.weight = weight;
       this.price = price;
       this.gift_type=gift_type;
       this.sweet_type=sweet_type;
   }

   public int get_calories()
   {
       return  calories;
   }

   public String get_type(){
       return gift_type;
   }
   public int get_weight()
   {
       return weight;
   }

   public int get_price()
   {
       return price;
   }

   public String get_name()
   {
       return name;
   }
   public String get_sweet_type(){
       return sweet_type;
   }
   abstract void description(); 
   public String toString()
   {
       return "Sweet name: "+this.name+"\n"+" sweet calories "+this.calories+"\n"+" Sweet price "+
   this.price+"\n"+" Sweet weight "+this.weight+"\n"+" Sweet type"+this.sweet_type+"\n"; }

}
