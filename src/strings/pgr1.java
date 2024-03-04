package strings;

public class pgr1 {
       public static void main(String[] args) {
		pgr1 m=new pgr1();
		System.out.println(m);
		System.out.println(m.toString());
		System.out.println(m.hashCode());
		System.out.println("------");
		pgr1 m1=new pgr1();
		pgr1 m2=new pgr1();
		System.out.println(m1.equals(m2));//m1 and m2 have addresses of objects so they are not equal
		System.out.println(m1==m2);
	}
}
