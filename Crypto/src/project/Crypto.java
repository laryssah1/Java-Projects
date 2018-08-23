package project;
import java.util.Scanner;

public class Crypto {
	public static String newtext;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Write your text: ");
	    String text= input.nextLine();
		normalizeText(text);
		System.out.println(newtext);
		
	}
	public static String normalizeText(String textString) {
	    newtext=textString.replaceAll("\\s","");
	    newtext = newtext.replaceAll("[. , : ; ’ ” ! ? ( ) ^ ~ / ]", "");
	    newtext = newtext.toUpperCase();
	    return newtext;

	    
	}
	

}
