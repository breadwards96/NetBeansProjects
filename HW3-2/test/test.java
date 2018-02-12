/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonedwards
 */
public class test {
    // Superclass 
public class Vehicle  {
    private double cost;
    
    
    //(Other methods .. .)

        public void setCost(double cost) {
            this.cost = cost;
        }
    }
// Subclass
public class Car extends Vehicle  {
 
    public Car(double c)  {
        
        super.setCost(c);
        
    }
}
}
