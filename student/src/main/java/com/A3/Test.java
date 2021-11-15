package com.A3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	 public static void main( String[] args )
	    {
	    	ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("com/A3/ci.xml");  
	        ActBankC obj=(ActBankC)applicationcontext.getBean("BankAccount1");  
	        obj.withdraw();    
	        System.out.println(obj);
	        }

}
