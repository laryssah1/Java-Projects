//Questão 2: Programa que recebe um número e o imprime de forma decrescente até chegar em 0
package project;
import java.util.Scanner;

public class NumeroDecrescente {

	public static void main(String[] args) {
		dec();
	}
	//Metodo que recebe o numero e o imprime de forma decrescente
	public static void dec() {
		Scanner input = new Scanner(System.in);
	    System.out.print("Digite um número: ");
	    int n = input.nextInt();
	    int aux = n;
		for(int i=0; i<=aux; i++) {
			System.out.println(n);
			n--;
			
		}
		
	}

}
