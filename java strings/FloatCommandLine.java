class FloatCommandLine
{

	public static void main(String... args)
	{

		if(args.length <= 1)	{

			System.out.println("Error!!!");

			return;

		}


		float Sum=0.0f;

		for(int i=0; i<args.length; ++i)	{

			float temp = Float.parseFloat(args[i]);

		

			Sum =  Sum + temp;

		}

		System.out.printf("Sum is: %.2f",  Sum);

	}

}