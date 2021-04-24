/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author shivu
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         Internet internet = new ProxyInternet(); 
        try
        { 
            internet.doconnect("www.gujaratvidyapith.org"); 
            internet.doconnect("xyz.com"); 
        } 
        catch (Exception e) 
        { 
            System.out.println(e.getMessage()); 
        } 
    }
    
}

