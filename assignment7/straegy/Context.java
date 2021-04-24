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
public class Context {
    private taxinterface t;
    
    public double Textaxinterface t)
    {
        this.t=t;
        return 0;
        
    }

    
    public double ExecuteStrategy(double a)
    {
         return t.getInterest(a);
    }

    
    
    
}

