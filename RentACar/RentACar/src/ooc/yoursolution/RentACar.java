/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.ArrayList;
import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author Amanda Lima
 */
public class RentACar implements RentACarInterface{
    private String name;
        
    
    @Override
    public List<CarInterface> getCars() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCars(List<CarInterface> cars) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
         //To change body of generated methods, choose Tools | Templates.
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfCars() {
        return getNumberOfCars(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
