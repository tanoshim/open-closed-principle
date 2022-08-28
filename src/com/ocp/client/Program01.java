package com.ocp.client;

import com.ocp.services.ServiceA;
import com.ocp.services.ServiceB;
import com.ocp.services.ServiceC;

public class Program01 {

	private static ServiceA objA;
	private static ServiceB objB;
	private static ServiceC objC;

	public static void set(ServiceA obj) {
		objA = obj;
	}

	public static void set(ServiceB obj) {
		objB = obj;
	}

	public static void set(ServiceC obj) {
		objC = obj;
	}

	public static void doSomething(final String id) {
		System.out.println("Program01");
		if (id.equals("A")) {
			objA.doSomething();
		} else if (id.equals("B")) {
			objB.doSomething();
		} else if (id.equals("C")) {
			objC.doSomething();
		}
	}
}
