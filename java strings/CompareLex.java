import java.util.Scanner;
class CompareLex
{
public static void main(String args[])
{
String a,b;
Scanner in = new Scanner(System. in);
System.out.println("Enter string 1 :-");
a = in.nextLine();
System.out.println("Enter string 2 :-");
b = in.nextLine();

int result = a.compareToIgnoreCase(b);
        if(result<0)
        {
        	System.out.println(a + " is less than "+ b);
        }
        else if(result==0)
        {
        	System.out.println(a + " is equal to " + b);
        }
        else
        {
        	System.out.println(a + " is greater than "+ b);
        }
    }
}
