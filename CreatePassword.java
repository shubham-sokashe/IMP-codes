package com.createCredentialls;

import java.util.Random;

public class CreatePassword {
	
		private static final String LOWER_CASE_ALPHA = "abcdefghijklmnopqrstuvwxyz";
		private static final String UPPER_CASE_ALPHA = LOWER_CASE_ALPHA.toUpperCase();
		private static final String NUMERIC = "0123456789";
		private static final String SPECIAL_CHAR = "!@#$%*{}[]()";
		
		
		// method to generate password
		public String getPassword(int length , int strength) {
			String password = null;
			if((length >= 4) &&(length<=10) &&(strength >0) && (strength <4)) {
				if(strength ==1) {
					password= generatePassword(length , (LOWER_CASE_ALPHA.concat(UPPER_CASE_ALPHA)));
				}
				else if(strength ==2) {
					password= generatePassword(length , (LOWER_CASE_ALPHA.concat(UPPER_CASE_ALPHA).concat(NUMERIC)));
				}
				else if(strength ==3) {
					password= generatePassword(length , (LOWER_CASE_ALPHA.concat(UPPER_CASE_ALPHA).concat(NUMERIC).concat(SPECIAL_CHAR)));
				}
			}
			
			else {
					System.out.println("length of password should be 4 to 10 characters and Strength should be 1 , 2 or 3\n\n"); 
			}
			return password;
			
		}
		
		private String generatePassword(int length, String refer) {
			Random r = new Random();
			char [] referChars = refer.toCharArray();
			char[] passChars = new char [length]; 
			for(int i=0 ; i<length ; i++) {
				passChars[i] = referChars[r.nextInt(referChars.length)];
			}
			String password = new String(passChars);
			return password;
		}
		
		
		public static void main(String[] args) {
		System.out.println("Password of weak strength : " + new CreatePassword().getPassword(4,1));	
		}
		
	}

