package com.ocp.client;

import com.ocp.services.ServiceA;
import com.ocp.services.ServiceB;
import com.ocp.services.ServiceC;

/**
 * 
 * visit https://qiita.com/pepen/items/ce74af97fb36b84bf63e
 * 
 * */
public class Provider {
	public static void main(String[] args) {

		// プログラムその１
		Program01.set(new ServiceA());
		Program01.set(new ServiceB());
		Program01.set(new ServiceC());

		// プログラムその２
		Program02.set(new ServiceA());
		Program02.set(new ServiceB());
		Program02.set(new ServiceC());

		String target = "B";
		Program01.doSomething(target);
		Program02.doSomething(target);
	}
	
}
