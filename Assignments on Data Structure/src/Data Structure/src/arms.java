public class arms {

    public static void main(String[] args) {

        int n=130;
        int temp=n;
        int r;
        int sum=0;
        while(n!=0)
        {
        	r=n%10;
        	n=n/10;
        	sum=sum+r*r*r;
        }
        
        if(temp==sum)
        {
        	System.out.println("Armstrong No");
        }
        else
        {
        	System.out.println(" Not a armstrong no");
        }
    }
}