package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class CadastraProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto produto = new Produto();

		System.out.println("Digite os dados do produto!");
		System.out.print("Nome:");
		produto.nome = sc.nextLine();
		System.out.print("Preço:");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade:");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados da compra: " + produto);
		
		System.out.println();
		System.out.println("Deseja aumenta a quantidade se sim digite quantos:");
		int extra = sc.nextInt();
		produto.addProdutos(extra);
		
		System.out.println();
		System.out.println("Dados da compra: " + produto);
		
		System.out.println();
		System.out.println("Deseja diminuir a quantidade se sim digite quantos:");
		extra = sc.nextInt();
		produto.removeProdutos(extra);
		
		System.out.println();
		System.out.println("Dados da compra: " + produto);

		sc.close();
	}

}
