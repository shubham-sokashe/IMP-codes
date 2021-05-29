package com.PlayingTeamsDetails;

// contains all details of player
public class Player  {
	String name;
	String role ;
	String batting_Style;
	String bowling_style;

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public String getBatting_Style() {
		return batting_Style;
	}

	public String getBowling_style() {
		return bowling_style;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setBatting_Style(String batting_Style) {
		this.batting_Style = batting_Style;
	}

	public void setBowling_style(String bowling_style) {
		this.bowling_style = bowling_style;
	}

	@Override
	public String toString() {
		return "Playe Details :\t name=" + name + ", role=" + role + ", batting_Style=" + batting_Style + ", bowling_style="
				+ bowling_style + "";
	}

	
	public	Player(String name, String role, String batting_Style, String bowling_style) {
		super();
		this.name = name;
		this.role = role;
		this.batting_Style = batting_Style;
		this.bowling_style = bowling_style;
	}

	public Player() {
		super();
	}
	
	
	
	
	

}
