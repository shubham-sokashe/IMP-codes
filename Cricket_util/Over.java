package com.Cricket_util;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Over {
	private static final String [] BALLS = {"1", "2" , "3" ,"4","6","w", "wd", "nb"};
	private static final String [] RUNS = {"1", "2" , "3" ,"4","6"};
	List <String> over = new ArrayList<>();
	
		List <String> generateOver() {
		List <String> over = new ArrayList<>();
		Random r = new Random();
		int oversize = 6;
		for(int i =0 ; i<oversize ; i++) {
			String ball = BALLS[r.nextInt(BALLS.length)];
			if(checkBallType(ball)) {
				over.add(i++,ball); 
				over.add(i, RUNS[r.nextInt(RUNS.length)]);
				oversize++;
			}
			else{
				over.add(i,ball); 
			}
		}
	
		System.out.println("over is :" + over);
		return over;
	}
	
	// method to check over if has no balls of wide balls
	private boolean checkBallType(String ball) {
		boolean balltype = false;
		if( null != ball) {
			switch(ball) {
			case "wd":
				balltype = true;
				break;
			case "nb" :
				balltype = true;
				break;
			default:
				balltype = false;
				break;
			}
			
		}
		else {
			System.out.println("There is no value in ball <String>..\n\n");
			throw new NullPointerException("Empty ball object");
		}
		return balltype;
	}

	// method to calculate score from single over
	String calculateOver(List <String> over) {
		 int runsInOver = 0 ;
		 int wicketInOver =0;
		if(null != over) {
			Iterator <String> overItr = over.iterator();
			while(overItr.hasNext()) {
				String ball = overItr.next();
				switch(ball) {
				case "1":
					runsInOver+=1;
					break;
				case "2":
					runsInOver +=2;
					break;
				case "3":
					runsInOver +=3;
					break;
				case "4":
					runsInOver +=4;
					break;
				case "6":
					runsInOver +=6;
					break;
				case"w":
					wicketInOver+=1;
					break;
				case "nb":
					runsInOver+=1;
					break;
				case "wd":
					runsInOver+=1;
					break;
					
				}
				
			}
			
		}
		else {
			System.out.println("Cannot able to calculate Over ...\n\n");
			throw new NullPointerException("Null List \"Over\" object");
		}
		String scoreInOver = String.valueOf(runsInOver).concat("/").concat(String.valueOf(wicketInOver));
		return scoreInOver;
	}
	 
	// method to calculate runrate
	   double calculateRunRate(int score , int noOfOvers) {
		   double runRate = 0.0;
		   if((0 != score) && (0 != noOfOvers)) {
			    runRate = (double)score/noOfOvers;
			    DecimalFormat df = new DecimalFormat("##.##");
			    df.setRoundingMode(RoundingMode.CEILING);
		   }
		   else {
			   System.out.println("Failed to calculate RunRate");
			   throw new ArithmeticException("Value of \'socre\' or \'no of over\' is Zero.");
		   }
		return runRate;
	}
	 
	
	
}


