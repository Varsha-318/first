package collections;
import java.util.ArrayList;
public class prg5 {
         public static void main(String[] args) {
			ArrayList a=new ArrayList();
			a.add(87);
			a.add(77);
			a.add(21);
			a.add(99);
			a.add('&');
			System.out.println(a);
			a.add(2,9);  //2 is index and 9 is the number we are inserting that index
			System.out.println(a);
			a.set(3,54); // set is used to replace the variable in given index
			System.out.println(a);
			for(Object x:a) {  // x is an reference variable 
				System.out.println(x);
			}
		}
}
