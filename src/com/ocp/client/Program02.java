package com.ocp.client;

import java.util.ArrayList;
import java.util.List;

import com.ocp.service.Service;

public class Program02 {

	static List<Service> listService = new ArrayList<Service>();

	public static void set(Service obj) {
		listService.add(obj);
	}

	public static void doSomething(String id) {
		System.out.println("Program02(Open-closed-principle)");
		for (Service obj : listService) {
			if (!id.equals(obj.identify()))
				continue;
			obj.doSomething();
			break;
		}
	}
}
