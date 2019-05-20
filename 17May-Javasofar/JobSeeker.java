import java.util.Scanner;
import java.lang.String;
class JobSeeker
{
	public static void main(String args[])
	{
		String usrname;
		Scanner in = new Scanner(System. in);
		System.out.println("Enter username :- ");
		usrname=in.nextLine();
		if(validate(usrname))
		{
			System.out.println("Username Validated...");
		}
		else
		{
			System.out.println("Username not Validated...");
		}
	}
	public static boolean validate(String usrnm)
	{
		if(!(usrnm.endsWith("_job")))
		{
			return false;
		}
		else if((usrnm.length() - 4) < 8)
		{
			return false;
		}
		else return true;
	}
}