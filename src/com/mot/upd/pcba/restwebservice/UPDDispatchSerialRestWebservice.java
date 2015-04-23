package com.mot.upd.pcba.restwebservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.mot.upd.pcba.pojo.DispatchSerialRequestPOJO;



/**
 * @author Quinnox Dev Team
 *
 */
@Path("/dispatchserialNumber")

public class UPDDispatchSerialRestWebservice {
	
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Response  doGetSerialNumber(DispatchSerialRequestPOJO dispatchSerialRequestPOJO) {
		
	    //
		return Response.status(201).entity(dispatchSerialRequestPOJO).build();
	}

}
