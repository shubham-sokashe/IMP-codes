package com.Cricket_util;

public class Innings {
	private int noOfOvers ;

	public Innings(int number) {
		this.noOfOvers = number;
	}
	
	public int getNoOfOvers() {
		return noOfOvers;
	}

	public void setNoOfOvers(int noOfOvers) {
		this.noOfOvers = noOfOvers;
	}
	
	
	// method to generate secondInning
	public String generateInnings( int noOfOvers, String toChase ) {
		int wicket = 0;
		int runs = 0;
		int dummyOverNO = 1;
		int scoreToChase = 0;
		int noOfBallsAvailable = (noOfOvers*6);
		int oversRemaining = noOfOvers-1;
		 int runToMake = 0;
		Over dummyOvers = new Over();
		 if(toChase != "NA") {
			String [] firstInningScore = toChase.split("/");
			scoreToChase =  Integer.parseInt(firstInningScore[0]);
		 }
		for(int i = 0 ; i< noOfOvers ; i++) {
			if(wicket == 10 ) 
				break;
			else if(toChase != "NA") {
				if(runs >scoreToChase)
				break;
			}
			String scorePerOver = dummyOvers.calculateOver(dummyOvers.generateOver());
			 String [] score = scorePerOver.split("/");
			 runs += Integer.parseInt(score[0]);
			 wicket += Integer.parseInt(score[1]);
			 System.out.println("Score of this Over :" +runs + " / " + wicket);
			 System.out.format("Current Runrate : %.2f \n" , dummyOvers.calculateRunRate(runs, dummyOverNO++));
			  if(toChase != "NA") {
					if(runs >scoreToChase)
					break;
				}
			 if((toChase != "NA") && ( oversRemaining>0) && !(runs >= scoreToChase)) {
				  noOfBallsAvailable -= 6;
				  runToMake = scoreToChase - runs;
				 System.out.format("Required Runrate for next over : %.2f \n" , dummyOvers.calculateRunRate(runToMake,oversRemaining--));
					 System.out.println("Runs to chase : " + runToMake + " in Balls : " + noOfBallsAvailable);
			 }
			 System.out.println("------------------------------------------------");
		}
		String inningScore = String.valueOf(runs).concat("/").concat(String.valueOf(wicket));
		return inningScore;
		
	}
	

}
