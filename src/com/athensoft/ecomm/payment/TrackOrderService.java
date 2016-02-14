package com.athensoft.ecomm.payment;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/order")
public class TrackOrderService {
	@GET
	@Path("/{orderId}")
	public Response getOrder(@PathParam("orderId") String orderId) {
 
		String output = "You just placed the order : " + orderId;
 
		return Response.status(200).entity(output).build();
 
	}
	
	
	
	/* 
	 * http://ip:port/appname/rest/order/1234/shipaddress/6460%20rue%20sherbrooke%20ouest
	 * */
	@PUT
	@Path("/{orderId}/shipaddress/{shippaddress}")
	public Response updateOrder(@PathParam("orderId") String orderId,
								@PathParam("shippaddress") String shippaddress) {
 
		String output = "You just placed the order : " + orderId;
 
		return Response.status(200).entity(output).build();
 
	}
 
}