package first;

//public class newStart{
//	public static void main(String[] args) {
		
	//implicit typecasting
//           char c='V';
//           int a= c;
//           double d=(double) c;
//           System.out.println(d);
//           System.out.println(a);
            
      //explicit typecasting
    
//     int a=10;
//     byte b=(byte)a;
//     System.out.println(b);
           
//     int a=237;
//     byte b=(byte)a;
//     System.out.println(b);
     //output is -19
//}
//}



//public class newStart{
//	static int i; //single static intializer
//	static { 
//		System.out.println("cg"); //multi static intializer
//	}
//	public static void main(String[] args) {
//		System.out.println("capgemini");
//	}
//	static {
//		System.out.println("cg2");
//	}
//	static {
//		System.out.println("cg3");
//	}
//}



//public class newStart{
//	String brand;
//	int ram;
//	public newStart(String brand,int ram) {
//		this.brand=brand;
//		this.ram=ram;
//	} 
//	public static void main(String[] args) {
//		newStart obj=new newStart("apple",123);
//		System.out.println(obj.brand+" "+obj.ram);						
//	}
//	}


//class chocolates {
//	String brand="kitkat";
//}
//class kitkat extends chocolates{
//	String brand1="kitkat1";
//}
//public class newStart{
//	public static void main(String[] args) {
//		kitkat k=new kitkat();
//		System.out.println(k.brand);
//		System.out.println(k.brand1);
//
//	}
//}



//public class newStart{
//	String product="electronics";
//}
//public class flipkart extends newStart{
//	String groceries="vegetables";
//}
//public class Ecommerce extends flipkart{
//	String company="ecommerce";
//	public static void main(String[] args) {
//		Ecommerce e=new Ecommerce();
//		System.out.println(e.product);
//		System.out.println(e.company);
//		System.out.println(e.groceries);
//
//	}
//}



class newStart{
	String brand="iphone";
	int model=13;
public String toString() {
	return brand+" "+model;
}
public static void main(String[] args) {
	newStart k=new newStart();
	System.out.println(k);
}
}