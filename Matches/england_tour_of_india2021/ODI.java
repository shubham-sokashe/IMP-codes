package com.Matches.england_tour_of_india2021;

import com.Cricket_util.Match;
import com.PlayingTeamsDetails.Player;
import com.PlayingTeamsDetails.Team;

public class ODI {
	
	public static void main(String[] args) {
		Match firstODI = new Match();
		firstODI.setMatchDetails("Lord's, London", "Aug-12-2021", "Monday");
		firstODI.startMatch(getTeam1(),getTEam2(),5);
		
	}
	
	
	

	public  static Team getTeam1() {
		
		// team India
		Team india = new Team("India");
		Player p1 = new Player("Rohit Sharma", "Batsman", "Right Handed Bat", "Right-arm offbreak");
		Player p2 = new Player("Virat Kohli", "Batsman", "Right Handed Bat", "Right-arm medium");
		Player p3 = new Player("Shikhar Dhawan", "Batsman", "Left Handed Bat", "Right-arm offbreak");
		Player p4 = new Player("Rishabh Pant", "WK-Batsman", "Left Handed Bat", "NA");
		Player p5 = new Player("Cheteshwar Pujara", "Batsman", "Right Handed Bat", "Right-arm legbreak");
		Player p6 = new Player("Hanuma Vihari", "Batting Allrounder", "Right Handed Bat", "Right-arm offbreak");
		Player p7 = new Player("Washington Sundar", "Batting Allrounder", "Left Handed Bat", "Right-arm offbreak");
		Player p8 = new Player("Ravichandran Ashwin", "Bowling Allrounder", "Right Handed Bat", "Right-arm offbreak");
		Player p9 = new Player("Ravindra Jadeja", "Bowling Allrounder", "Left Handed Bat", "Left-arm orthodox");
		Player p10 = new Player("Axar Patel", "Bowling Allrounder", "Left Handed Bat", "Left-arm orthodox");
		Player p11 = new Player("Mohammed Shami", "Bowler", "Right Handed Bat", "Right-arm fast-medium");
		Player p12 = new Player("Mayank Agarwal", "Batsman", "Right Handed Bat", "NA");
		Player p13 = new Player("Jasprit Bumrah", "Bowler", "Right Handed Bat", "Right-arm fast");
		Player p14 = new Player("Ishant Sharma", "Bowler", "Right Handed Bat", "Right-arm fast-medium");
		
		Player [] eleven = {p1,p2,p3,p4,p7,p8,p9,p11,p13,p10,p6};
		Player [] bench = {p5,p12,p14};
		india.setPlayingEleven( eleven);
		india.setBenchPlayer(bench);
		india.setCaptian(p2);
		india.setWicketKeeper(p4);
		return india;
	}
	
	public static Team getTEam2() {
		Team englad = new Team("England");
		Player p1 = new Player("Jason Roy", "Batsman", "Right Handed Bat", "NA");
		Player p2 = new Player("Jonny Bairstow", "WK-Batsman", "Right Handed Bat", "Right-arm medium");
		Player p3 = new Player("Ben Stokes", "Batting Allrounder", "Left Handed Bat", "Right-arm fast-medium");
		Player p4 = new Player("Dawid Malan", "Batsman", "Left Handed Bat", "Right-arm legbreak");
		Player p5 = new Player("Jos Buttler", "WK-Batsman", "Right Handed Bat", "NA");
		Player p6 = new Player("Liam Livingstone", "Batsman", "Right Handed Bat", "Right-arm legbreak");
		Player p7 = new Player("Moeen Ali", "Batting Allrounder", "Left Handed Bat", "Right-arm offbreak");
		Player p8 = new Player("Sam Curran", "Bowling Allrounder", "Left Handed Bat", "Left-arm fast-medium");
		Player p9 = new Player("Adil Rashid", "Bowler", "Right Handed Bat", "Right-arm legbreak");
		Player p10 = new Player("Reece Topley", "Bowler", "Right Handed Bat", "Left-arm fast-medium");
		Player p12 = new Player("Mark Wood", "Bowler", "Right Handed Bat", "NA");
		Player p11 = new Player("Tom Curran", "Bowling Allrounder", "Right Handed Bat", "Right-arm fast-medium");
		Player p13 = new Player("Matthew Parkinson", "Bowler", "Right Handed Bat", "Right-arm legbreak");
		Player p14 = new Player("Sam Billings", "WK-Batsman", "Right Handed Bat", "Right-arm fast-medium");
		Player [] eleven = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p12};
		Player [] bench = {p11,p13,p14};
		englad.setPlayingEleven( eleven);
		englad.setBenchPlayer(bench);
		englad.setCaptian(p5);
		englad.setWicketKeeper(p5);
		
		return englad;
	}
}
