/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class LowerCase extends DecoratorOfString
{

    public LowerCase(String1 BString)
    {
        super(BString);
    }
    @Override
    public String Convert() 
    {
         String lp = str.Convert();
         return str.Convert()+ lp.toLowerCase();
    }
}
