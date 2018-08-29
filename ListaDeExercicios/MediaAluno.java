//Questão 6 : Programa que calcula a média aritmética de um aluno dadas suas notas
package project;
import java.util.Scanner;
public class MediaAluno {
	public static float soma;
	public static int aux;

	public static void main(String[] args) {
		notas();
		soma();
			}
	public static float notas() {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a quantidade de notas do aluno: ");
		int n = input.nextInt();
		float notas[] = new float[n];
		soma = 0;
		aux = n;
		for (int i=0;i<aux;i++) {
			int indice = aux-n+1;
			System.out.printf("Digite a %dª nota: ",indice);
			notas[i] = input.nextFloat();
			if (notas[i]<0.0 || notas[i]>100.0) {
				System.out.println("Erro.Nota inválida.");
				notas[i] = 0;
			}
			n--;
			soma += notas[i];
		}
		return soma;
		}
	public static void soma() {
		//Calculo da média aritmética
		float media = soma/aux;
		System.out.printf("A média do aluno é: %.2f ", media);
	}
}
