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
public class RealInternet implements Internet 
{
    public void doconnect(String serverhost) 
    { 
        System.out.println("Connecting to "+ serverhost); 
    } 
}

