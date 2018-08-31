//Questão 3: Programa que simula uma pequisa e coleta alguns dados sobre os habitantes de uma região
package project;
import java.util.Scanner;


public class Pesquisa {
	public static int i=0;
	public static String[] sexo= new String[50];
	public static String[] olhos= new String[50];
	public static String[] cabelos= new String[50];
	public static int[] idade= new int[50];



	public static void main(String[] args) {
		ColetaDados();
		float a = Porcentagem();
		MaiorIdade();
		
		//System.out.printf("O habitante de maior idade tem %d anos", maior);

		System.out.printf("A porcentagem de mulheres entre 18 e 35 anos de cabelos loiros e olhos verdes é de %.2f\n", a);

		for(int j=0;j<=i;j++) {
			/*System.out.println(sexo[j]);
			System.out.println(olhos[j]);
			System.out.println(cabelos[j]);
			System.out.println(idade[j]);
			System.out.println(MaiorIdade());*/
			//System.out.printf("%.2f",Porcentagem());
		}
	}
	public static int ColetaDados(){
		Scanner input = new Scanner(System.in);
		System.out.println("Digite os dados do habitante");
		System.out.print("Sexo: ");
	    sexo[i] = input.next();
	    System.out.print("Cor dos olhos: ");
	    olhos[i] = input.next();
	    System.out.print("Cor dos cabelos: ");
	    cabelos[i] = input.next();
	    System.out.print("Idade: ");
	    idade[i] = input.nextInt();
	    System.out.print("Deseja inserir dados de um novo habitante? (s/n)");
	    String escolha =input.next();
		if (escolha.equals("s")) {
			i++;
			ColetaDados();		
		}
		return i;	
	    }    
	public static void MaiorIdade() {
		int maior=1;
		for(int j=0;j<=i;j++) {
			if ((idade[j])>(idade[j+1])){
				maior = idade[j];		
			}else if((idade[j+1])>(idade[j])){
				maior = idade[j+1];
			}
		}
		System.out.println(maior);		
	}
	
	public static float Porcentagem() {
		int cont=0;
		for(int j=0;j<=i;j++) {
			if (sexo[j].equals("feminino")){
				if((olhos[j].equals("verdes"))&&(cabelos[j].equals("loiros"))) {
					if((idade[j]>=18) && (idade[j]<=35)) {
						cont++;					
					} 
				}
			}
		}
		float per = (float) (cont/((float)i+1)*100.0);
		return per;
	}

}
