import java.time.*;
import java.util.*;
import java.util.Scanner;
class DateAndDuration
{
   public static void main(String[] args)
    {
    	int d,m,y;
		Scanner in = new Scanner(System. in);
		System.out.println("Enter any date in DD MM YYYY format :- ");
		d = in.nextInt();
		m = in.nextInt();
		y = in.nextInt();
        LocalDate ldate = LocalDate.of(y, m, d);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(ldate, now);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(), diff.getDays());
  }
}