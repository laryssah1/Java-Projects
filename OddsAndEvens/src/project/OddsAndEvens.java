package project;

import java.util.Scanner;
import java.util.Random;


public class OddsAndEvens {
	public static String name;
	public static String choice;

	public static void main(String[] args) {
		
		pick();
		play();
		
	}
	
	public static void pick() {
		Scanner input = new Scanner(System.in);
	    System.out.println("Let's play a game called \"Odds and Evens\"");
	    System.out.print("Whats your name? ");
	    name = input.next();
        System.out.printf("Hi %s, which do you choose (O)dds or (E)vens?",name);
        choice = input.next();
        System.out.printf("%s\n",choice);
        while((!choice.equals("O")) && (!choice.equals ("E"))){
	        	System.out.printf("Hi %s, which do you choose (O)dds or (E)vens?",name);
	        	String choicer = input.next();
	        	choice = choicer;
	    } 
        if(choice.equals("O")) {
    	    System.out.printf("%s has picked odds! The computer will be evens.\n", name);

        } else if (choice.equals("E")) {
    	    System.out.printf("%s has picked evens! The computer will be odds.\n", name);

        	}
        System.out.println("------------------------------");
        
        }
	
	public static void play() {
		Scanner input = new Scanner(System.in);
	    System.out.print("How many “fingers” do you put out?");
	    int me = input.nextInt();
	    Random rand = new Random();
	    int computer = rand.nextInt(6);
	    System.out.printf("The computer plays number %d \"fingers\"\n", computer);
	    System.out.println("------------------------------");
	    int sum = me+computer;
	    System.out.printf("%d + %d = %d\n", me, computer, sum);
	    if (sum%2 == 0) {
		    System.out.printf("%d is ... even!\n", sum);
		    if(choice.equals("E")) {
		    	System.out.printf("That means %s wins! :)\n",name);
		    	
		    }else {
		    	System.out.printf("That means computer wins! :(\n");   	
		    }
	 	    }
	    else{
		    System.out.printf("%d is ... odd!\n", sum);
		    if(choice.equals("O")) {
		    	System.out.printf("That means %s wins! :)\n",name);
		    	
		    }else {
		    	System.out.printf("That means computer wins! :(\n");   	
		    }   
	 	    }    
	    System.out.println("------------------------------");
	}
	}
	

