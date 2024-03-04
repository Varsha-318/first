package exception;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class pgr3 {
          public static void main(String[] args) {
			try {
				FileReader f=new FileReader("123.txt");
			}
			catch(FileNotFoundException e){
				System.out.println("File not found");
				System.out.println();
				System.out.println("----------");
				System.out.println(e.getMessage());
			}
		}
}
