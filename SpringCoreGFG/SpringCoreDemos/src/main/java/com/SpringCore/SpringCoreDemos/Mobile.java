/**
 * 
 */
package com.SpringCore.SpringCoreDemos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
public class Mobile {
	
	/*
	 * // @Autowired private Sim sim; // At this point there is no connection
	 * between Sim and mobile public void setSim(Sim sim) { this.sim = sim; }
	 */
	
	/*
	 * // Constructor injection private Sim sim;
	 * 
	 * public Mobile(Sim sim) { super(); this.sim = sim; }
	 */
	@Autowired
	@Qualifier("jiobean")// at this point spring knows which bean to inject
	private Sim sim;
	
	public void openApp() {
		
		System.out.println("Opening app...");
		sim.calling();
		sim.data();
	}



}
