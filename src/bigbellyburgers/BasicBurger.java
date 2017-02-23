/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbellyburgers;

import java.util.ArrayList;

/**
 *
 * @author esteb
 */
public class BasicBurger {
    private String bread;
    private String Meat;
    private ArrayList<Additions> additions;
    private double Price;
    protected int limAdditions;
    public BasicBurger(String bread, String Meat,double Price){
        this.bread=bread;
        this.Meat=Meat;
        this.Price=Price;
        this.limAdditions=limAdditions;
    }
    public boolean setAdditions(Additions additions){
        if(this.additions.size()< this.limAdditions){
            return this.additions.add(additions);
        }else{
            System.out.println("Limit Exceded");
        }
        return false;
    }
    public boolean setAdditions(String name, double Price){
         if(this.additions.size()< this.limAdditions){
        return this.additions.add(new Additions(name,Price));
         }else{
             System.out.println("Limit Exceded");
         }
        return false;
        
    }
   
    public void getTotal(){
        double total=0;
        System.out.println("This is a traditional " + this.Meat + "Burger" + "in" + this.bread + "with a base price of" + this.Price);
        for(Additions tempAdditions : this.additions){
            System.out.println("plus" + tempAdditions.getName() + "at" + tempAdditions.getPrice());
            total+= tempAdditions.getPrice();
        }
    }
}

