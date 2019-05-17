import java.io.*;
class FileThread

{

	public static void main(String[] args) 

	{

		File s = new File("poorna.txt");

		File t = new File("target.txt");

		CopyDataThread copy = new CopyDataThread(s,t);

		copy.start();

	}

}



class CopyDataThread extends Thread

{

	File s,t;

	CopyDataThread(File s, File t)

	{

		this.s = s;

		this.t = t;

	}


	@Override
	public void run()

	{

		try{

			

			String contents ="";

			int numberofChars = 0; 

			int value = 0;

			FileInputStream in = new FileInputStream(s);

            while((value = in.read())!=-1)

            {

            	contents = contents + (char)value;

                ++numberofChars;

                if(numberofChars == 10)

                {

                	System.out.println("10 characters copied :- " + contents);

                	numberofChars = 0;

                	Thread.sleep(5000);

                }

            }
BufferedWriter bw = new BufferedWriter(new FileWriter(t));

    		bw.write(contents);

    		bw.flush();

			bw.close(); 

		}catch(Exception e)

		{

			System.out.println("Exception is : "+e);

		}

	}

}