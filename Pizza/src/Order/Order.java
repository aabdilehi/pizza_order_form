/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author H
 */
public class Order {
    public static ArrayList<Pizza> pizzas;
    private double total;
    DecimalFormat currency = new DecimalFormat("#0.00");
    private String orderInfo;
    public Order() {
    pizzas = new ArrayList<Pizza>();
    }
    
    public void addPizza(Pizza ok) {
    pizzas.add(ok);
    }
    
    public double getTotal() {
        for(Pizza p: pizzas) {
        total += p.getCost();
        }
        return total;
    }
    
    public String getPizzas() {
    for(Pizza p: pizzas) {
       orderInfo += "PIZZA " + (pizzas.indexOf(p) + 1) + ":\n" + p.getPizza() + "\n\n";
    }
    return orderInfo + "\n";
    }
}
