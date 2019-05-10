import java.util.Scanner;
class ReplaceRWithT
{
public static void main(String args[])
{
String a,b;
Scanner in = new Scanner(System. in);
System.out.println("Enter string 1 :-");
a = in.nextLine();
b=a.replace('r','t');

System.out.println("Result :- "+b);
}

}