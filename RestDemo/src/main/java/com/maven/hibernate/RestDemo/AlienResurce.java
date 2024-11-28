package com.maven.hibernate.RestDemo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ali") //when aliens is called in URI this class is invoked http://localhost:8080/RestDemo/webapi/aliens
public class AlienResurce {
	
	
//	@GET // class will throw 404 error because GET is not defined so it will not get any method call
//	@Produces(MediaType.APPLICATION_JSON)//This will give output in JSON format
	@GET
	@Produces(MediaType.TEXT_PLAIN)
//	@Consumes(MediaType.APPLICATION_XML)
	public String getAlien() {
		System.out.println("Alien method called");
		Alien a1=new Alien();
		a1.setName("Yashwanth");
		a1.setPoints(98);
		return a1.getName()+a1.getPoints();
		
	}

}
