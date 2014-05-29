package com.example;

import org.apache.cxf.cdi.CXFCdiServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.jboss.weld.environment.servlet.BeanManagerResourceBindingListener;
import org.jboss.weld.environment.servlet.Listener;

public class Starter {	
	public static void main( final String[] args ) throws Exception {
		final Server server = new Server( 8080 );
		        
 		// Register and map the dispatcher servlet
 		final ServletHolder servletHolder = new ServletHolder( new CXFCdiServlet() );
 		final ServletContextHandler context = new ServletContextHandler(); 		
 		context.setContextPath( "/" ); 		 
 		context.addEventListener( new Listener() ); 		
 		context.addEventListener( new BeanManagerResourceBindingListener() );
 		context.addServlet( servletHolder, "/rest/*" );
 		
        server.setHandler( context );
        server.start();        
        server.join();	
	}
}

