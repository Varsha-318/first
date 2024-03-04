package first;
//
//public class collectionsjava {
//             public static void main(String[]args) {
//            	 ArrayList list=new ArrayList();
//            	 Integer i1=6;
//            	 Integer i2=4;
//            	 list.add(i1);
//            	 list.add(i2);
//            	 list.add(10);
//             }
//}

//
//import java.util.ArrayList;
//import java.util.List;
//public class collectionsjava{
//	public static void main(String[] args) {
//		List list=new ArrayList();
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//		list.add(3);
//		list.add(1);
//		list.add(10);
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//	}
//}



//
//import java.util.ArrayList;
//import java.util.List;
//public class collectionsjava{
//	public static void main(String[] args) {
//		List<Integer>list=new ArrayList<Integer>();
//		list.add(3);
//		list.add(1);
//		list.add(10);
//		System.out.println("Removed element"+list.remove(2));//it removes the number inside index 2
//		System.out.println("after removal");
//		System.out.println(list.indexOf(3));
//	}
//}


//import java.util.HashSet;
//import java.util.Set;
//class A{
//	int i=3,j=7;
//} 
//public class collectionsjava{
//	public static void main(String[] args) {
//		Set<A>set=new HashSet<A>();
//		A a1=new A();
//		A a2=new A();
//		A a3=new A();
//		set.add(a1);
//		set.add(a2);
//		set.add(a3);
//for(A a:set) {
//	System.out.println(a);
//}
//	}	
//	}



//import java.util.HashSet;
//import java.util.Set;
//class A{
//	int i=6;
//	public boolean equals(Object o) {
//		A a=(A)o;
//		boolean status=false;
//		if(this.i==a.i) {
//			status=true;
//			return status;
//		}
//		public int hashCode() {
//			return 43;
//		}
//	}
//}
//public class collectionsjava{
//	public static void main(String[] args) {
//	Set<A>set=new HashSet<A>();
//	A a1=new A();
//	A a2=new A();
//	A a3=new A();
//	System.out.println(a1.hashCode());
//	System.out.println(a2.hashCode());
//	System.out.println(a3.hashCode());
//	set.add(a1);
//	set.add(a2);
//	set.add(a3);
//	System.out.println(set.size());
//		
//	}		
//}


//import java.util.HashSet;
//import java.util.Set;
//import java.util.LinkedHashSet;
//public class collectionsjava{
//public static void main(String[] args) {
//Set<String>set=new LinkedHashSet<String>();
//set.add("varsha");
//set.add("varsh");
//set.add("vars");
//set.add("var");
//for(String value:set) {
//	System.out.println(value);
//}
//}
//}


//import java.util.TreeSet;
//import java.util.Set;
//class Iphone implements Comparable<Iphone>{
//	int manufacturedate;
//	int curbweight;
//	int price;
//	String color;
//	public int compareTo(Iphone o) {
//		int value=0;
//		System.out.println("compareTo");
//		if(this.price<o.price) {
//			value=-1;
//		}
//		else if(this.price>o.price) {
//			value=1;
//		}
//		return value;
//	}
//	public String toString() {
//		return "Colour is "+color+",price is "+price+",manufacturing date is "+manufacturedate;
//	}
//}
//public class collectionsjava{
//public static void main(String[] args) {
//	Set<Iphone>set=new TreeSet<Iphone>();
//	Iphone i1=new Iphone();
//	Iphone i2=new Iphone();
//	Iphone i3=new Iphone();
//	i1.price=23;
//	i2.price=76;
//	i3.price=98;
//	set.add(i1);
//	set.add(i2);
//	set.add(i3);
//	for(Iphone a:set) {
//		System.out.println(a);
//	}
//}
//}



//import java.util.HashMap;
//import java.util.Map;
//public class collectionsjava{
//	 public static void main(String[] args) {
//		 Map<Integer,String>employees =new HashMap<Integer,String>();
//		 employees.put(1, "varsha");
//		 employees.put(2, "varsh");
//		 employees.put(3, "varsha"); 
//		 employees.put(4, " ");
//		 employees.put(null, "me");
//		 employees.put(3, "null");
//
//		 System.out.println(employees.get(2));
//		 System.out.println(employees.keySet());
//		 System.out.println(employees.entrySet());
//	 }
//}


