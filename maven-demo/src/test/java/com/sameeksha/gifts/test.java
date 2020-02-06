package com.sameeksha.gifts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class test
{
    static int get_totalweight(ArrayList<gift> al)
    {
        int totalweight = 0;
        for(gift i : al)
        {
            totalweight+= i.get_weight();
        }
        return totalweight;
    }
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int calories = 0;
    int weight = 0;
    int price = 0;
    String name="";
    String sweet_type="";
    int chocolatecontent = 0;
    int choco_weight = 0;
    int choco_price = 0;
    String Choco_name = "";
    String choco_brand="";
    String type="";

    System.out.println("Enter the number of gifts");
    int n =sc.nextInt();
    ArrayList<gift> list =new ArrayList<gift>();
    for(int i=0;i<n;i++)
    {
          System.out.println("Enter the type of Gift");
          type=sc.next();
          if(type.equals("Chocolates"))
          {
              System.out.println("Enter the chocolatecontent");
            chocolatecontent = sc.nextInt();
            System.out.println("Enter the weight ");
            choco_weight = sc.nextInt();
            System.out.println("Enter the price ");
            choco_price = sc.nextInt();
            System.out.println("Enter the Chocolatename");
            Choco_name =sc.next();
            System.out.println("Enter the Chocolate Brand");
            choco_brand =sc.next();
            
            if(Choco_name.equals("silk"))
            {
                silk c= new silk(chocolatecontent, choco_weight, choco_price, Choco_name, type,choco_brand);
                list.add(c);
            }
            else if(Choco_name.equals("kisses"))
            {
                kisses f =new kisses(chocolatecontent, choco_weight, choco_price, Choco_name, type,choco_brand);
                list.add(f);
            }
            else 
            {
               melody m=new melody(chocolatecontent, choco_weight, choco_price, Choco_name, type,choco_brand);
              list.add(m);
            }

          } 
          else
          {
            System.out.println("Enter the calories of "+type);
            calories = sc.nextInt();
            System.out.println("Enter the weight ");
            weight = sc.nextInt();
            System.out.println("Enter the price ");
            price = sc.nextInt();
            System.out.println("Enter the sweetname");
           name =sc.next();
            if(name.equals("kajubarfi"))
            {
                kajubarfi g =new kajubarfi(calories, weight, price, name, type,sweet_type);
                list.add(g);
            }
            else if(name.equals("motichoorladoo"))
            {
            	 motichoor_ladoo h =new motichoor_ladoo(calories, weight, price, name, type,sweet_type);
                list.add(h);
            }
            else
            {
                rasgulla k =new rasgulla(calories, weight, price, name, type,sweet_type);
                list.add(k);
            }
          }  
    }
   
    int totalweight = get_totalweight(list);
    System.out.println("The Total Weight is "+totalweight);
   
    Collections.sort(list,new sorter());
    System.out.println("After Sorting the Chocolates based on Weights:");
    for(gift c: list)
    {
        if(c.get_type().equals("Chocolates"))
        System.out.println(c);
    }
    
    System.out.println("Enter the min value for range of weights:");
    int min = sc.nextInt();
    System.out.println("Enter the max value for range of weights:");
    int max = sc.nextInt();
    System.out.println("Gifts in the range ");
    for(gift g : list)
    {
        if(g.get_weight()>=min && g.get_weight()<=max)
        {
            System.out.println(g);
        }
    }
 
    sc.close();
   


}
}
