/**
 * 
 */
package com.clevero.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Pankaj Suthar
 *
 */
@Path("/user")
public class AuthenticationAPI {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/login")
	public Response authenticateUser(){
		return null;
	    
	}
	
	public String registerUser(){
		
		
		return null;
		
	}
}
