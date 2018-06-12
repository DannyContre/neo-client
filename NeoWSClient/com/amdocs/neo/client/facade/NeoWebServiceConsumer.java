package com.amdocs.neo.client.facade;

public class NeoWebServiceConsumer extends WebServiceConsumer {
	
	private final static String API_KEY = "api_key=DEMO_KEY";
	private final static String API_URI = "https://api.nasa.gov/neo/rest/v1/neo/browse";
	private String queryPath = "page=0&size=20&"+API_KEY;
	
	public NeoWebServiceConsumer(){
		super(API_URI);
	}

	public String retrieveNeos(){
		return this.executeHttpsGET(queryPath);
	}
}