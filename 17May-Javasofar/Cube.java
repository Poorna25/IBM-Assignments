import java.util.Scanner;

public class Cube

{

   public static void main(String[] args)

    {

    System.out.print("Input number of terms : ");

    Scanner scan = new Scanner(System.in);

		 int number = scan.nextInt();
		 
         int result = 0;
        
        int orig = number;
        
        while(number != 0){
        
            int remainder = number%10;
        
            result = result + (remainder*remainder*remainder);
        
            number = number/10;
        
        
           
}
            System.out.println(result);

 }

}