package collections;
import java.util.HashSet;
public class prg11 {
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add(10);
	h.add(10);
	h.add("java");
	h.add("java");
	h.add(887.98);
	h.add(null);
	System.out.println(h.size());
	for(Object o:h)
	{
		System.out.println(o);
	}
}
}
