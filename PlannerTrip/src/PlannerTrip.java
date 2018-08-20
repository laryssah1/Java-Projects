//Project Trip Planner
//Program that asks the user form some information about an international trip and give some information 
//to help them plan their trip.

import java.util.Scanner;

public class PlannerTrip {

	public static void main(String[] args) {
		greeting();
		budget();
		timeD();
		area();
	}
		
	public static void greeting() {
		Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.next();
        System.out.printf("Nice to meet you %s, where are you travelling to? ",name);
        String local = input.next();
        System.out.printf("Great! %s sounds like a great trip \n",local);
        System.out.println("**************");
        System.out.print("\n");

		}
	public static void budget() {
		Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        double money = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String symbol = input.next();
        System.out.printf("How many %s are there in 1 USD? ",symbol);
        double convert = input.nextDouble();
        int hours = days*24;
	    int min = hours*60;
	    double moneyDay = money/days;
	    double budget2 = convert*money;
	    double budget2Day = budget2/days;
        System.out.printf("If you are travelling for %d days that is the same as %d hours or %d minutes \n",days,hours,min);
        System.out.printf("If you are going to spend $%.1f USD that means per day you can spend up to $%.2f USD \n",money, moneyDay);
        System.out.printf("Your total budget in %s is %.1f %s, which per day is %.2f %s \n",symbol,budget2,symbol,budget2Day,symbol);
        System.out.println("**************");
        System.out.print("\n");
		}
        
    public static void timeD() {
    	Scanner input = new Scanner(System.in);
    	System.out.print("What is the time difference, in hours, between your home and your destination? ");
    	double diffH = input.nextDouble();
    	double hmn = diffH+0.0;
    	double hnoon = diffH+12.0;
    	System.out.printf("That means that when it is midnight at home it will be %.0f:00 in your travel destination \nand when it is noon at home it will be %.0f:00 \n",hmn, hnoon);
    	System.out.println("**************");
        System.out.print("\n");

    	}
    public static void area() {
    	Scanner input = new Scanner(System.in);
    	System.out.print("What is the square area of your destination country in km2? ");
    	double km2 = input.nextDouble();
    	double miles2 = km2*0.386102;
    	System.out.printf("In miles2 that is %.1f \n",miles2);
    	System.out.println("**************");
        System.out.print("\n");


    	}


}
