package exception;
import java.util.Scanner;
public class pgr1 {
       public static void main(String[] args) {
		System.out.println("Main Start");
		Scanner s=new Scanner(System.in);
		System.out.println("enter no.A");
		int a=s.nextInt();
		System.out.println("enter no.B");
		int b=s.nextInt();
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
		System.out.println("Main End");
	}
}
