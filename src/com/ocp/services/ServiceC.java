package com.ocp.services;

import com.ocp.service.Service;

public class ServiceC implements Service {

	@Override
	public void doSomething() {
		System.out.println("The service C is called.");
	}

	@Override
	public String identify() {
		return "C";
	}

}
