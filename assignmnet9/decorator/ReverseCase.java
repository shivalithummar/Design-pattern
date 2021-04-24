/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.*;
/**
 *
 * @author admin
 */
public class ReverseCase extends DecoratorOfString
{

    public ReverseCase(String1 BString)
    {
        super(BString);
    }

    @Override
    public String Convert() 
    {
    String rc = str.Convert();
    StringBuffer sbuffer = new StringBuffer(rc);
    return str.Convert()+ sbuffer.reverse();
    }
}
