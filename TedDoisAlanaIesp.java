/*1. Faça um programa em Java, que resolva uma equação de 2o grau (ax2+bx+c = 0). O usuário deve digitar os valores de a, b e c.
Para isso, implemente a entrada de dados com Scanner ou JOptionPane.*/

import java.util.Scanner;

public class EquacaoSegGrau {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double a;
	    double b;
	    double c;
	    double delta;
	    double x1;
	    double x2;
	    
	    System.out.println("Digite o valor A:");
	    a = sc.nextDouble();
	    System.out.println("Digite o valor B:");
	    b = sc.nextDouble();
	    System.out.println("Digite o valor C:");
	    c = sc.nextDouble();
	    
	    delta = ((b*b)-(4*a*c));
	    
	    x1 = 0;
	    x2 = 0;
	    
	    if (delta >= 0){ 
		x1 = (-b + Math.sqrt (delta)) / ( 2*a );
		x2 = (-b - Math.sqrt (delta)) / ( 2*a );
		
		System.out.println("Delta = "+ delta);
		System.out.println("X1 = "+ x1 + "\nX2 = "+ x2);
	    } 
	    else{
	        System.out.println("Não há soluções!");
	    }
	    sc.close();
	}
}

