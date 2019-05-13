class MySubstring
{
	public static void main(String args[])
	{
		mySubstring(4);
		mySubstring(4,5);
	}

		public static void mySubstring(int startIndex)
		{
			String str = "International";
			int l=str.length();
			for(int i = startIndex ; i < l ; i++)
			{
				System.out.print(str.charAt(i));
			}

			System.out.println();

		}

		public static void mySubstring(int startIndex, int endIndex)
		{

			String str = "International";
			int l=str.length();
			for(int i = startIndex ; i < (startIndex + endIndex) ; i++)
			{
				System.out.print(str.charAt(i));
			}
			System.out.println();
		}
}