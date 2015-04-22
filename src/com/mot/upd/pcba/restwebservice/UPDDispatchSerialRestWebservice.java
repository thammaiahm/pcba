package com.mot.upd.pcba.restwebservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;



/**
 * @author Quinnox Dev Team
 *
 */
@Path("/pcba")

public class UPDDispatchSerialRestWebservice {
	
	
	@GET
	@Produces("application/json")
	public String doGetSerialNumber() {
	    
		return "Successfully created first webservice";
	}

}
