package strings;

public class pgr2 {
      public static void main(String[] args) {
		String s="java";
		System.out.println(s);
		String s1=new String("java");
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s.hashCode());
		System.out.println("--------");
		String s2=new String("java");
		String s3=new String("java");
		System.out.println(s2.equals(s3));//here s2 and s3 are referring to the content of object so its true
		System.out.println(s3==s2);
		System.out.println(s3.hashCode());
		System.out.println(s2.hashCode());
	}
}
