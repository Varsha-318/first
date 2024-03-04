package strings;
import java.util.Scanner;
public class pgr12 {
     public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		String str=s.next();
		int j=0;
		char[]ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=48&&ch[i]<=57)
			{
				j+=ch[i]-48;
			}
		}
		System.out.println(j);
	}
}
