package br.com.dio.calculadora;

import java.util.Scanner;

public class CalculadoraDigitoOperacao {

	public static void main(String[] args) {
		double n1;
		double n2;
		
		String  operacao = "";
		double control=0;
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a operação desejada (+, -, *, /): ");
		operacao = entrada.nextLine();
		
		System.out.println("Digite o primeiro valor: ");
		n1 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Digite o segundo valor: ");
		n2 = Integer.parseInt(entrada.next());
		
		if(operacao.equals("+")) {
			System.out.println("O resultado da subtração é: " +(n1 + n2));
			control++;			
		}
		
		if(operacao.equals("-")) {
			System.out.println("O resultado da subtração é: " +(n1 - n2));
			control++;		
		}
		
		if(operacao.equals("*")) {
			System.out.println("O resultado da multiplicação é: " +(n1 * n2));
			control++;			
		}
		
		if(operacao.equals("/")) {
			System.out.println("O resultado da divisão é: " +(n1 / n2));
			control++;			
		}
		
		if(control == 0) {
			System.out.println("Operação inválida, Tente novamente!");
						
		}
		
	}
	}