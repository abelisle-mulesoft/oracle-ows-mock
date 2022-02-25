package org.mulesoft.hospitality.oracle.oracleowsmock.service;

import com.micros.webservices.og._4_3.availability.AvailabilityRequestType;
import com.micros.webservices.og._4_3.availability.AvailabilityResponseType;
import com.micros.webservices.ows._5_1.availability.AvailabilityMockInterface;
import org.springframework.stereotype.Service;
import com.micros.webservices.og._4_3.core.OGHeaderType;

import javax.xml.ws.Holder;

/**
 * Service implementation class (also referred to as the service bean).
 *
 * Remark: The service endpoint interface (SEI) is automatically generated using the WSDL as part of the build process.
 *
 * @author Alan Belisle
 */
@Service
public class AvailabilityEndpoint implements AvailabilityMockInterface {
    @Override
    public AvailabilityResponseType availability(Holder<OGHeaderType> header, AvailabilityRequestType availabilityRequest) {
        GeneralAvailability generalAvailability = new GeneralAvailability();

        // Do nothing intentionally
        // Remark: The current revision of this mocking web service ignores the request message's content,
        // and it returns a hardcoded default response.

        return generalAvailability.getAvailability(availabilityRequest);
    }
}
