package question2;


class T20Match extends Match{
	float overs=(float) 20.0;
    float calculateRunRate() {
		
		return (getTarget()-getcurrentScore())/(overs-getcurrentOver());	
	}
	int calculateBalls() {
		return (int) ((overs-getcurrentOver())*6);
	}
	void display(double reqRunrate,int balls) {
		int Reqruns=getTarget()-getcurrentScore();
		System.out.println("Need " +Reqruns+" Runs in "+calculateBalls()+" Balls");
		System.out.println("Required Runrate: "+calculateRunRate());
	}
}