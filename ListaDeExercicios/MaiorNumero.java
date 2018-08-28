//Questão 1: Programa que recebe dois números e retorna o maior deles

package project;
import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		//Entrada de dados
		Scanner input = new Scanner(System.in);
	    System.out.print("Digite um número: ");
	    int num1 = input.nextInt();
	    System.out.print("Digite outro número: ");
	    int num2 = input.nextInt();
	    //Condição de retorno
	    if (num1>num2) {
	    	System.out.printf("%d é o maior número.",num1);
	    } else if(num2>num1) {
	    	System.out.printf("%d é o maior número.",num2);
	    } else {
	    	System.out.printf("Os números são iguais.",num2);
	    }
		
	}

}
