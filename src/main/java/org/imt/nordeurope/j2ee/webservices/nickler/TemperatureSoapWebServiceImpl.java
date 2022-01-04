package org.imt.nordeurope.j2ee.webservices.nickler;

import javax.jws.WebService;
import java.util.Date;

@WebService(endpointInterface = "org.imt.nordeurope.j2ee.webservices.nickler.TemperatureSoapWebService", serviceName = "TemperatureSoapWebService")
public class TemperatureSoapWebServiceImpl implements TemperatureSoapWebService{

    @Override
    public Integer getTemperature (String country, Date value){
        Integer temp = null;

        switch (country){
            case "France":
                temp = 1;
                break;
            case "Allemagne":
                temp = 2;
                break;
            case "USA":
                temp = 3;
                break;
            default:
                break;
        }

        return temp;
    }
}
