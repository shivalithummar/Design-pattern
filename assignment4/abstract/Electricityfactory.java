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
public class Electricityfactory extends Abstractfactorybill
{

    @Override
    public waterbill getWaterBill(int i) 
    {
        return null;
    }

    @Override
    public electricitybill getElectricityBill(int i) 
    {
       if(i == 1)
       {
           return new rajkotelectricitybill();
       }
       else if(i == 2)
       {
           return new amdelectricitybill();
       }
       else
       {
           return null;
       }
    }
    
}
