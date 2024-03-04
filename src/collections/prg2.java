package collections;
import java.util.ArrayList;
public class prg2 {
    public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(78);
		l.add(30);
		l.add(78);
		l.add("varsha");
		System.out.println(l.size());
		System.out.println(l.get(2));
		System.out.println(l.contains(20));
		System.out.println(l.contains(30));
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		System.out.println(l.indexOf(10));
		System.out.println(l.indexOf(777));
		System.out.println(l.lastIndexOf(10));
		System.out.println(l.isEmpty());
		l.clear();
		System.out.println(l.isEmpty());
		System.out.println(l.indexOf('v'));

	}
}
