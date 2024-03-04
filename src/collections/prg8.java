package collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
public class prg8 {
         public static void main(String[] args) {
//			ArrayList l1=new ArrayList(50);
			ArrayList l=new ArrayList();
            l.add(10);
            l.add(43);
            l.add(16);
            System.out.println(l);
            LinkedList l2=new LinkedList(l);
            l2.add(34);
            l2.add(65);
            System.out.println(l2);
            Vector v=new Vector(l2);
            v.add(33);
            v.add(99);
            System.out.println(v);
            LinkedList l3=new LinkedList(v);
            l3.add(60);
            l3.add(968);
            System.out.println(l3);
            for(Object o:l2) {
            	System.out.println(o);
            }
		}
}
