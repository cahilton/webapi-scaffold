package org.ohdsi.webapi.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;


@Path("{sourceKey}/test/")
@Component
public class TestService extends AbstractDaoService {

	  @Path("")
	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String getTestResult(@PathParam("sourceKey") final String sourceKey) {
		  return "It works! \nSource: " + sourceKey;
	  }
}
