package introsde.assignment.soap;


import introsde.assignment.soap.ws.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.ejb.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;


import org.json.*;

@Stateless // Used only if the the application is deployed in a Java EE container
@LocalBean // Used only if the the application is deployed in a Java EE container
@Path("/user")


public class Resources {
	
	//get the BMI and weight information
	@GET
    @Produces({ MediaType.APPLICATION_JSON})
    @Path("/getBmi/{weight}/{height}")
    public Response getBmi(@PathParam("weight") double weight, @PathParam("height") double height) throws Exception {
        String result = ExternalBmi.getBmi(weight,height);
        if (result != null) {
            System.out.println("Getting the info of the BMI...");
            return Response.ok(result).build();
        }
        else {
            return Response.status(404).build();
        }
    }
	
	//get the random Quote
	@GET
    @Produces({ MediaType.APPLICATION_JSON})
    @Path("/getOne")
    public Response getQuote() throws Exception {
        String result = Quote.getQuote();
        if (result != null) {
            System.out.println("Getting the info of the Quote...");
            return Response.ok(result).build();
        }
        else {
            return Response.status(404).build();
        }

	}
		//get the data of user
	    @GET
	    @Produces({ MediaType.APPLICATION_JSON})
	    @Path("/getDetail")
	    public Response getPersonDetail() throws Exception {
	        Person user = PeopleClient.getUserDetail();
	        if (user != null) {
	            System.out.println("Getting the info of the user...");
	            return Response.ok(user).build();
	        }
	        else {
	            return Response.status(404).build();
	        }

	    }
	    
		//get GOals
	    @GET
	    @Produces({ MediaType.APPLICATION_JSON})
	    @Path("/getGoals")
	    public Response getAllGoals() throws Exception {
	        List<Goals> glist = PeopleClient.getAllGoals();
	        if (glist != null) {
	            System.out.println("Getting the info of the user...");
	            return Response.ok(glist).build();
	        }
	        else {
	            return Response.status(404).build();
	        }

	    }
    
	    //get goal by id
	    @GET
	    @Produces({ MediaType.APPLICATION_JSON})
	    @Path("/goalId/{goalId}")
	    public Response getGoalById(@PathParam("goalId")int gid) throws Exception {
	    	Goals g = PeopleClient.getGoalById(gid);
	        if (g != null) {
	            System.out.println("Getting the info of the user...");
	            return Response.ok(g).build();
	        }
	        else {
	            return Response.status(404).build();
	        }

	    }
	    
	    // get Life Status by id
	    @GET
	    @Produces({ MediaType.APPLICATION_JSON})
	    @Path("/getLS/{lsId}")
	    public Response getLsById(@PathParam("lsId") int lsid) throws Exception {
	    	LifeStatus ls = PeopleClient.getLsById(lsid);
	        if (ls != null) {
	            System.out.println("Getting the info of the user...");
	            return Response.ok(ls).build();
	        }
	        else {
	            return Response.status(404).build();
	        }

	    }
	    
	    // get all life Status
	    @GET
	    @Produces({ MediaType.APPLICATION_JSON})
	    @Path("/getLifeStatus")
	    public Response getAllLifes() throws Exception {
	        List<LifeStatus> lslist = PeopleClient.getAllLifes();
	        if (lslist != null) {
	            System.out.println("Getting the info of the user...");
	            return Response.ok(lslist).build();
	        }
	        else {
	            return Response.status(404).build();
	        }

	    }
	    
	    
	    // update goal information
	    @PUT
	    @Produces({MediaType.APPLICATION_JSON})
	    @Consumes({MediaType.APPLICATION_JSON})
	    @Path("/updategoal/{goalId}")
	    public void updateGoal(@PathParam("goalId") int goalId, Goals goal) throws Exception {
	        System.out.println("Updating goal...");
	        PeopleClient.updateGoalStatus(goalId, goal.getGoalName(), goal.getGoalValue(), goal.getMeasureType());	    
	    }

	    // update life status information
	    @PUT
	    @Produces({MediaType.APPLICATION_JSON})
	    @Consumes({MediaType.APPLICATION_JSON})
	    @Path("/updateLs/{LsId}")
	    public Response updateLs(@PathParam("LsId") int LsId, LifeStatus ls) throws Exception {
	        System.out.println("Updating goal...");
	       
	        LifeStatus updatedLs =  PeopleClient.updateLifeStatus(LsId, ls.getMeasureName(), ls.getValue());
	        if (updatedLs != null) {
	            System.out.println("Getting the info of the user...");
	            return Response.ok(updatedLs).build();
	        }
	        else {
	            return Response.status(404).build();
	        }    
	    }
	    
	    
	    // interestingly this does not work 
	    // update user information
	    @PUT
	    @Produces({MediaType.APPLICATION_JSON})
	    @Consumes({MediaType.APPLICATION_JSON})
	    @Path("/updateUser/{userId}")
	    public void updateUsr(@PathParam("userId") int uId, Person user) throws Exception {
	      System.out.println("Updating goal..."+uId+"---"+user.getAge()+"---"+user.getEmail()+"---"+user.getGender()+"---"+user.getLastname()+"---"+user.getName());
	      PeopleClient.updateUserStatus(uId, user.getName(), user.getLastname(), user.getEmail(), user.getGender(), user.getAge());   
	    }
	
	
}
       
