package com.ocp.services;

import com.ocp.service.Service;

public class ServiceB implements Service {

	@Override
	public void doSomething() {
		System.out.println("The service B is called.");
	}

	@Override
	public String identify() {
		return "B";
	}

}
