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
public class Rajkotwaterbill implements waterbill
{

    @Override
    public String CustomerNm() 
    {
       return "shivu";
    }

    @Override
    public double getBillAmount(double amt, double unit) 
    {
        return amt*unit;
    }
    
}
