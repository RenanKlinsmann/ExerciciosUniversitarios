package programaMain;

import java.util.Locale;
import java.util.Scanner;

import entidades.Calculadora;

public class Aplicacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
  
		
		
		System.out.print("Digite o Raio: "); 
		double raio = sc.nextDouble();
		double c = Calculadora.circumference(raio);
		double v = Calculadora.volume(raio);
		System.out.printf("Circumference: %.2f%n", c); 
		System.out.printf("Volume: %.2f%n", v); 
		System.out.printf("PI value: %.2f%n", Calculadora.PI);


	}

}
