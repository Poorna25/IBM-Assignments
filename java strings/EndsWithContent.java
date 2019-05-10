import java.util.Scanner;
class EndsWithContent
{
public static void main(String args[])
{
String a,b;
Scanner in = new Scanner(System. in);
System.out.println("Enter string 1 :-");
a = in.nextLine();
System.out.println("Enter string 2 :-");
b = in.nextLine();

System.out.println("Result :- "+a.endsWith(b));
}

}