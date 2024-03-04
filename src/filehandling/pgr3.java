package filehandling;
import java.io.FileWriter;
import java.io.IOException;
public class pgr3 {
      public static void main(String[] args) {
		try
		{
			FileWriter f=new FileWriter("c:\\hello/abc.txt");
			f.write("hi");
			f.flush(); //it is a method used to flush or print the data into file
			System.out.println("writing data is completed");
		}
		catch(IOException e)
		{
			System.out.println("Error in printing the data");
			e.printStackTrace();
		}
	}
}
