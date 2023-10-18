package org.example.api;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class SalesEmployeeController {
    private SalesEmployeeService salesEmployeeService = new SalesEmployeeService();

    @POST
    @Path("/api/sales-employees")
    @Produces(MediaType.APPLICATION_JSON)
    public Response createSalesEmployee(SalesEmployeeRequest salesEmployeeRequest) {
        return Response.status(201).entity(salesEmployeeService.createSalesEmployee(salesEmployeeRequest)).build();
    }
}
