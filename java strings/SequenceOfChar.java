import java.util.Scanner;
class SequenceOfChar
{
public static void main(String args[])
{
String a,b;
Scanner in = new Scanner(System. in);
System.out.println("Enter string  :-");
a = in.nextLine();
System.out.println("Enter sequence :-");
b = in.nextLine();
System.out.println("Result :- "+ a.contains(b));
}
}