package principal;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
	    final double PI = 3.1415;
		String nome; 
		int idade;
		double altura;
		char sexo;
		
		System.out.println("Por favor, digite seu nome: ");
		//leitura de dados tipo string (conjunto de caracteres)
		nome = leia.nextLine();
		
		System.out.println("\ndigite a sua idade: ");
		idade = leia.nextInt();
		//leitura de dados tipo Int (conjunto de inteiros)
		
		System.out.println("digite a sua Altura: ");
		altura = leia.nextDouble();
		//leitura de dados tipo Double (conjunto de caracteres)
		
		System.out.println("Qual o sexo (M/F): ");
		sexo = leia.next().charAt(0); 
		
		
		System.out.println("O nome digitado foi: " + nome);
		System.out.println("A idade digitado foi: " + idade);
		System.out.println("A altura digitado foi: " + altura);
		System.out.println("A sexo digitado foi: " + sexo);
		
		
		
		
		leia.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
