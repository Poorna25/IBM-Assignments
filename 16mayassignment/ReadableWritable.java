import java.util.*;
import java.io.*;
class ReadableWritable
{
	public static void main(String[] args) {
		
		File file = new File("poorna.txt");
		System.out.println(file.exists());
		
        
        System.out.println(file.canRead());	
        System.out.println(file.canWrite());
        System.out.println(file.length()+"bytes");
        System.out.println(file.isFile());
        
    }
}