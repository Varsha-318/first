package filehandling;
import java.io.FileInputStream;
import java.io.*;
public class pgr6 {
      public static void main(String[] args) throws IOException{
		FileInputStream fis=new FileInputStream("C:\\Users\\SANCREDD\\OneDrive - Capgemini\\Documents\\Varsha original degree certificate.pdf");
		int i=fis.read();
		while(i!=-1)
		{
			System.out.println((char)i);
			i=fis.read();
		}
	}
}
