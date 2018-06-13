package com.skg;

public class WebsocketClientTest {


    private static final String SERVER_URL_PARAMETER="server-url";
    private static final String SERVER_URL="ws://localhost:8080/websocket-test/wstest";

    public static void main(String[] args) {
        System.out.println("Test ws");
//        String serverEndpointStr = SERVER_URL;
//        		Parameters parameters = getParameters();
//        		if(parameters != null && parameters.getNamed().get(SERVER_URL_PARAMETER) != null) {
//        			serverEndpointStr = parameters.getNamed().get(SERVER_URL_PARAMETER);
//        			if(serverEndpointStr.startsWith("https"))
//        				serverEndpointStr = serverEndpointStr.replaceFirst("https", "wss");
//        			else
//        				serverEndpointStr = serverEndpointStr.replaceFirst("http", "ws");
//        			serverEndpointStr = serverEndpointStr + "/wstest";
//        			logger.debug("Calculated Server Endpoint Address: " + serverEndpointStr);
//        		}
        //return URI.create(serverEndpointStr);

    }
}
