package org.imt.nordeurope.j2ee.webservices.nickler;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;

@WebService
public interface TemperatureSoapWebService {
    Integer getTemperature (@WebParam(name="country") String country, @WebParam(name="value") Date value);
}
