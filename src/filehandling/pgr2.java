package filehandling;
import java.io.File;
import java.io.IOException;
public class pgr2 {
       public static void main(String[] args) {
		File f=new File("C:\\hello/abc.txt"); //create file
		if(f.exists()==false) //tofile is already present or not
		{
			try
			{
				f.createNewFile();
				System.out.println("file created");
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("file already exist");
		}
	}
}
