class Builder{  
	
public static void main(String args[]){ 
	
StringBuilder sb=new StringBuilder ("");  
sb.append("String buffer");
sb.append(" is a peer class of string");
sb.append(" that provides much of ");
sb.append(" the functionalit of string");
System.out.println(sb);


StringBuilder ab=new StringBuilder("It is used to at the specified index position ");  
sb.insert( 14," insert text");//now original string is changed  
System.out.println(ab);


StringBuilder cb=new StringBuilder("This Method returns the reversed object on wich it was called");  
ab.reverse();  
System.out.println(ab);
}  
}  
