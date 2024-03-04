package filehandling;
import java.util.*;
import java.io.*;
public class account {
        int acc_no;
        int pwd;
        double balance;
        public account(int acc_no,int pwd,double balance) {
        	super();
        	this.acc_no=acc_no;
        	this.pwd=pwd;
        	this.balance=balance;
        }
        public double withDrawal(int pwd,double amount)
        {
        	if(pwd==this.pwd)
        	{
        		if(amount<=balance) {
        			balance-=amount;
        			return amount;
        		}
        		else
        			return -1;
        	}
        	else
        		return 0;
        }
        public boolean deposit(int pwd,double amount)
        {
        	if(pwd==this.pwd)
        	{
        		balance+=amount;
        		return true;
        	}
        		else
        			return false;
        	
        }
        
        public static void main(String[] args) throws FileNotFoundException{
			Scanner sc=new Scanner(System.in);
			account a=new account(1,123,49999);
			FileOutputStream fos=new FileOutputStream("C:\\Users\\SANCREDD\\OneDrive - Capgemini\\Pictures\\varsha.pdf.jpg",false);
		    PrintWriter pw=new PrintWriter(fos);
		    pw.print("Account no.");
		    pw.println(a.acc_no);
		    pw.print("Available balance: ");
		    pw.println(a.balance);
		    boolean exit = true;
		    while(exit)
		    {
		    	System.out.println("1.withdrawal");
		    	System.out.println("2.deposit");
		    	System.out.println("enter your opinion");
		    	int option=sc.nextInt();
		    	switch(option)
		    	{
		    	case 1:
		    		System.out.println("enter pwd");
		    		int pwd=sc.nextInt();
		    		System.out.println("enter amount");
		    		double amount=sc.nextDouble();
		    		double wdStatus=a.withDrawal(pwd,amount);
		    		if(wdStatus==-1) 
		    			System.out.println("Insufficient fund");
		    		else if(wdStatus==0)
		    		System.out.println("Invalid pwd");
		    		else
		    		{
		    			System.out.println("transaction of amount "+wdStatus+" is successfull");
		    			pw.println("------");
		    			pw.print("amount debited");
		    			pw.println(wdStatus);
		    			pw.print("available balance");
		    			pw.println(a.balance);
		    			pw.flush();
		    		}
		    	}
		    }
		    
        }
}

