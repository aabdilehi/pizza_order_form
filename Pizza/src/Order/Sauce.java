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
public enum Sauce {
    TOMATO(0.00), PESTO(0.50);
    
    private double cost;
    Sauce(double cost) {this.cost = cost;}
    
    public double getCost() { return this.cost;}
}
