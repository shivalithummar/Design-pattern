/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public abstract class DecoratorOfString implements String1 
{
 
    protected String1 str;
    
    public DecoratorOfString(String1 BString)
    {
        this.str = BString;
    
    }
}
