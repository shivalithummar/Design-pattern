/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sss;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shivali
 */
public class LogFile 
{
    public static LogFile lf;
     private final static Logger LOGGER =  
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
     
 

    static 
    {
        lf = new LogFile();
    }

    private LogFile()
    {
    }

    public static LogFile getInstance() {
        return lf;
        
    }
    public void makeSomeLog() 
    { 
        LOGGER.log(Level.INFO, "this is Message 1"); 
        LOGGER.log(Level.INFO, "this is Message 2"); 
     
    } 
    
}
