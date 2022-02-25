package org.mulesoft.hospitality.oracle.oracleowsmock.configuration;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.mulesoft.hospitality.oracle.oracleowsmock.service.AvailabilityEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * (Obviously) Spring Boot Configuration class for defining beans.
 *
 * @author Alan Belisle
 */
@Configuration
public class ApplicationConfiguration {
    // Defining a bus element in our Spring configuration. The bus is the backbone of the CXF architecture.
    // It manages extensions and acts as an interceptor provider.
    @Autowired
    private Bus bus;

    // Defining/enabling our CXF JAX-WS endpoint, which will respond to SOAP requests according to the
    // specified URI pattern - e.g., http://localhost:8080/OWS_WS_51/Availability
    @Bean
    public Endpoint endpoint(AvailabilityEndpoint availabilityEndpoint) {
        EndpointImpl endpoint = new EndpointImpl(bus, availabilityEndpoint);
        endpoint.publish("/Availability");
        return endpoint;
    }
}
