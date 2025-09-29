/**
 * 
 */
package com.SpringCore.SpringCoreDemos;

import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
public class Jio implements Sim{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling from Jio");
		
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Jio has 1GB of data");
		
	}

}
