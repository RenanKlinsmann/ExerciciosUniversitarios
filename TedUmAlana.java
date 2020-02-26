import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Digite as horas trabalhadas:");
	        double horas_trab = sc.nextDouble();
	        System.out.println("Digite o valor da hora trabalhada:");
	        double valor_hora = sc.nextDouble();
	    
	    
	        double salario_bruto = horas_trab * valor_hora;
	        double descontoIprf = (salario_bruto * 11)/100;
		double descontoInss = (salario_bruto * 8)/100;
		double descontoSind = (salario_bruto * 5)/100;
		
		System.out.println("Salario Bruto = R$"+ salario_bruto);
		System.out.println("IPRF: 11% = R$"+ descontoIprf);
		System.out.println("INSS: 8% = R$"+ descontoInss);
		System.out.println("SINDICATO: 5% = R$"+ descontoSind);
		
		double total_impostos = descontoIprf + descontoInss + descontoSind;
		
		System.out.printf("Total de impostos = R$ %.2f", total_impostos);
		
		double salario_liquido = salario_bruto;
		if(salario_bruto > 0){
		  salario_liquido =  salario_bruto - descontoIprf - descontoInss - descontoSind;
		  System.out.printf("\nSalario liquido = R$ %.2f", salario_liquido);
		 
		}else if(salario_bruto <= 0){
		    System.out.println("ISENTO");
		}
		
		
		
		
		
		sc.close();
	}
}
