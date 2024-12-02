package com.spring.SpringDemo;

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
        
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //spring.xml contains configurations for spring project
        Dev dev = applicationContext.getBean(Dev.class);
        Dev dev2 = (Dev) applicationContext.getBean("dev");//we can use id specified in spring.xml
        					//if id is used, it will give object of type Object, so we have to cast it
        dev.build();
        dev2.build();
        
    }
}
