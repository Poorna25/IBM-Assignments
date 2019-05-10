import java.util.Scanner;
public class Initials
{
	 public static void main(String[] args) {
	 	Scanner scan = new Scanner(System.in);

	 	String first = scan.nextLine();
	 	String last = scan.nextLine();

	 	String initials = first.substring(0,1) + "." + last.substring(0,1);
	 	System.out.println(initials);
	 }
}