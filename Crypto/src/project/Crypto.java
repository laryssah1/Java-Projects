package project;
import java.util.Scanner;

public class Crypto {
	public static String newtext;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Write your text: ");
	    String text= input.nextLine();
		normalizeText(text);
		System.out.println(text = newtext);
		System.out.println("Enter with shift value: ");
		int shiftValue = input.nextInt();
		System.out.println(caesarify(text,shiftValue));
		System.out.print("Enter with size to code groups: ");
		int groupSize= input.nextInt();
		String codeGroupedString = groupify(text, groupSize);
		System.out.println("Encrypting string... ");
        String cypherText = encryptString(text,shiftValue,groupSize);
        System.out.println(cypherText);
        ungroupify(codeGroupedString);
        System.out.println("Decrypting string...");
        String plainText = decryptString(cypherText,shiftValue);
        System.out.println(plainText);
		
		
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
	
	public static String groupify(String t, int n){
        String x = "";
        int count = 0;
        for(int i = 0; i < t.length(); i++) {
            if (i % n == 0 && i != 0) {     //It means if iterator value and number of letters value is same
                x = x + " ";
            }
            x = x + t.charAt(i);
        }
        for(int i = x.lastIndexOf(" ")+1; i < x.length(); i++) {
            ++count;
        }
        for(int i = n - count; i > 0; i--){
            x += "x";
        }
        return x;
    }
	 public static String encryptString(String t, int sValue, int n)
	    {
	        String temp = "";
	        temp = normalizeText(t);
	        temp = caesarify(t,sValue);
	        temp = groupify(t,n);

	        return temp;
	    }

	    public static String ungroupify(String groupedStr){
	        String temp = groupedStr.replaceAll("[\\sx]", "");
	        return temp;
	    }

	    public static String decryptString(String t, int sValue){
	        return ungroupify(t);
	}	
}
