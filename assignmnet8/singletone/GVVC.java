/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author ajay
 */

public class GVVC {
    
    String name;
    int age ;
    public static GVVC myvc;
    private GVVC(String name )
    {
        this.name = name ;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getVC()
    {
        return name + " he is " + age +" years old";
    }
    public static GVVC getInstance(String name )
    {
        if (myvc == null )
        {
            myvc =  new GVVC(name);
        }
           return myvc;
     }
}
    


