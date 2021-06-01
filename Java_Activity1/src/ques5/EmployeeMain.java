package ques5;

import java.util.Scanner;

import ques1.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	     System.out.println("Verify and Update the details:");
	     while(true)
	     {
		     System.out.println("Menu");
		     System.out.println("1. Update Employee name\n2. Update Employee Address\n3. Update Employee mobile\n4. All information correct/Exit");
		     int choice=s.nextInt();
		     
	    	 switch(choice)
	    	 {
	    	 case 1: System.out.println("Current Employee name is : "+emp1.getName());
	    	         System.out.println("(update)Enter Employee name:");
	    	         name=s.next();
	    	         emp1.setName(name);
	    	         break;
	    	 case 2: System.out.println("Current address is : "+emp1.getAddress());
	                 System.out.println("(update)Enter the address:");
	                 address=s.next();
	                 emp1.setAddress(address);
	                 break;
	    	 case 3: System.out.println("Current mobile no is : "+emp1.getMobile());
                     System.out.println("(update)Enter the mobile no:");
                     mobile=s.next();
                     emp1.setMobile(mobile);
                     break;
	    	 case 4: System.out.println("The details are:");
                     System.out.println("Name: "+emp1.getName());
                     System.out.println("Address: "+emp1.getAddress());
                     System.out.println("Mobile: "+emp1.getMobile());
                     s.close();
                     return;
             default:System.out.println("Invalid choice");
	    	 }
	    	 
	     }
	     
	}

}
