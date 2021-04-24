/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstractfactory;

/**
 *
 * @author shivi
 */
public abstract class Abstractfactorybill 
{
     public abstract waterbill getWaterBill(int i);
    public abstract electricitybill getElectricityBill(int i);
   
    
    public static abstractfactorybill getFactory(int i)
    {
        if(i == 1)
        {
            return new waterfactory();
        }
        else if(i == 2)
        {
            return new electricityfactory();
        }
        
        else
        {
            return null;
        }
    }
}
