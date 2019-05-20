import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Arrays;


class ReverseSort
{
	public static void main(String args[])
	{
		int result[] = getSorted();
		System.out.println("The result is :- ");
		for(int i = 0 ; i<result.length ; i++)
		{
		System.out.println(result[i]);
		}
	}
	public static int[] getSorted()
	{
		System.out.println("Enter the size of array :- ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		String str;
		for(int i = 0; i < n ; i++)
		{
			System.out.println("Enter the element in array :- ");
			arr[i] = scan.nextInt();

		}
		
		for(int i = 0; i < n ; i++)
		{
			str = String.valueOf(arr[i]);
			StringBuilder sb = new StringBuilder();
			sb.append(str);
			sb = sb.reverse();
			arr[i] = Integer.parseInt(sb.toString());
		}
		Arrays.sort(arr);
		return arr;
}
}