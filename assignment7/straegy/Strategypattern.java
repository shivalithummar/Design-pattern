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
public class strategypattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Context c=new Context();
        c.Tex(new EducatinalTax());
       System.out.println("edutional tax= " + c.executestrategy(2000));
       
       c.Tex(new ReseditanlTax());
       System.out.println("Resediantal tax= " + c.executestrategy(2000));
        
       c.Tex(new HospitalTax());
       System.out.println("Hospital tax = " + c.executestrategy(10000));
       
       c.Tex(new CommercialTax());
       System.out.println("Commercial Tax = " + c.executestrategy(2000));
    }
    
}

