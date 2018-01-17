package com.au.RestAssignment.EmployeeManagement.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import modal.Employee;
import service.EmployeeService;

@Path("/EmployeeResource")
public class EmployeeResource {

	EmployeeService employeeService=new EmployeeService();
	 	@Path("get/{id}")
		@GET
	    @Produces({"application/json","application/xml"})
	    public Response getEmployee(@PathParam("id") String id) {
	    	
	    	Employee emp=employeeService.getEmployee(Integer.parseInt(id));
	        return Response.ok(emp).build();
	    };
	    @Path("/add")
	    @POST
	    @Consumes({"application/json","application/xml"})
	    @Produces({"application/json","application/xml"})
	    public Response addEmployee(Employee employee)
	    {
	    	
	    	boolean status=employeeService.addEmployee(employee.getId(),employee);
	    	if(status==true)
	    		return Response.ok("Employee added Successfully").build();
	    	else
	    		return Response.ok("Employee cannot be added").build();
	    	
	    }
	    
	    @Path("/update")
	    @PUT
	    @Consumes({"application/json","application/xml"})
	    @Produces({"application/json","application/xml"})
	    public Response updateEmployee(Employee employee)
	    {
	    	
	    	boolean status=employeeService.updateEmployee(employee.getId(), employee);
	    	if(status==true)
	    		return Response.ok("Employee updated Successfully").build();
	    	else
	    		return Response.notModified().build();
	    	
	    }
	    @Path("/delete/{id}")
	    @DELETE
	    @Consumes({"application/json","application/xml"})
	    @Produces({"application/json","application/xml"})
	    public Response deleteEmployee(@PathParam("id") int id)
	    {
	    	
	    	boolean status=employeeService.deleteEmployee(id);
	    	if(status==true)
	    		return Response.ok("Employee deleted Successfully").build();
	    	else
	    		return Response.ok("No Employee with suck id exists").build();
	    	
	    }
	    
	    
}
