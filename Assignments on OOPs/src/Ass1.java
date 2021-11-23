import java.io.*;
import java.util.*;
public class Ass1 
{
	// Create private attribute that refers to a singleton object
	private static Ass1 single=new Ass1();
	
	//Create private constructor that restricts the object to create object
	//outside the class.
	private Ass1()
	{
		
	}
	//Allows us to create and access the object we created.
	public static Ass1 getInstance()
	{
		return single;
	}
	public void getInfo()
	{
		System.out.println("In Singleton class...!!!");
	}

}
