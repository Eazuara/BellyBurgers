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
public class HealtyBurger extends BasicBurger {

    public HealtyBurger(String bread, String Meat, double Price) {
        super(bread, Meat, Price);
        limAdditions=6;
    }
    @Override
    public void getTotal(){
        System.out.println("This a Healthy Burger");
        super.getTotal();
    }
 
    }
    

