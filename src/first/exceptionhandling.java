//package first;
//
////public class exceptionhandling {
////		public static void main(String[] args) {
////			try {
////				System.out.println("inside try block");
////				int i=7/0;
////				System.out.println(i);
////			}
////			catch(Exception e) {
////				System.out.println("inside catch block");
////			}
////		}
////}
//		
//
////public class exceptionhandling {
////	public static void main(String[] args) {
////		try {
////			System.out.println("inside try block");
////			int i=7/0;
////			int result=i/0;
////			System.out.println(result);
////		}
////		catch(Exception e) {
////			e.printStackTrace();
////			System.out.println(e);
////			System.out.println("inside catch block");
////		}
////	}
////}
//
//
////import java.util.Scanner;
////public class exceptionhandling{
////	static int counter=0;
////	public static void main(String[] args) {
////		try{
////			Scanner sc=new Scanner(System.in);
////			if(counter==0) {
////			System.out.println("Enter divider but not 0");
////			}
////			int divider=sc.nextInt();
////			int dividend=4;
////			int result=dividend/divider;
////			System.out.println("the result is "+result);
////		}
////		catch(Exception e) {
////			System.out.println("inside catch block");
////			System.out.println("I have told you to not give 0");
////			counter++;
////			main(null);
////		}
////	}
////}
//
//
////import java.util.Scanner;
////public class exceptionhandling{
////	public static void main(String[] args) {
////		try{
////			Scanner sc=new Scanner(System.in);
////		
////			System.out.println("Enter divider but not 0");
////			
////			int divider=sc.nextInt();
////			int dividend=4;
////			int result=dividend/divider;
////			System.out.println("the result is "+result);
////			int[] arr={3,4,2};
////			System.out.println("enter index of an array");
////			int index=sc.nextInt();
////			System.out.println(arr[index]);
////		}
////		catch(ArithmeticException e) {
////			System.out.println("I have told you to not give 0");
////			main(null);
////		}
////		
////	}
////}
//
//
//import java.util.Scanner;
//public class exceptionhandling {
//	public static void main(String[] args) throws except:
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter age");
//	int age=sc.nextInt();
//	if(age>30) {
//		System.out.println("you are not allowed");
//		throw new ArithmeticException();
//	}
//	else 
//	{
//		System.out.println("youre allowed");
//	}
//}




