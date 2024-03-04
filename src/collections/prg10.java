package collections;
import java.util.ArrayList;
import java.util.LinkedList;
public class prg10 {
       public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(15);
		l.add(25);
		l.add(55);
		l.add(80);
		for(int i:l) {
			System.out.println(i);
		}
		System.out.println("-----------");
		LinkedList<String> s=new LinkedList<String>();
		s.add("varsha");
		s.add("priya");
		s.add("geethika");
		for(String x:s) {
			System.out.println(x);
		}
	}
}
