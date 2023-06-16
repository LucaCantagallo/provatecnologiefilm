package com.allenamento.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class ContextSingleton {
	
	private static Object a = new Object(); 
	private static ClassPathXmlApplicationContext context = null;

	private ContextSingleton(String path) {
		this.context = new ClassPathXmlApplicationContext(path);  
		context.registerShutdownHook();
	}
	


	public String toString() {
		return "Context [";
	}
		
	private static ContextSingleton istanza = null;  


	public static ContextSingleton crea() {
		if (istanza == null) {
				synchronized (a) { 
				  if (istanza == null) {
				      istanza = new ContextSingleton("beans.xml");
				   }
				}
		}
		return istanza;	
	}
	
	public static ClassPathXmlApplicationContext getContext() {
		if (context == null) {
			istanza = crea();
			return getContext();
		}
		return context;
	}
	

}
