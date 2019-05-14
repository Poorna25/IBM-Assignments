import java.util.Scanner;
import com.cg.eis.exception.EmployeeException;

class Employee
{
public static void main(String args[])throws EmployeeException
{
Scanner in = new Scanner(System. in);
System.out.print("Enter your Salary :- ");
int sal = in.nextInt();

	if(sal < 3000)
	{
		 throw new EmployeeException("Your salary is lesser than expected...");
	}
	else
	{
		System.out.print("Your salary is :- "+sal);
	}


}
}