/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;
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
        Make make;
        brands = make.
       
        while(inventory != null){
            if(inventory.contentEquals(Make.values())){
                
            }
            
            inventory = in.readLine();        
            
            RentACar.
            
            title = in.readLine();
            
        
        }
       
        return RentACar;
    }
    
}
