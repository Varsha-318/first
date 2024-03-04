package exception;

public class pgr4 {
        static void display() throws InterruptedException
        {
        	for(int i=1;i<=5;i++) {
        		System.out.println(i);
        		Thread.sleep(3000);
        	}
        }
        public static void main(String[] args) {
			try
			{
				display();
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
}
