package com.app;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
@Path("/show")
public class Test {
	@POST
	public void showA() {
		System.out.println("204 Status");
	}

}
