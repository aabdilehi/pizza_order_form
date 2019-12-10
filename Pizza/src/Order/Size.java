/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import java.util.Arrays;

/**
 *
 * @author H
 */
public enum Size {
    SMALL(9.45), MEDIUM(11.87), LARGE(15.90);
    
    private double cost;
    
    Size(double cost) {this.cost = cost;}
    public double getCost() { return this.cost;}
}

