/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

/**
 *
 * @author H
 */
public class Test {
    public Test() {}
    
    public static void main(String[] args) {
    Pizza one = new Pizza("medium", "thin", "pesto", "extra_cheese", "chilli");
    
    Pizza two = new Pizza();
    two.setSize("medium");
    two.setCrust("stuffed");
    two.setSauce("pesto");
    two.setTopping1("olives");
    two.setTopping2("onion");
    
    Pizza three = new Pizza("small", "thin", "PESTO", "chilli", "pepperoni");
    Pizza four = new Pizza("small", "thin", "pesto", "olives", "olives");
    
    System.out.println(four.getCost());
    
    Order ok = new Order();
    ok.addPizza(one);
    ok.addPizza(two);
    ok.addPizza(three);
    ok.addPizza(four);
    System.out.println(ok.getPizzas());
    }
}
