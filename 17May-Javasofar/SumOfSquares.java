import java.util.Scanner;
import java.lang.Math;

class SumOfSquares
{
	public static void main(String s[]) 
	{ 
	    Scanner scan = new Scanner(System.in);
	  	System.out.println("Enter the input number :- ");
	  	int n = scan.nextInt(); 
	    System.out.println("Result is :- " + calculateDifference(n));      
	      
	} 
  
static int calculateDifference(int n){ 
  
int l, k, m; 
    l = (n * (n + 1) * (2 * n + 1)) / 6; 
      
    k = (n * (n + 1)) / 2; 
  
    k = k * k; 
      
    m = Math.abs(l - k); 
      
    return m; 
  
} 
}  