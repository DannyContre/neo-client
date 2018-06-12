package com.amdocs.neo.client;

import com.amdocs.neo.client.service.NeoService;

public class NeoClientMain {

	public NeoClientMain() {
		super();
	}

	public static void main(String[] args) {
		NeoService neoService = new NeoService();

		System.out.println("********** NEO Largest  in Size **********\n" + neoService.findLargestNeo());
		System.out.println("********** NEO Closest to Earth **********\n" + neoService.findClosestToEarthNeo());
		System.out.println("********** Total Number of NEOs **********\n" + neoService.getTotalNumberOfNeo());
	}
}