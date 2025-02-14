package com.nt.beans;

import org.springframework.stereotype.Component;
@Component("PEngine")
public class PetrolEngine implements IEngine {
	
	@Override
	public void startEngine() {
		System.out.println("petrol engine start");
	}
	
@Override
public void endEngine() {
	System.out.println("petrol engine stop");
}
}
