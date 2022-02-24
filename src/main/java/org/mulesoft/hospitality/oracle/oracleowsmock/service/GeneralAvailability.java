package org.mulesoft.hospitality.oracle.oracleowsmock.service;

import com.micros.webservices.og._4_3.availability.AvailabilityRequestType;
import com.micros.webservices.og._4_3.availability.AvailabilityResponseType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import javax.xml.transform.stream.StreamSource;

public class GeneralAvailability {

    // Default/hardcoded XML response for the General Availability request.
    private static final String BEST_AVAILABLE_RESPONSE_FILENAME = "GeneralAvailabilityResponseBestAvailable.xml";

    public AvailabilityResponseType getAvailability(AvailabilityRequestType availabilityRequest) {
        AvailabilityResponseType availabilityResponse = new AvailabilityResponseType();

        try {
            String rootPath = Thread.currentThread().getContextClassLoader().getResource("messages").getPath();

            // Open the default/hardcoded XML file
            File file = new File(rootPath + "/" + BEST_AVAILABLE_RESPONSE_FILENAME);

            // Create the JAXB context for parsing it and converting it to a JAXB object.
            JAXBContext jContext = JAXBContext.newInstance(AvailabilityResponseType.class);

            // Create the unmarshall object
            Unmarshaller unmarshaller = jContext.createUnmarshaller();

            // Finally, unmarshal the default/hardcoded XML file
            availabilityResponse = unmarshaller.unmarshal(new StreamSource(file), AvailabilityResponseType.class).getValue();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return availabilityResponse;
    }
}
