package com.PlayingTeamsDetails;

import com.Cricket_util.Innings;

public class Team   {
	String country;
	Player [] playingEleven =  new Player [11]; 
	Player captian ;
	Player wicketKeeper;
	Player [] benchPlayer = new Player [3];
	String finalScore;
	String title;
	int InningScore;
	public Team(String country) {
		this.country = country;
	}
	
	
	public void setCountry(String country) {
		this.country = country;
	}
	public void setCaptian(Player cap) {
		this.captian = cap;
	}
	
	public void setWicketKeeper(Player wk) {
		this.wicketKeeper = wk;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void setPlayingEleven(Player [] players) {
		this.playingEleven = players;
	}
	public	Player [] getPlayingEleven() {
		return this.playingEleven;
	}
	
	public Player getCaptian() {
		return this.captian;
	}
	
	public Player getWicketKeeper() {
		return this.wicketKeeper;
	}
	
	public void setBenchPlayer(Player [] players) {
		this.benchPlayer = players;
	}
	public Player [] getBenchPlayer() {
		return this.benchPlayer;
	}
	
	public int getInningScore() {
		return this.InningScore;
	}


	public void setInningScore(int inningScore) {
		this.InningScore = inningScore;
	}
	
	
	// method to generate Inning
	public String playInning(int numberOfOver, String toChase) {
		String scoreTOReturn = null;
		if((null != toChase) && (0 != numberOfOver)) {
			if(toChase.equalsIgnoreCase("NA")) {
				Innings inning1 = new Innings(numberOfOver);
				inning1.setNoOfOvers(numberOfOver);
				String score =	inning1.generateInnings(inning1.getNoOfOvers() ,toChase);
				PrintInningScore(score);
				String [] inningScrArray = score.split("/");
				this.setInningScore(Integer.parseInt(inningScrArray[0]));
				scoreTOReturn = score;
			}
			else {
				Innings inning1 = new Innings(numberOfOver);
//				inning1.setNoOfOvers(numberOfOver);
				String score =	inning1.generateInnings(inning1.getNoOfOvers(),toChase);
				PrintInningScore(score);
				String [] SplittedScore = score.split("/");
				this.setInningScore(Integer.parseInt(SplittedScore[0]));
				scoreTOReturn = score;
			}
		}
		else {
			System.out.println("Failed to Initiate Inning..\n\n");
			throw new NullPointerException("check \'noOfOver\' + \'to chase\' + values.");
		}
		return scoreTOReturn;
		
	}


	// print Inning score
	private void PrintInningScore(String score) {
		System.out.println("\nTeam " + this.getCountry() + " has Scored : " + score);
	}
}
