package collections;
import java.util.ArrayList;
import java.util.Collections;
public class prg6 {
public static void main(String[] args) {
	ArrayList l=new ArrayList();
	l.add(88);
	l.add(76);
	l.add(5);
	l.add(12);
	//before sorting
	for(int i=0;i<l.size();i++)
	{
		System.out.println(l.get(i));
	}
	System.out.println("-----");
	//after sorting
	Collections.sort(l);
	for(int i=0;i<l.size();i++)
	{
		System.out.println(l.get(i));
	}
	for(Object a:l)
	{
		System.out.print(a);
	}
}
}
