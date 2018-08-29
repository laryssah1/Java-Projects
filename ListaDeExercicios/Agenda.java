package project;

import java.util.Scanner;

public class Agenda {
	public static int j=0;
	public static String vcontato[];
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 String contato = "Rock";
		 String email = "rock.lee@gmail.com";
		 String contato1 = "Naruto";
		 String email1 = "naruto@gmail.com";
		 vcontato= new String[50];
		 vcontato[0]=contato;
		 vcontato[1]=email;
		 vcontato[2]=contato1;
		 vcontato[3]=email1;
	
		 System.out.print("Para adicionar novo contato Digite A, para remover digite R, para buscar digite B: ");
		 String escolha = input.next();
		 while((!escolha.equals("R")) && (!escolha.equals ("A")) && (!escolha.equals ("B"))){
			 	System.out.print("Para adicionar novo contato Digite A, para remover digite R, para buscar digite B: ");
	        	String escolhar = input.next();
	        	escolha = escolhar;
	    }
		 
		if (escolha.equals("A")) {
			add();		
		}
		else if (escolha.equals("R")) {
			rem();				
		}
		else if (escolha.equals("B")){
			bus();
		}
		System.out.println(vcontato[0]);
		System.out.println(vcontato[1]);
		System.out.println(vcontato[2]);
		System.out.println(vcontato[3]);
		System.out.println(vcontato[4]);
		System.out.println(vcontato[5]);
		System.out.println(vcontato[6]);
		System.out.println(vcontato[7]);

		
	}
	//Metodo para adicionar novo contato
	public static void add() {
		int j=0;
		int aux =0;
		 Scanner input = new Scanner(System.in);
		 System.out.println("Nome:");
		 while (vcontato[j]!=null) {
			 j++;
		 }
		 vcontato[j] = input.next();
		 System.out.println("Email:");
		 vcontato[j+1] = input.next();
		 System.out.print("Deseja adicionar um novo contato? (S/N)");
		 String escolha = input.next();
		 if (escolha.equals ("S")) {
			 add();
		 }
		 else {
			 return;
		 }
	}
		 
		 
	//Metodo para remover um contato
	public static void rem() {
		 int i=0;
		 Scanner input = new Scanner(System.in);
		 System.out.println("Digite o nome do contato");
		 String busca = input.next();
		 while(!vcontato[i].equals(busca)) {
			 i++;
		 }
		 vcontato[i]=null;
		 vcontato[i+1]=null;
		/* System.out.print("Deseja remover um novo contato? (S/N)");
		 String escolha1 = input.next();
		 if (escolha1.equals ("S")) {
			 System.out.println("ok");

			 
			 rem();
		 }
		 else {
			 return;
		}*/
}
	public static void bus() {
		int i=0;
		 Scanner input = new Scanner(System.in);
		 System.out.println("Digite o nome do contato: ");
		 String busca = input.next();
		 while(!vcontato[i].equals(busca)) {
			 i++;
		 }
		 System.out.println(i);
		 //if() {
			 
		 }
		
	}


	
	
