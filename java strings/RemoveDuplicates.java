import java.lang.String;
class RemoveDuplicates
{
	 public static void main(String[] args) 
	{
	 	String str="hyderabad is a big city";
		str=str.toLowerCase();
		str=str.trim();
		char arr[]=str.toCharArray();

		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] != '\0')
			{
				System.out.print(arr[i]);
			}
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if((arr[j] == arr[i]) && (arr[j] != ' '))
				{
					arr[j]='\0';
				}
			}
		}

		System.out.println();

	}
}