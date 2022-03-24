package com.cg.assignment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BookTickets {
	static int width = 70;
	public static void main(String[] args) {
		
		Theatre[] myTheatres = new Theatre[] {new Theatre("INOX"),new Theatre("Carnival"),new Theatre("Imax"),new Theatre("Cinemax")};
		Map<String,Integer> movies = new LinkedHashMap<>();
		String[] movieNames = new String[] {"Avengers","Hemlock Society","Lighthouse"};
		movies.put(movieNames[0],300);
		movies.put(movieNames[1],250);
		movies.put(movieNames[2],300);
	
		for(int i=0;i<4;i++) {
			myTheatres[i].movies = movies;
		}
		
		Ticket myTicket = null;
		
		
		StringBuilder border = BookTickets.charLine('*',width);
		System.out.println(border);
		BookTickets.align("1. List of Movies and their Prices");
		BookTickets.align("2. Book Tickets from your nearest theatres");
		System.out.println(border);
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int movieIn = 0;
		int theatreIn = 0;
		
		try {
			input = sc.nextInt();
		}catch(Exception e) {
		}
		
		
		if(input==1) {
			input = 0;
			BookTickets.align("Movies available are :");
			int index = 0;
			for(Map.Entry<String,Integer> entry:movies.entrySet()) {
				index++;
				System.out.println("\t\t"+index+". "+entry.getKey()+" : @Rs"+entry.getValue());
			}
			movieIn = sc.nextInt();
			movieIn--;
			if(movieIn>=0 && movieIn<movies.size()) {
				BookTickets.align("Select a Theatre");
				for(int i=0;i<myTheatres.length;i++) {
					System.out.println("\t\t"+(i+1)+". "+myTheatres[i].name);
				}
				theatreIn = sc.nextInt();
				theatreIn--;
				if(theatreIn>=0 && theatreIn<=myTheatres.length) {
					System.out.print("\n\t\tEnter the no. of tickets :  ");
					input = sc.nextInt();
					myTicket = new Ticket(myTheatres[theatreIn],movieNames[movieIn],input);
					System.out.println(border);
					myTicket.getInfo();
					System.out.println(border);
				}
				else {
					System.out.println("Invalid input");					
				}
			}
			else {
				System.out.println("Invalid input");
			}
			
		}
		

		else if(input==2) {
			input = 0;
			BookTickets.align("Select a Theatre");
			for(int i=0;i<myTheatres.length;i++) {
				System.out.println("\t\t"+(i+1)+". "+myTheatres[i].name);
			}
			theatreIn = sc.nextInt();
			theatreIn--;
			if(theatreIn>=0 && theatreIn<myTheatres.length) {
				BookTickets.align("Movies available are :");
				int index = 0;
				for(Map.Entry<String,Integer> entry:movies.entrySet()) {
					index++;
					System.out.println("\t\t"+index+". "+entry.getKey()+" : @Rs"+entry.getValue());
				}
				movieIn = sc.nextInt();
				movieIn --;
				if(movieIn>=0 && movieIn<movies.size()) {
					System.out.print("\n\t\tEnter the no. of tickets :  ");
					input = sc.nextInt();
					myTicket = new Ticket(myTheatres[theatreIn],movieNames[movieIn],input);
					System.out.println(border);
					myTicket.getInfo();
					System.out.println(border);
				}
				else {
					System.out.println("Please provide a valid input");					
				}
			}
			else {
				System.out.println("Please provide a valid input");					
			}
		}
		
		
		else {
			System.out.println("Please provide a valid input");
		}
		
		
	}
	
	public static void align(String line) {
		int before = (width-line.length())/2;
		StringBuilder newLine = new StringBuilder("");
		newLine.append(BookTickets.charLine('-',before));
		newLine.append(line);
		newLine.append(BookTickets.charLine('-',width-line.length()-before));
		System.out.println(newLine);
	}
	
	public static StringBuilder charLine(char c,int n) {
		StringBuilder line = new StringBuilder("");
		for(int i=0;i<n;i++) {
			line.append(c);
		}
		return line;
	}
}
