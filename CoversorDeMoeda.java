package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conversor;

public class CoversorDeMoeda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual é o preço do dólar? "); 
		double precoDolar = sc.nextDouble(); 
		System.out.print("Quantos dólares serão comprados? "); 
		double montante = sc.nextDouble(); 
		double result = Conversor.dolarParaReal(montante, precoDolar); 
		System.out.printf("Valor a ser pago em reais = R$ %.2f%n", result);
		sc.close();


	}

}
