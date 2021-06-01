package ques2;

import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	     Innings inn1=new Innings();
	     
	   //teamname
	     System.out.println("Enter the team name:");
	     String teamname = s.next();
	     inn1.setTeamname(teamname);
	     
	   //inningsname
	     System.out.println("Enter session:");
	     String inningsname = s.next();
	     inn1.setInningsname(inningsname);
	     
	   //runs
	     System.out.println("Enter runs:");
	     int runs = s.nextInt();
	     if(runs<0) System.out.println("invalid output");
	     inn1.setRuns(runs);
	     
	    //output display
	     inn1.displayInningsDetails();
	     
	     s.close();
	}

}
