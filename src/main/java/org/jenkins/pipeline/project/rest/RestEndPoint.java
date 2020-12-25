package org.jenkins.pipeline.project.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/endpoint")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON )
public class RestEndPoint {

    /*@POST
    public Response find() {
        return Response.ok()
                .build();
    }*/

    @GET
    public Response getGreetings() {
        return Response.ok("Welcome, This a jenkins pipeling test project, MOZAW TEST")
                .build();
    }

}
