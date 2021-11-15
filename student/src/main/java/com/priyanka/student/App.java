package com.priyanka.student;

 import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=null;
		context=new ClassPathXmlApplicationContext("Springconfig.xml");
		Student std=(Student)context.getBean("Student");
		System.out.println(std);
		if(context!=null)
		{
			context.close();
		}
		
	}

}
