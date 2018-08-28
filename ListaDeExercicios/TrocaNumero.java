//Questão 4: Programa que recebe dois números e os imprime na ordem inversa
package project;
import java.util.Scanner;
public class TrocaNumero {

	public static void main(String[] args) {
		troca();
	}
	public static void troca() {
		Scanner input = new Scanner (System.in);
		System.out.print("Digite o primeiro número: ");
		int numA = input.nextInt();
		System.out.print("Digite o segundo número: ");
		int numB = input.nextInt();
		int aux = numA;
		numA = numB;
		numB = aux;
		System.out.printf("Primeiro número: %d\n", numA);
		System.out.printf("Segundo número: %d", numB);

	}

}
