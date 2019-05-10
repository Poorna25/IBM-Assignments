import java.util.Scanner;
public class Initials
{
	 public static void main(String[] args) {
	 	String str;
	 	char ch;
	 	int len;
	 	Scanner scan = new Scanner(System.in);
	 	System.out.println("enter the input string");
        str = scan.nextLine();
        str = " " + str;
        str = str.toUpperCase();
        len = str.length();
        System.out.println("output =");
        for(int i = 0 ; i < len ; i++){
        	ch = str.charAt(i);
        	if(ch == ' ')
        		System.out.println(str.charAt(i+1) + " ");
        }
	 	
	 }
}
