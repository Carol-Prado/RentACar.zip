/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import ooc.enums.Make;

/**
 *
 * @author Amanda Lima
 */
public class BookingSystem implements BookingSystemInterface{

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
    //To change body of generated methods, choose Tools | Templates.
        String inventory = in.readLine();
                       
        RentACarInterface RentACar = new RentACar();
        List<CarInterface> cars;
        
        while(inventory != null){    
            if(inventory.contains(":")){
                int index = inventory.indexOf(":");
                String maker = inventory.substring(index);
                cars.add(maker);
                RentACar.setCars(cars);
                
            }
            else{
                RentACar.setName(inventory);
            }
     
            
            inventory = in.readLine();        
            
        }
       
        return RentACar;
    }
    
}
