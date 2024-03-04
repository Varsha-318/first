package exception;

import java.util.Scanner;

class InvalidIdException extends RuntimeException{
	
}
class InvalidPasswordException extends RuntimeException{
	
}
public class login {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		String name=s.next();
		System.out.println("enter password");
		int pwd=s.nextInt();
		if(name.equalsIgnoreCase("smith"))
		{
			if(pwd==12345) {
				System.out.println("login successful");
			}
			else {
				try
				{
					InvalidPasswordException i=new InvalidPasswordException();
					throw i;
				}
				catch(InvalidPasswordException e)
				{
					System.out.println("invalid password");
				}
			}
		}
		else
		{
			try
			{
				throw new InvalidIdException();
			}
			catch(InvalidIdException e)
			{
				System.out.println("invalid id");
				main(null);
			}
		}
	}
}
