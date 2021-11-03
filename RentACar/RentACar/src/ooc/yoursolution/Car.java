/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author ca_ro
 */
public class Car implements CarInterface {
    
    private Make make;
    private Month availability;
   

    @Override
    public Map<Month, boolean[]> createAvailability() {
       
    }

    @Override
    public Make getMake() {
        return this.make;
    }

    @Override
    public void setMake(Make make) {
         this.make = make;
    }

    @Override
    public double getRate() {
        return this.getRate();
    }

    @Override
    public void setRate(double rate) {
       
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
     
    }

    @Override
    public int getId() {
        
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        
    }

    @Override
    public boolean book(Month month, int day) {
       
    }
    
}
