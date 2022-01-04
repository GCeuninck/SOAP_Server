package org.imt.nordeurope.j2ee.webservices.nickler;

import javax.xml.ws.Endpoint;

public class TemperatureSoapWebServicePublisher {
    public static void main(String[] args) {
        System.out.println("Starting Server");
        TemperatureSoapWebServiceImpl implementor = new TemperatureSoapWebServiceImpl();
        String address = "http://localhost:9000/TemperatureSoapWebService";
        Endpoint.publish(address, implementor);
    }
}
