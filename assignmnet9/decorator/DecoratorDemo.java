/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class DecoratorDemo 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        String1 mystr = new SimpleString();
        System.out.println("Entered String is: \n");
        System.out.println(mystr.Convert());
        
        String1 ustr = new UpperCase(mystr);
        System.out.println("   String in Upper Case  \n");
        System.out.println(ustr.Convert());
        
        String1 lstr = new LowerCase(mystr);
        System.out.println("   String in Lower Case  \n");
        System.out.println(lstr.Convert());
        
        String1 rstr = new ReverseCase(mystr);
        System.out.println("   String in Reverse Case  \n");
        System.out.println(rstr.Convert());
       
    }
    
}
