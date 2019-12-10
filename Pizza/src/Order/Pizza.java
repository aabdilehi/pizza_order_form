/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import java.text.DecimalFormat;

/**
 *
 * @author H
 */
public class Pizza {
    private Size size;
    private Crust crust;
    private Sauce sauce;
    private Toppings topping1;
    private Toppings topping2;
    private double pcost;
    DecimalFormat currency = new DecimalFormat("#0.00");
    
    public Pizza() {}
    
        public Pizza(String size, String crust, String sauce, String topping1, String topping2) {
        this.size = Size.valueOf(size.toUpperCase());
        this.crust = Crust.valueOf(crust.toUpperCase());
        this.sauce = Sauce.valueOf(sauce.toUpperCase());;
        this.topping1 = Toppings.valueOf(topping1.toUpperCase());;
        this.topping2 = Toppings.valueOf(topping2.toUpperCase());;
        }
    
    public String getSize() {return "" + size;}
    public String getCrust() {return "" + crust;}
    public String getSauce() {return "" + sauce;}
    public String getTopping1() {return "" + topping1;}
    public String getTopping2() {return "" + topping2;}
    
    public void setSize(String newSize) {size = Size.valueOf(newSize.toUpperCase());}
    public void setCrust(String newCrust) {crust = Crust.valueOf(newCrust.toUpperCase());}
    public void setSauce(String newSauce) {sauce = Sauce.valueOf(newSauce.toUpperCase());}
    public void setTopping1(String newTopping) {topping1 = Toppings.valueOf(newTopping.toUpperCase());}
    public void setTopping2(String newTopping) {topping2 = Toppings.valueOf(newTopping.toUpperCase());}
    
    public String getPizza() {
    return("TOTAL COST: £" + getCost() + "\n" + size + " Size: £" + currency.format(size.getCost()) 
    + "\n" + crust + " Crust: £" + currency.format(crust.getCost()) + "\nBASE COST: £" 
    + currency.format(size.getCost() + crust.getCost()) + "\n" + (topping1.toString()).replaceAll("_", " ") 
    + " Topping: 5* £" + currency.format(topping1.getCost()) + " = £" + currency.format(5*topping1.getCost()) + "\n" 
    + (topping2.toString()).replaceAll("_", " ") + " Topping: 4* £" + currency.format(topping2.getCost()) + " = £" 
    + currency.format(4*topping2.getCost()) + "\n" + sauce + " Sauce: £" + currency.format(sauce.getCost()));
    }
    
    public double getCost() {
    pcost = size.getCost() + crust.getCost() + sauce.getCost() + 5*topping1.getCost() + 4*topping2.getCost();
    return pcost;
    }
}
