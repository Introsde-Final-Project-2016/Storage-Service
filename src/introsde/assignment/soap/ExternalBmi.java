package introsde.assignment.soap;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;
import org.json.JSONArray;

public class ExternalBmi {
	
	
     private static URI getBaseURI(Double weight, Double height) {
              return UriBuilder.fromUri("https://powerful-tor-71241.herokuapp.com/introsde/BmiCalculate/"+weight+"/"+height).build();
          }

    // This is taking the BMI information and other related things from Storage layer
     public static String getBmi(Double weight, Double height) throws Exception {
         
    	  ClientConfig clientConfig = new ClientConfig();
          Client client = ClientBuilder.newClient(clientConfig);
          WebTarget service = client.target(getBaseURI(weight,height));
          Response response;
    	 
          response = service
  				.request()
  				.accept(MediaType.APPLICATION_JSON)
  				.get();
              		
  		  String body = response.readEntity(String.class);
  		  
  		  return body;
	
}
}
