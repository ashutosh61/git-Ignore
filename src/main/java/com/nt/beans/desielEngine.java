package com.nt.beans;

import org.springframework.stereotype.Component;
public class desielEngine {

	@Component("dEngine")
	public class DesielEngine implements IEngine{
		@Override 
		public void startEngine() {
			System.out.println("desielEngine :: desiel engine start");
		}
	}
	
}
