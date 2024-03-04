package first;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
class Employee1{
	int salary;
	String emp_name;
	public Employee1(int salary, String emp_name) {
		super();
		this.salary = salary;
		this.emp_name = emp_name;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", emp_name=" + emp_name + "]";
	}
}
public class employee{
	public static void main(String[] args) {
		
		Employee1 e1=new Employee1(10000,"varsha");
		Employee1 e2=new Employee1(80000,"varsh");
		Employee1 e3=new Employee1(30000,"varshu");
		
		Map<Integer,Employee1>Employee1=new HashMap<Integer,Employee1>();
		
		Employee1.put(1,e1);
		Employee1.put(2,e2);
		Employee1.put(3,e3);
		System.out.println(Employee1.entrySet());
		
		int[] sal= new int[3];
		Set <Integer> keySet = Employee1.keySet();
		int i=0;
		for(int key:keySet) {
			int j=(Employee1.get(key).salary);
			if(j>50000) {
				sal[i]=j;
				i++;
			}
		}
		for(int k:sal) {
			System.out.println(k);

			}
		}
	}


//package com.cap.to;
//public class employee {
//	private int id;
//	private String name;
//	private int salary;
//	public Employee() {
//		
//	}
//	
//}


