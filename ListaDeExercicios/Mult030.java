/*Questão 3: Programa que imprime a soma dos números impares entre 0 e 30 e a multiplicação
dos números pares entre 0 e 30*/

package project;
import java.util.Scanner;

public class Mult030 {

	public static void main(String[] args) {
		int aux = 30;
		int n = aux;
		long multpar = 1;
		long somaimpar = 0;
		for(int i=1; i<=aux; i++) {
			if (n%2==0) {
				multpar *=n;	
			}
			else {
				somaimpar +=n;		
			}
			n--;
		}
		System.out.printf("A multiplicação dos números pares é : %d\n", multpar);
		System.out.printf("A soma dos números ímpares é : %d", somaimpar);
	}

}
