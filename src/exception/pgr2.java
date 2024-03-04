package exception;

public class pgr2 {
      public static void main(String[] args) {
		System.out.println("start");
		int a[]= {10,20,29};
		try {
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("handled");
		}
	}
}
