/**
 * 
 */
package com.SpringCore.SpringCoreDemos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
//@Primary // this will become default injection when Sim is injected into mobile
public class Airtel implements Sim{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling from Airtel");
		
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Airtel has 500MB of data");
		
	}
	

}
