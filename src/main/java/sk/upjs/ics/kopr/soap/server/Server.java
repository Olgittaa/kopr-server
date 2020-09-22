package sk.upjs.ics.kopr.soap.server;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {
    	Endpoint.publish("http://localhost:8888/", new CoronaService());
    }
}
