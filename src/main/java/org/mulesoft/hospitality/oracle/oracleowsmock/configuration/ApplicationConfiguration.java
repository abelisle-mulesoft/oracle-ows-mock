package org.mulesoft.hospitality.oracle.oracleowsmock.configuration;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.mulesoft.hospitality.oracle.oracleowsmock.service.AvailabilityEndpoint;
import javax.xml.ws.Endpoint;

@Configuration
public class ApplicationConfiguration {
    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint(AvailabilityEndpoint availabilityEndpoint) {
        EndpointImpl endpoint = new EndpointImpl(bus, availabilityEndpoint);
        endpoint.publish("/Availability");
        return endpoint;
    }
}
