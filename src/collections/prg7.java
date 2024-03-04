package collections;

public class prg7 {
     public static void main(String[] args) {
		int a[]= {10,29,11};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("--------");
		for(int i:a)
		{
			System.out.println(i);
		}
		System.out.println("--------");
		double d[]= {1.3,3.72,89.2,1.0,6};
		for(double e:d)
		{
			System.out.println(e);
		}
		System.out.println("--------");
		String s []= {"tom","jerry"};
		for(String x:s) {
			System.out.println(x);
		}
	}
}
