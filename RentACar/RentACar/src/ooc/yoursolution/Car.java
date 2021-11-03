/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.HashMap;
import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author ca_ro
 */
public class Car implements CarInterface {
    
    private Make make;
    private Month days;
    
   


    @Override
    public Map<Month, boolean[]> createAvailability() {
         
       Map<Month, boolean[]> daysAvail = new HashMap<>();
        
       daysAvail.put(days, null);
       
        System.out.println(daysAvail.values());
        
        for(boolean[] key: daysAvail.values()){
            System.out.println(daysAvail.get(key));
        }
        
        return null;
        
    }

    @Override
    public Make getMake() {
        return this.make;
        
    }

    @Override
    public void setMake(Make make) {
         this.make = make;
         System.out.println(make);
    }

    @Override
    public double getRate() {
        return 0;
        
    }

    @Override
    public void setRate(double rate) {
       
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        
        
        return null;
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
         
    }

    @Override
    public int getId() {
        return this.getId();
        
        
    }

    @Override
    public boolean isAvailable(Month month, int day) {
       
   

        boolean isAvailable = this.isAvailable(month, day);
         if (isAvailable==false){
             
         }
        
        return true;
        
    }

    @Override
    public boolean book(Month month, int day) {
        boolean book = this.isAvailable(month, day);
        if(book==false){
            
        }
        return true;
              
    }
    
}
