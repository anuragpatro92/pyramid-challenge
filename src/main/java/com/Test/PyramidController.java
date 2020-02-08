package com.Test;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/testservice")
public class PyramidController {


	@GET
	@Path("/test1")
	@Produces(MediaType.APPLICATION_JSON)
	public String getTestService() {
		return "Hello World! This is coming from webservice!!";
		}

	
	
}
