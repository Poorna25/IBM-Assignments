import java.util.Scanner;
class PrimeN
{
  public static void main(String[] args)
  {
    int n,flag;
    Scanner scan=new Scanner(System.in);
System.out.println("enter number");  
  n=scan.nextInt();
    for(int i=2;i<n;i++)
    {
      flag=0;
      for(int j=2;j<i;j++)
      {
        if(i%j==0)
        flag=1;
      }
      if(flag==0)
        System.out.println(i);
    }
  }
}