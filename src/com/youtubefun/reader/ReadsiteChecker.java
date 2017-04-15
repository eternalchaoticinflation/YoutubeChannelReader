package com.youtubefun.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReadsiteChecker {

	public static void main(String[] args) {
		String location="youtubesite.txt";
		 
		//String patternString = ".*http://.*";

	       // Pattern pattern = Pattern.compile(patternString);

	      //  Matcher matcher = pattern.matcher(text);
		
		// for the pattern [   dir=\ltr\ title=   ]
		//Pattern p = Pattern.compile(".*dir=\"ltr\" title=.*", Pattern.CASE_INSENSITIVE);
		//Pattern viewsPattern = Pattern.compile(".*views<.*", Pattern.CASE_INSENSITIVE);
		Pattern titlePattern = Pattern.compile(".*aria-describedby=.*", Pattern.CASE_INSENSITIVE);
		Pattern viewsPattern = Pattern.compile(".*views<.*", Pattern.CASE_INSENSITIVE);
		//Matcher m = 
		Matcher matchTitle=titlePattern.matcher("ddddd");//constructs a matcher object for Matcher's methods to perfrom work on
		//Matcher methods can parse "dddd" or any html line.
		
		Matcher matchViews=viewsPattern.matcher("vvv");

	
			

			try{
				BufferedReader reader = new BufferedReader(new FileReader(location));
			  String line;
			  //as long as there are lines in the file, print them
			 //it gets a new line and assigns it to line
			  while((line = reader.readLine()) != null){
				  
				  //now we give it things to match
				  matchTitle=titlePattern.matcher(line);
				  matchViews=viewsPattern.matcher(line);
					if (matchTitle.find()) {   
						//finds things describing title so let's rock
						  System.out.println(line.substring(line.indexOf("dir="), line.indexOf("aria-describedby")));
						  System.out.println(line.substring(line.indexOf("Duration")));
						  //System.out.println(line.indexOf("title="));
				  }
					if (matchViews.find()) {//if it matches view we also rock   
						
						  System.out.println(line);
						  //System.out.println(line.indexOf("title="));
				  }
		  }
			} catch (IOException e) {
			  e.printStackTrace();
			}
		

	}

}
