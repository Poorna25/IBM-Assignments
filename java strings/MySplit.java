import java.lang.String;
class MySplit
{
	 public static void main(String[] args) 
	{
	 	String str="Thiss aissan myississnissa cariss";
	 	
	 	String delim="iss";
	 	
		int ld=delim.length();
	 	for(int i=0 ; i<(ld-1) ; i++)
			{
			str=str+" ";
		}
	 	MySplit obj = new MySplit();
	 	obj.mySplit(str,delim);
	}

	void mySplit(String s , String d)
	{

		int ls=s.length();
		int ld=d.length();
		
		
		
		for(int i = 0 ; i < ls-ld+1 ; i++)
		{ 
			String strTemp="";
			for(int j = i ; j < i+ld ; j++)
			{

				strTemp = strTemp + s.charAt(j);
			}
			if(strTemp.equals(d))
			{
				System.out.print(" '"+ strTemp +"' ");
				strTemp="";
				i=i+ld-1;

			}
			else
			{
				System.out.print(s.charAt(i));
				strTemp="";

			}
		}
		System.out.println();
	}
}