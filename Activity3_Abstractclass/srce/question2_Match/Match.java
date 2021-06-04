package question2;

public abstract class Match {
	private int currentScore; 
	private float currentOver;
	private int Target;
	
	//Getter
	public int getcurrentScore() {
		return currentScore;
	}
	
	public float getcurrentOver() {
		return currentOver;
	}
	public int getTarget() {
		return Target;
	}
		
	//Setter
	public void setcurrentScore(int newCs) {
	     this.currentScore = newCs;
	   }
	public void setcurrentOver(float newCo) {
	     this.currentOver = newCo;
	   }
	public void setTarget(int newT) {
	     this.Target = newT;
	   }
	
	
	abstract float calculateRunRate();
	abstract int calculateBalls();
	abstract void display(double reqRunrate,int balls);
	
}
