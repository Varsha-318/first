package filehandling;
import java.io.*;
public class pgr5 {
      public static void main(String[] args) throws IOException{
		FileReader f=new FileReader("C:\\Users\\SANCREDD\\OneDrive - Capgemini\\Documents\\Varsha original degree certificate.pdf");
		BufferedReader br=new BufferedReader(f);
		String s="";
		while(s!=null)
		{
			System.out.println(s);
			s=br.readLine();
			System.out.println(s);
		}
	}
}
