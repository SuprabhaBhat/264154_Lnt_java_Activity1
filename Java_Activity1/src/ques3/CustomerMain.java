package ques3;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	     Customer cust1=new Customer();
	     
	     //taking input from user
	     System.out.println("Enter the details:");
	     String input= s.nextLine();
	     String[] arrOfinput = input.split(",");
	     
	     //set
	     cust1.setName(arrOfinput[0]);
	     cust1.setAddress(arrOfinput[1]);
	     cust1.setMobile(arrOfinput[2]);
	     
	     //display output
	     System.out.println("Name: "+cust1.getName());
	     System.out.println("Address: "+cust1.getAddress());
	     System.out.println("Mobile: "+cust1.getMobile());
	     
	     s.close();
	}

}
