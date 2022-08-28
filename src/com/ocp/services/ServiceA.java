package com.ocp.services;

import com.ocp.service.Service;

public class ServiceA implements Service {

	@Override
	public void doSomething() {
		System.out.println("The service A is called.");
	}

	@Override
	public String identify() {
		return "A";
	}

}
