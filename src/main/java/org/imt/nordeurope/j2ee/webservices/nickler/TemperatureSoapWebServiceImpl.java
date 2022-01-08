package org.imt.nordeurope.j2ee.webservices.nickler;

import javax.jws.WebService;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@WebService(endpointInterface = "org.imt.nordeurope.j2ee.webservices.nickler.TemperatureSoapWebService", serviceName = "TemperatureSoapWebService")
public class TemperatureSoapWebServiceImpl implements TemperatureSoapWebService{

    @Override
    public Integer getTemperature (String country, Date value){
        Integer temp = null;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = simpleDateFormat.format(value);

        switch (country){
            case "France":
                if (LocalDate.now().toString().equals(date)) {
                    temp = 1;
                } else {
                    temp = 3;
                }
                break;
            case "Allemagne":
                if (LocalDate.now().toString().equals(date)) {
                    temp = 2;
                } else {
                    temp = 7;
                }
                break;
            case "USA":
                if (LocalDate.now().toString().equals(date)) {
                    temp = 3;
                } else {
                    temp = 10;
                }
                break;
            default:
                break;
        }

        return temp;
    }
}
