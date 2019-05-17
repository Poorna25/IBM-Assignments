import java.io.*;
class ReadAndDisplay
{
public static void main(String args[])throws Exception
{
int c=0;

try
{
File file = new File("poorna.txt");
FileReader fr=new FileReader(file);
BufferedReader br=new BufferedReader(fr);
String t;
while((t=br.readLine())!=null)
{
c++;
System.out.println(c + " " +t);
}
fr.close();
}


catch(FileNotFoundException fe)
{
	System.out.println("file not found" + fe);
}
catch(IOException ioe)
{
	System.out.println("exception is there" + ioe);
}
}
}