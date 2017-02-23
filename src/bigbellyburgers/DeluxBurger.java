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
public class DeluxBurger extends BasicBurger {

    public DeluxBurger(String bread, String Meat, double Price,Additions additions1,Additions additions2) {
        super(bread, Meat, Price);
        limAdditions=2;
        this.setAdditions(additions1);
        this.setAdditions(additions2);
        }

    public DeluxBurger(String bread, String Meat, double Price,String name1,double Price1, String name2,double Price2) {
        super(bread, Meat, Price);
         limAdditions=2;
        this.setAdditions(name1,Price1);
        this.setAdditions(name2,Price2);
    }
    @Override
    
    public void getTotal(){
        System.out.println("This is a Delux Burger");
        super.getTotal();
    }
    
    
    
}
