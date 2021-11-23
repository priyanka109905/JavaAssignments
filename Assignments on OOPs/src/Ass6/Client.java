package Ass6;

import java.io.*;
import java.util.*;
public class Client 
{
	public static void main(String[] args)
	{
		Percistence fp=new FilePercistence();
		fp.persist();
		Percistence dp=new DataBasePercistence();
		dp.persist();
	}
}
