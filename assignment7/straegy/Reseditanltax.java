/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author shivu
 */
public class reseditanltax implements taxinterface {

    double a;
    
    @Override
    public double getInterest(double a) {
        return (a * 20)/100;
        
    }    
}

