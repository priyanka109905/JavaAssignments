package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[]args)
	{
		 ApplicationContext context=new  ClassPathXmlApplicationContext("com/spring/collection/Springconfig.xml");
	     Emp emp = (Emp) context.getBean("emp");
	     System.out.println(emp.getName());
	     System.out.println(emp.getPhone());
	     System.out.println(emp.getAddress());
	}

}
