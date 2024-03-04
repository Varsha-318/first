package arrays;
import java.util.*;
public class sumofarrays {
       public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("enter data to array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int sum=0;
		for(int j=0;j<a.length;j++)
		{
			sum+=a[j];
		}
		System.out.println("sum values are: "+sum);
	}
}
