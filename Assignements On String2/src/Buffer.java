public class Buffer{  
    public static void main(String[] args){  
    	
    	
    	StringBuffer buffer=new StringBuffer("");  

    	 buffer.append("string buffer "); 
    	 buffer.append("is a peer class of string"); 
    	 buffer.append("that provides much of "); 
    	 buffer.append("the functionalit of string "); 
    	 System.out.println(buffer);  
    	 
    	 
    	 
    	 StringBuffer sb=new StringBuffer("It is used to at the specified index position ");  
    	 sb.insert( 14," insert text");//now original string is changed  
    	 System.out.println(sb);
    	 
    	 
    	 StringBuffer ab=new StringBuffer("This Method returns the reversed object on wich it was called");  
    	 ab.reverse();  
    	 System.out.println(ab);
    }  
}  