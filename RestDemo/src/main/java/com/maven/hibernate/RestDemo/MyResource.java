package com.maven.hibernate.RestDemo;

//worked using javax.ws.rs.* instead of jakarta.ws.rs.* 

/**
 * Root resource (exposed at "myresource" path)
 */
@javax.ws.rs.Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
}
