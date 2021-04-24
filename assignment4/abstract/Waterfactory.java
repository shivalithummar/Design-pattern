/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author shivi
 */
public class Waterfactory extends Abstractfactorybill
{

    @Override
    public waterbill getWaterBill(int i)
    {
       if(i == 1)
       {
           return new rajkotwaterbill();
       }
       else if(i == 2)
       {
           return new amdwaterbill();
       }
       else
       {
           return null;
       }
    }

    @Override
    public electricitybill getElectricityBill(int i)
    {
        return null;
    }
    
}
