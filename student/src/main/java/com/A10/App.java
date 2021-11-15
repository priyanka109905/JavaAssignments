package com.A10;

import java.lang.module.ModuleDescriptor.Builder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/A10/ci.xml");

		Application n = (Application) context.getBean("noob");

		//n.wait();

		Builder a = (Builder) context.getBean("pro");
		//a.slow();

	}

}