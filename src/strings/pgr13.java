package strings;
import java.util.Scanner;
public class pgr13 {
     public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String st=s.nextLine();
		String st1="";
		char ch[]=st.toCharArray();
		for(int i=0;i<st.length()/2;i++)
		{
	     char t=ch[i];
	     ch[i]=ch[ch.length-1-i];
	     ch[ch.length-1-i]=t;
		}
		st1=new String(ch);
		if(st1.equalsIgnoreCase(st))
			System.out.println(st+" is pallandrome");
		else
			System.out.println(st+" is not pallondrome");
	}
}
