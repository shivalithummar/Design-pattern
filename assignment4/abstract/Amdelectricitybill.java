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
public class Amdelectricitybill implements electricitybill
{

    @Override
    public String CustomerNm() 
    {
       return "shivi";
    }

    @Override
    public double getBillAmount(double amt, double unit) 
    {
        return amt*unit;
    }
    
}
