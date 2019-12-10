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
public enum Crust {
    THIN(1.08), DEEP(1.10), STUFFED(2.14);
    
    private double cost;
    
    Crust(double cost) {this.cost = cost;}
    
    public double getCost() { return this.cost;}
}
