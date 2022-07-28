package com.muzammilnagariya.msasecondapp.service;

import Entity.Customer;
import ejb.PublicationSessionBean;
import java.util.Collection;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/example")
public class ExampleService {
    
    @Inject PublicationSessionBean psb;

    @RolesAllowed("Admin")
    @GET
    public String sayHello() {
        return "Hello World From MSA Client";
    }
    
    
    @RolesAllowed("Admin")
    @GET
    @Path("/GetAllCustomer")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Customer> GetAllCustomer() {
        return psb.GetAllCustomer();
    }
    

}
