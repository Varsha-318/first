package collections;
import java.util.ArrayList;
import java.util.LinkedList;
public class prg4 {
     public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(28);
		a.add("abc");
		a.add(76.98);
		System.out.println(a+" "+a.size());
		System.out.println("-----");
		LinkedList l=new LinkedList();
		l.addAll(a);
		l.add(45);
		l.add('s');
		System.out.println(l+" "+l.size());
		System.out.println(l.containsAll(a));
		l.removeAll(a);
		System.out.println(l);
	}
}
