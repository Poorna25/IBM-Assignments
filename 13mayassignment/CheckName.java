import java.util.Scanner;
class PersonNameException extends Exception{
	public PersonNameException(String s){
		System.out.println(s);
	}
}
public class CheckName {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter First Name");
		String first = scan.nextLine();
		System.out.println("enter last name");
		String last = scan.nextLine();
		try{
			if(first == "" && last == "")
				throw new PersonNameException("Fill the total name");
			else
				System.out.println("correct name");
		}
		catch(PersonNameException pne){
			System.out.println(pne);
		}
	}
}