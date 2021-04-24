/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstractfactory;

import java.util.Scanner;

/**
 *
 * @author shivi
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
         abstractfactorybill af;
        int ch1,ch2;
        double amount;
        
         Scanner sc=new Scanner(System.in);
        
        System.out.println("1. Water Bill ");
        System.out.println("2. Electricity Bill ");
         
        System.out.println("Enter your choice :");
	ch1=sc.nextInt();
        
	System.out.println("1. Rajkot ");
	System.out.println("2. Ahmedabad ");
         
        System.out.println("Select Your City :");
        ch2=sc.nextInt();
        
        af=abstractfactorybill.getFactory(ch1);
        if(ch1 == 1)
        {
            waterbill wb=af.getWaterBill(ch2);
           System.out.println( wb.CustomerNm());
            System.out.println("Total  Amount :" +wb.getBillAmount(30000, 200));
        }
        else if(ch1 == 2)
        {
            electricitybill eb=af.getElectricityBill(ch2);
             System.out.println(eb.CustomerNm());
            System.out.println("Total Bill Amount :"+eb.getBillAmount(45000, 200));
        }
    }
    
}
