package com.allenamento.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.allenamento.bean.Attore;
import com.allenamento.bean.Film;
import com.allenamento.context.ContextSingleton;

public class TestClass {

	public static void main(String[] args) {
		System.out.println(getNameFromBeanXML("Ciao"));

	}
	
	private static int getNameFromBeanXML(String nome) {
		ApplicationContext context = ContextSingleton.getContext();
		Film matrix = (Film) context.getBean("matrix");

		
		
		return matrix.getAnnoDiUscita();
	}
	
	private static String getNameFromDirectInput(String nomeFilm) {
		return new Film().toString();
	}

}
