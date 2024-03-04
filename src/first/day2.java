package first;

//public class day2 {
//	int i=2,j=6,k;
//   public static void main(String[] args) {
//	   day2 obj1=new day2();
//	   obj1.add();
//   }
//   int add() {
//	   int value=100;
//	   k=i+j;
//	   System.out.println("i am from add() "+value );
//	   return value;
//   }
//   
//}


//public class day2 {
//   public static void main(String[] args) {
//	   day2 obj1=new day2();
//	   int returnedvalue=obj1.add();
//	   System.out.println("the returned value is "+ returnedvalue);
//   }
//   int add() {
//	   int value=100;
//	   System.out.println("i am from add() "+value );
//	   return value;
//   }
//}


//public class day2 {
//	int i=3,j=6,k;
//	   public static void main(String[] args) {
//		   day2 obj1=new day2();
//		   int returnedvalue=obj1.add();
//		   System.out.println(obj1.k);
//		   System.out.println(returnedvalue);
//	   }
//	   int add() {
//		   int value=100;
//           value=i*value+j*i;
//		   return value;
//	   }
//	}



//public class day2 {
//	   public static void main(String[] args) {
//		   day2 obj1=new day2();
//           obj1.add(45,87);
//	   }
//void add(int value1,int value2) {
//	int result=value1+value2;
//	System.out.println("inside me "+result);
//}
//}


//public class day2 {
//	   public static void main(String[] args) {
//		   day2 obj1=new day2();
//           int returnedvalue=obj1.add(45,87);
//           System.out.println(returnedvalue);
//	   }
//int add(int value1,int value2) {
//	int result=value1+value2;
//	return result;
//}
//}


//public class day2 {
//	int height=11;
//	int aptitude=13;
//	int strength=10;
//	int firstno=3;
//	int secondno=6;
//	int result;
//	
//	   public static void main(String[] args) {
//             day2 obj1=new day2();
//             System.out.println(obj1.height);
//             System.out.println(obj1.aptitude);
//             System.out.println(obj1.strength);
//             System.out.println(obj1.firstno);
//             System.out.println(obj1.secondno);
//             System.out.println(obj1.result);
//             obj1.study();
//             obj1.gym();
//             obj1.playingbasketball();
//             obj1.add();
//             
//             System.out.println("after calling methods");
//             
//             System.out.println(obj1.height);
//             System.out.println(obj1.aptitude);
//             System.out.println(obj1.strength);
//             System.out.println(obj1.firstno);
//             System.out.println(obj1.secondno);
//             System.out.println(obj1.result);
//             
//             
//	   }
//	   void playingbasketball() {
//		   height++;
//	   }
//	   void gym() {
//		   strength++;
//	   }
//	   void study() {
//		   aptitude++;
//	   }
//       void add() {
//    	   result=firstno+secondno;
//       }
//       
//       }


//
//public class day2{
//   int firstno=2,secondno=7;
//   static int result;
//	public static void main(String[] args) {
//		day2 obj1=new day2();
//		day2 obj2=new day2();
//		obj1.add();
//		obj2.add();
//		System.out.println(result);
//	}
//	void add() {
//		int result=10;
//		result=firstno+secondno+result;
//			}
//}


//public class day2{
//	   static int i=6;
//  public static void main(String[] args) {
//     add();
//}
//static void add() {
//	System.out.println(i);  //we can access static member inside the static members
	                        //we can access static as well as non static member inside non static member
//}
//}


//class arithmetic{
//	int i=4;
//	void display() {
//		System.out.println(i);
//		day2 obj1=new day2();
//		obj1.print();
//	}
//}
//public class day2{
//	int j=9;
//	public static void main(String[] args) {
//		arithmetic arith=new arithmetic();
//		arith.display();
//	}
//	void print() {
//		System.out.println(j);
//	}
//	   
//}


//class aircraft{
//	int altitude=0;
//	int fly() {
//		altitude=35000;
//		return altitude;
//	}
//}
//
//class human {
//	double longitude=23.45;
//	double latitude=77.9;
//	double altitude=0;
//	
//	void getaltitude() {
//		aircraft air=new aircraft();
//		altitude=air.fly();
//	}
//	void walk() {
//		longitude = longitude+10;
//		latitude=latitude+568;
//	}
//}
//public class day2{
//	public static void main(String[] args) {
//		human man=new human();
//		System.out.println(man.longitude);
//		System.out.println(man.latitude);
//		System.out.println(man.altitude);
//		
//		man.getaltitude();
//		man.walk();
//		
//		System.out.println(man.longitude);
//		System.out.println(man.latitude);
//		System.out.println(man.altitude);
//	}
//}


//class Car {
//	void tyres() {
//		System.out.println("inside tyres() of car");
//	}
//}
//class Swift extends Car
//{
//void steeringWheel() {
//	System.out.println("inside steeringWheel() of Swift");
//}
//}
//public class day2{
//	public static void main(String[] args) {
//		Swift swift=new Swift();
//		swift.steeringWheel();
//		swift.tyres();
//		System.out.println(swift.j);
//		
//	}
//}


//class Car {
//	int mileage=4;
//	void tyres() {
//		System.out.println("inside tyres() of car"+mileage);
//	}
//}
//class Swift extends Car
//{
//	int average=8;
//	int mileage=4666;
// void steeringWheel() {
//	System.out.println("inside steeringWheel() of Swift"+average+mileage);
//}
//}
//public class day2{
//	public static void main(String[] args) {
//		Swift swift=new Swift();
//		swift.steeringWheel();
//		swift.tyres();
//		System.out.println(swift.average);
//		Car car=new Car();
//		car.tyres();
//		System.out.println(car.mileage);
//		
//	}
//}






