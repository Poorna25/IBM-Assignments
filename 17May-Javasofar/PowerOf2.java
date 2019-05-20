import java.util.*;
import java.io.*;
public class PowerOf2 {
 
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter a number to check whether it is a power of two or not");
  int n = scan.nextInt();
  System.out.println(powerOf2(n));
 }
 
 private static boolean powerOf2(int number){
  if(number<=0){
   return false;
  }
   
  while(number > 1){
   if(number % 2 != 0){
    return false;
   }
   number = number / 2;
  }
  return true;
 }
 
}