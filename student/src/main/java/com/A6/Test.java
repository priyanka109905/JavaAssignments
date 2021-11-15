package com.A6;

	import org.springframework.boot.SpringBootConfiguration;
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.context.annotation.PropertySource;
	import org.springframework.context.support.AbstractApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	@Configuration
	@PropertySource("classpath:app.properties")
	//@SpringBootConfiguration
	public class Test {

		public static void main(String[] args) {
			
			

			ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/A6/ci.xml");
			
			
			Service s= (Service)context.getBean("service");
			
			s.Show();
			
		
			

		}

	}


