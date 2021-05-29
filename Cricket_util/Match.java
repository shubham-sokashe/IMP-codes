package com.Cricket_util;

import java.util.Random;

import com.PlayingTeamsDetails.Team;

// class for match details
public class Match {

	private static final String[] TOSS = { "HEADS", "TAILS" };

	int NoOfOvers;
	String day;
	String Location;
	String date;
	Team team1;
	Team team2;

	
	public String getDay() {
		return day;
	}

	public String getLocation() {
		return Location;
	}

	public String getDate() {
		return date;
	}

	public Team getTeam1() {
		return team1;
	}

	public Team getTeam2() {
		return team2;
	}


	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	public void SetNoOfOver(int over) {
		this.NoOfOvers = over;
	}

	public int getNoOfOvers() {
		return this.NoOfOvers;
	}

	public void startMatch(Team team1, Team team2 , int NoOfOvers) {
		setTeam1(team1);
		setTeam2(team2);
		Team batFirst = null;
		Team batSecond = null;
		this.SetNoOfOver(NoOfOvers);
		if (( null != team1) && (null != team2) && (0 != NoOfOvers)) {

			int teamNo = getBatFirstTeam(toss());
			if (teamNo == 1) {
				batFirst = team1;
				batSecond = team2;
			} else {
				batFirst = team2;
				batSecond = team1;
			}
			printMatchInfo();
			System.out.println("\nTeam " + batFirst.getCountry() + " has elected To Bat First..");
			System.out.println("\n\n*************************************************************************\n\n");
			String batFirstScore = batFirst.playInning(this.getNoOfOvers() , "NA");
			System.out.println("\n\n************************************ Inning Break ************************************\n\n");
			try {
				Thread.currentThread();
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("Cannot able to break the inning ...Inning Continued");
				e.printStackTrace();
			}
			String batSecondScore = batSecond.playInning(this.getNoOfOvers() , batFirstScore);
			String matchResult = calculateResult(batFirstScore, batSecondScore);
			printResult(batFirst,batSecond,matchResult);
			
		} else {
			System.out.println("Please Pass Two Teams to Start the Match....");
			throw new NullPointerException("No teams Available to play.");
		}
	}


	private String calculateResult(String batfrst, String batscnd) {
		String result = null;
		String[] batFrstScore = batfrst.split("/");
		String[] batScndScore = batscnd.split("/");
		int b1Runs = Integer.parseInt(batFrstScore[0]);
		int b2Runs = Integer.parseInt(batScndScore[0]);

		if (b1Runs > b2Runs) {
			result = "1/".concat(String.valueOf((b1Runs - b2Runs)));
		} else if (b1Runs == b2Runs) {
			result = "Draw";
		} else {
			result = "2/".concat(String.valueOf(batScndScore[1]));
		}
		return result;
	}

	// choose toss
	private boolean toss() {
		boolean tossResult = false;
		Random randomToss = new Random();
		if (TOSS[randomToss.nextInt(TOSS.length)].equalsIgnoreCase("HEADS")) {
			tossResult = true;
		} else {
			tossResult = false;
		}

		return tossResult;
	}

	// method to get who will bat first
	private int getBatFirstTeam(boolean toss) {
		final int team1 = 1;
		final int team2 = 2;
		if (toss) {
			return team1;
		} else {
			return team2;
		}
	}
	
	// method to print result
	private String printResult(Team t1 , Team t2, String finalScore) {
		String result = null;
		if((t1 != null) && (t2 != null) && (finalScore != null)){
			String [] resultsArray = finalScore.split("/");
			switch(resultsArray[0]) {
			case "1":
				System.out.println("\n------------------Team "+t1.getCountry()+" won the match by " + resultsArray[1] + " runs.------------------");
				break;
			case "2":
				System.out.println("\n------------------Team "+t2.getCountry()+" won the match by " + (10 - Integer.parseInt(resultsArray[1])) + " wickets.------------------");
				break;
			default:
				System.out.println("------------------Draw match------------------");
				break;
			}
			
		}
		else {
			System.out.println("Please check Team1 , Team2 and Score object values");
			throw new NullPointerException("Null teams of score object");
		}
		return result;
	}

	// method to print match info
	public void printMatchInfo() {
		System.out.println("---------------------------- "+ this.getTeam1().getCountry() + "  Vs  " + this.getTeam2().getCountry()+ "----------------------------");
		System.out.println("----------------------------"+" At " + this.getLocation()+" ----------------------------");
		System.out.println("----------------------------"+" On "+ this.getDate().toString()+" ----------------------------");
		System.out.println("---------------------------- "+this.getNoOfOvers() + " overs match."+" ----------------------------");
	}
	
	public void setMatchDetails(String location , String date, String day) {
		this.Location = location;
		this.date = date;
		this.day = day;
	}
}
