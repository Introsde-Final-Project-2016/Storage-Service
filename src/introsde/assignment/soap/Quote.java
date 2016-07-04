package introsde.assignment.soap;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class Quote {

	 private static URI getBaseURI() {
         return UriBuilder.fromUri("https://powerful-tor-71241.herokuapp.com/introsde/Quote/getOne").build();
     }

	 // This will take the quote from storage layer
	 public static String getQuote() throws Exception {
    
	  ClientConfig clientConfig = new ClientConfig();
     Client client = ClientBuilder.newClient(clientConfig);
     WebTarget service = client.target(getBaseURI());
     Response response;
	 
     response = service
				.request()
				.accept(MediaType.APPLICATION_JSON)
				.get();
         		
		  String body = response.readEntity(String.class);
		  
		  return body;
	
}
}
