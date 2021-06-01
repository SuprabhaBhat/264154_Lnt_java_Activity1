package ques2;

public class Innings {
	private String teamname;
	private String inningsname;
	private int runs;
	
	 // Getter
	   public String getTeamname() {
	     return teamname;
	   }
	   public String getInningsname() {
		     return inningsname;
		   }
	   public int getruns() {
		     return runs;
		   }
	   
	// Setter
	   public void setTeamname(String newTeamname) {
	     this.teamname = newTeamname;
	   }
	   public void setInningsname(String newInningsname) {
		     this.inningsname = newInningsname;
		   }
	   public void setRuns(int newRuns) {
		     this.runs = newRuns;
		   }
	   
	  //display function
	   public void displayInningsDetails() {
		   System.out.println("Name: "+this.teamname);
		   System.out.println("Scored: "+this.runs);
		   if(inningsname.equalsIgnoreCase("First")) {
			   System.out.println("Need "+(this.runs+1)+" to win");
		   }
		   else if(inningsname.equalsIgnoreCase("Second")) {
			   System.out.println("Match Ended.");
		   }
		   else {
			   System.out.println("Incorrect Proper Innings name");
		   }
	   }
}
