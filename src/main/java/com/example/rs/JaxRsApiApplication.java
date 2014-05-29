package com.example.rs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@ApplicationPath( "api" )
public class JaxRsApiApplication extends Application {
	@Inject private PeopleRestService peopleRestService;
	@Produces private JacksonJsonProvider jacksonJsonProvider = new JacksonJsonProvider();  
	
	@Override
	public Set< Object > getSingletons() {
		return new HashSet<>(
			Arrays.asList( 
		        peopleRestService, 
		        jacksonJsonProvider 
		    )
	    );
	}
}
