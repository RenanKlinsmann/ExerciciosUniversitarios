package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Insira o numero da conta:");
		int numero = sc.nextInt();
		System.out.print("Insira o nome do titular da conta:");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Deseja fazer um deposito inicial (S/N)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Insira o valor de deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
		}
		else {
			conta = new Conta(numero, nome);
		}
		
	    System.out.println();
	    System.out.println("Dados do cliente:");
	    System.out.println(conta);
	    
	    System.out.println();
        System.out.print("Insira o valor a ser depositado $: ");
        double valorDepositado = sc.nextDouble();
        conta.deposito(valorDepositado);
        System.out.println("Saldo atualizado:");
        System.out.println(conta);
        
        System.out.println();
        System.out.print("Insira o valor de Saque: $ ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Saldo atualizado: $ ");
        System.out.println(conta);
		

		
		
		
		sc.close();
	}

}
