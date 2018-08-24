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
		shiftAlphabet(2);
	}
	public static String normalizeText(String textString) {
	    newtext=textString.replaceAll("\\s","");
	    newtext = newtext.replaceAll("[. , : ; ’ ” ! ? ( ) ^ ~ / ]", "");
	    newtext = newtext.toUpperCase();
	    return newtext;
	}
	public static String caesarify(String t, int key) {
		String textCryp = shiftAlphabet(key);
		textCryp = t.replace(t,textCryp);
		return textCryp;				
	} 
	public static String shiftAlphabet(int shift) {
	    int start = 0;
	    if (shift < 0) {
	        start = (int) 'Z' + shift + 1;
	    } else {
	        start = 'A' + shift;
	    }
	    String result = "";
	    char currChar = (char) start;
	    for(; currChar <= 'Z'; ++currChar) {
	        result = result + currChar;
	    }
	    if(result.length() < 26) {
	        for(currChar = 'A'; result.length() < 26; ++currChar) {
	            result = result + currChar;
	        }
	    }
	    return result;
	}
	

	

}
