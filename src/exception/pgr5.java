package exception;
import java.io.*;
public class pgr5 {
     void readData() throws FileNotFoundException
             {
            	 FileReader f=new FileReader("abc.txt");
             }
     public static void main(String[] args) {
		pgr5 p=new pgr5();
		try
		{
			p.readData();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found");
			System.out.println(e.getStackTrace());
			e.getStackTrace();
		}
	}
}
