package ques1;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
     Employee emp1=new Employee();
     
     //name
     System.out.println("Enter the name:");
     String name = s.next();
     emp1.setName(name);
     
   //address
     System.out.println("Enter Address:");
     String address = s.next();
     emp1.setAddress(address);
     
   //mobile
     System.out.println("Enter Mobile:");
     String mobile = s.next();
     emp1.setMobile(mobile);
     
    //output display
     System.out.println("Employee Details");
     System.out.println("Name: "+emp1.getName());
     System.out.println("Address: "+emp1.getAddress());
     System.out.println("Mobile: "+emp1.getMobile());
     
     s.close();
	}

}
