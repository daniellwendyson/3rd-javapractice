package atividade3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int contador = 0;

		while (contador <= 10) {
			System.out.println(contador);
			contador = contador + 1;
		}
		
		System.out.println("----------------------");
		
		int contador1 = 10;

		while (contador1 >= 0) {
			System.out.println(contador1);
			contador1 = contador1 - 1;
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um número: ");
		int numero = sc.nextInt();
		System.out.println("digitei "+numero);
		
		System.out.println("---------------------------------");
		
		int num, contador2 = 1;
		
		System.out.println("digite um número: ");
		num = sc.nextInt();
		System.out.println("você digitou o número "+ num);
		
		while (contador2 <= num) {
			System.out.println(contador2);
			contador2 = contador2 + 1;
		}
		
		int numero1;
		
		System.out.println("digite um número: ");
		numero1 = sc.nextInt();
		
		while (numero1 != 0) {
			System.out.println(numero1);
			System.out.println("digite um número: ");
			numero1 = sc.nextInt();
		}
		System.out.println("digite uma nota: ");
		float n1 = sc.nextFloat();
		
		while(n1 != 0) {
			if (n1 >= 7) 
				System.out.println("APROVADO!");
			
			else if (n1 < 7) 
				System.out.println("RECUPERAÇÃO!");
			
			System.out.println("digite a sua nota: ");
			n1 = sc.nextFloat();
		}

		System.out.println("REPROVADO!");
		
		String karen;
		String karen1 = "karen";
		
		System.out.println("digite um nome: ");
		karen = sc.next();
		
		while(! karen1.equals(karen)) {
			System.out.println("digite um nome: ");
			karen = sc.next();
		}
				
		
	}

}