import java.util.Arrays;  
public class PositiveString{ 
  
    static boolean isPositiveString(String s)  
    {  
        int n = s.length();  
        
        char c[] = new char [n];  
        
        for (int i = 0; i < n; i++) {  
            c[i] = s.charAt(i);  
        }  
        
        Arrays.sort(c);  
        
        for (int i = 0; i < n; i++)  
            if (c[i] != s.charAt(i))   
                return false;  
                
        return true;      
    }  
      
    public static void main(String args[]) 
    { 
        String s = "bdfoz";  
          
        if (isPositiveString(s))  
           System.out.println("Positive String");  
        else
            System.out.println("Not a Positive String");  
            
    } 
} 