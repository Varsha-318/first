package first;
//	class Car {
//		
//		void tyres() {
//			System.out.println("inside tyres() of car");
//		}
//	}
//	class Swift extends Car
//	{
//		
//	 void steeringWheel() {
//		System.out.println("inside steeringWheel() of Swift");
//	}
//	}
//	public class day3{
//		public static void main(String[] args) {
//			Car car1=new Car();
//			Swift swift=new Swift();
//			Car car2=new Car();
//			car2.tyres();
//			car2.steeringWheel(); //this is illegal 
//			
//			
//		}
//	}
//}



//class Car1{
//		
//		void tyres() {
//			System.out.println("inside tyres() of car");
//		}
//	}
//	class Swift1 extends Car1
//	{
//		
//	 void steeringWheel() {
//		System.out.println("inside steeringWheel() of Swift");
//	}
//	}
//	public class day3{
//		public static void main(String[] args) {
//			Car1 car1=new Car1();
//			Car1 car2=new Car1();
//			Car1 car3=new Car1();
//			Car1[] cars= {car1,car2,car3};
//			for(int i=0;i<cars.length;i++){
//				System.out.println(cars[i]);
//                cars[i].tyres();
//			    
//		}
//	}
//}


//class Car {
//		
//		void tyres() {
//			System.out.println("inside tyres() of car");
//		}
//	}
//	class Swift extends Car
//	{
//		
//	 void steeringWheel() {
//		System.out.println("inside steeringWheel() of Swift");
//	}
//	}
//	public class day3{
//		public static void main(String[] args) {
//			Swift swift1=new Swift();
//			Swift swift2=new Swift();
//			Swift swift3=new Swift();
//            Swift swifts[]= {swift1,swift2,swift3};
//			for(Swift value : swifts)
//				System.out.println(value);
//		}
//	}


//class Car {
//	
//	void tyres() {
//		System.out.println("inside tyres() of car");
//	}
//}
//class Swift extends Car
//{
//	
// void steeringWheel() {
//	System.out.println("inside steeringWheel() of Swift");
//}
//}
//public class day3{
//	public static void main(String[] args) {
//		Car car1=new Car();
//		Car car2=new Car();
//		Swift swift1=new Swift();
//		Swift swift2=new Swift();
//		Car[] cars= {swift1,car1,car2,swift2};
//		for(Car car : cars)
//		{
//			car.tyres();
//			car.steeringWheel(); //this gives error  
//		}
//	}
//}


//class Car {
//	
//	void tyres() {
//		System.out.println("inside tyres() of car");
//	}
//}
//class Swift extends Car
//{
//	
// void steeringWheel() {
//	System.out.println("inside steeringWheel() of Swift");
//}
//}
//public class day3{
//	public static void main(String[] args) {
//		Car car1=new Car();
//		Car car2=new Swift();
//		Swift swift1=new Swift();
//		Swift swift2=new Swift();
		
//		Car car3=swift1; //up casting. it is done implicitly.
		
//		System.out.println(car3);
//		System.out.println(swift1);
//		System.out.println(car2);
//		Car car = new Swift();
//		Swift swift1 = (Swift)car; //down casting. it MUST be done explicitly. it is not automatic
//		System.out.println(swift1);
//	}
//	}


//public class day2{
//	public static void main(String[] args) {
//		int arr[][]= {{1,1,1},{2,2,2},{3,3,3}};
//		int [][] newArr=new int[3][3];
//		for (int i=0;i<arr.length;i++)
//		{
//			for (int j=0;j<arr.length;j++) {
//				newArr[j][i]=arr[i][j];
//			}
//		}
//		 
//	}
//}



//class arithmetic{
//	void add(int i,int j) {
//		System.out.println(i+j);
//	}
//	void add(int i,int j,int k) {
//		System.out.println(i+j+k);
//	}
//	void add(double i,int j) {
//		System.out.println(i+j);
//	}
//}
//public class day2{
//	public static void main(String[] args) {
//		arithmetic arith=new arithmetic();
//		arith.add(10,20);
//	}
//}


import java.util.Scanner;
public class day3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("the entered age is"+age);
	}
}















