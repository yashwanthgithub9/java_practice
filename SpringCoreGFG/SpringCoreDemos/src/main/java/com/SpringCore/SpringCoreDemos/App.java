package com.SpringCore.SpringCoreDemos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        Sim sim = new Jio();// we can't create new sim() as it is an interface
        // we are now explicitly creating objects, we need spring to create objects for us using IoC container
        
        //Application context to create objects in IoC
        ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");
        Mobile mobile = ac.getBean(Mobile.class);
        mobile.openApp();
        
    }
}
