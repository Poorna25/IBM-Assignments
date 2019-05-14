import java.util.Scanner;
class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value required for Fibonacci Sequence...");
		int n = sc.nextInt();
		int t1 = 0, t2 = 1 ,sum=0;
        System.out.print(n + "th value is :- ");

    
    	 
  
        for (int i = 1; i < n; ++i)
        {
           

            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
         System.out.println(sum);

        System.out.println("Using recursion :- "+fib(n));
  

	}
	public static int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib(n-1) + fib(n-2); 
    } 
}