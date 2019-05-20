import java.util.StringTokenizer;
import java.util.Scanner;
class StringTokenize
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		String temp;
		int k,count=0;
		StringTokenizer s1=new StringTokenizer(s);
		System.out.println("Total Number of tokens:"+s1.countTokens());
		while(s1.hasMoreTokens())
		{
			temp=s1.nextToken();
			k=Integer.parseInt(temp);
			count= count + k;
			System.out.print(k+"\t");
		}
		System.out.println("Sum of tokens :"+count);
	}
}