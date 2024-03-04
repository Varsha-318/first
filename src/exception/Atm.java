package exception;
import java.util.Scanner;
class InsufficientBalanceException extends Exception{
	
}
public class Atm {
      public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				int balance=5000;
				System.out.println("enter amount");
				int amt=s.nextInt();
				if(amt<=balance)
				{
					System.out.println("withdrawal successful");
				}
				else
				{
					try
					{
						InsufficientBalanceException i=new InsufficientBalanceException();
						throw i;
						//throw new InsufficientBalanceException():
					}
					catch(InsufficientBalanceException e)
					{
						System.out.println("not enough balance");
					}
				}
	}
}
