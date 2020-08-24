package com.chandra.main;
import com.chandra.beans.Country;
import com.chandra.beans.SingletonCountry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class ScopesInSpringMain{
 
	public static void main(String[] args) 
	{
 
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		System.out.println("Prototype Scope");
		Country countryObj1 = (Country) appContext.getBean("country");
		countryObj1.setCountryName("India");
		System.out.println("Country Name:"+countryObj1.getCountryName());
 
		//getBean called second time
		Country countryObj2 = (Country) appContext.getBean("country");
		System.out.println("Country Name:"+countryObj2.getCountryName());
		
		
		System.out.println("Singleton Scope");
		
		SingletonCountry Obj1 = (SingletonCountry) appContext.getBean("country1");
		Obj1.setCountryName("India");
		System.out.println("Country Name:"+Obj1.getCountryName());
 
		//getBean called second time
		SingletonCountry Obj2 = (SingletonCountry) appContext.getBean("country1");
		System.out.println("Country Name:"+Obj2.getCountryName());
		
		
		
	}
}