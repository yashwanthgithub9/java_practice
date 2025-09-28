package com.SpringCore.SpringCoreDemos;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Sim sim = new Jio();// we can't create new sim() as it is an interface
        // we are now explicitly creating objects, we need spring to create objects for us using IoC container
        sim.calling(); // Calling methods
        sim.data();
    }
}
