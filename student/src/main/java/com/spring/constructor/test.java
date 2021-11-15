package com.spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ref.A;

public class test {

	public static void main(String[] args) {
		 ApplicationContext context=new  ClassPathXmlApplicationContext("com/spring/constructor/ci.xml");
		 
		 Person p=(Person)context.getBean("person");
		 System.out.println(p);
	}

}
