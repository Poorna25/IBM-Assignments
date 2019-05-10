class AddCommandLine
{
	public static void main(String args[])	{
		if(args.length <= 1)	{
			System.out.println("error !!!");
			return;
		}
		int sum=0;
for(int i=0; i<args.length; ++i)	
		{
			sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println("Sum is: " + sum);
	}
}