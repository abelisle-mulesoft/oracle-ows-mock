package org.mulesoft.hospitality.oracle.oracleowsmock.service;

import com.micros.webservices.og._4_3.availability.AvailabilityRequestType;
import com.micros.webservices.og._4_3.availability.AvailabilityResponseType;
import com.micros.webservices.ows._5_1.availability.AvailabilityMockInterface;
import org.springframework.stereotype.Service;
import com.micros.webservices.og._4_3.core.OGHeaderType;

import javax.xml.ws.Holder;

@Service
public class AvailabilityEndpoint implements AvailabilityMockInterface {
    @Override
    public AvailabilityResponseType availability(Holder<OGHeaderType> header, AvailabilityRequestType availabilityRequest) {
        GeneralAvailability generalAvailability = new GeneralAvailability();

        return generalAvailability.getAvailability(availabilityRequest);
    }
}
