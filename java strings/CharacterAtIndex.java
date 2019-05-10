import java.util.Scanner;
class CharacterAtIndex
{
public static void main(String args[])
{
String s;
Scanner scan = new Scanner(System. in);
System.out.println("Enter the String :-");
s = scan.nextLine();
System.out.println("Enter the index :-");
int i = scan.nextInt();
System.out.println("The character is :-"+ s.charAt(i));   
}
}