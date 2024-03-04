package strings;

import java.util.Scanner;

public class pgr7 {
      public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=s.next();
		String s2="";
		//without builtin methods
		for(int i=0;i<s1.length();i++)
		{
			s2=s1.charAt(i)+s2;
		}
		System.out.println(s2);
		for(int i=s2.length()-1;i>=0;i--)
		{
			System.out.println();
		}
		System.out.println();
		//with builtin methods
		StringBuilder sb=new StringBuilder(s1);
		System.out.println(sb.reverse());
	}
}
