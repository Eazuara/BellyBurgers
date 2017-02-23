/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbellyburgers;

/**
 *
 * @author esteb
 */
public class Additions {
    private String name;
    private double Price;
    
    public Additions (String name, double Price){
        this.name=name;
        this.Price=Price;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
            
    
}
