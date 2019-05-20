import java.util.Scanner;
class SumOfN
{
	public static void main(String[] args)
	{
	  	int  result=calculateSum();
	  	System.out.println("Result :- " +result);
	}

 	public static int calculateSum()
 	{
	  	Scanner scan = new Scanner(System.in);
	  	System.out.println("Enter the input number :- ");
	  	int n = scan.nextInt();
	  	int sum=0;
	    for(int i=1; i<=n;i++)
	    {
	    	if((i%3)==0 || (i%5)==0)
	    	{
	          	sum=sum+i;
	        }
	    }
	    return sum;
	}
	 
}