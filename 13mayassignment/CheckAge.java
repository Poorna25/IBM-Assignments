import java.util.Scanner;
class PersonAgeException extends Exception{
	public PersonAgeException(String s){
		System.out.println(s);
	}
}
public class CheckAge {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter age");
		int n = scan.nextInt();
		try{
			if(n <= 15)
				throw new PersonAgeException("Wrong age");
			else
				System.out.println("correct age");
		}
		catch(PersonAgeException pae){
			System.out.println(pae);
		}
	}
}