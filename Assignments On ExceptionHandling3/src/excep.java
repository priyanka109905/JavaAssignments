import java.util.Scanner;


public class excep {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Input the first number: ");
    int a = input.nextInt();
    System.out.print("Input the second number: ");
    int b = input.nextInt();
    try  
    {  
    int data=a/b; //may throw exception   
    System.out.println(data);
    }  
        //handling the exception  
    catch(ArithmeticException e)  
    {  
        System.out.println(e);  
    }  
    
    System.out.println("rest of the code");  
}  
}
