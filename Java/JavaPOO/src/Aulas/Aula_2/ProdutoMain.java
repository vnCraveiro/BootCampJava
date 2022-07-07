package JavaPOO.src.Aulas.Aula_2;

import java.util.Scanner;

public class ProdutoMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informar os dados do produto");

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        nome = nome.toUpperCase();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        System.out.print("Valor UN: ");
        double valorUnitario = sc.nextDouble();

        Produto celular = new Produto(nome, valorUnitario, quantidade);
        System.out.printf("\nNOME: %s",celular.nome);
        System.out.printf(" QTD: %d ",celular.quantidade);
        System.out.printf(" R$ %.2f",celular.valorUnitario);

        System.out.printf("\n\nImposto R$: %.2f ", celular.valorImposto());
        System.out.printf("\nValor total em estoque R$: %.2f", celular.valorEstoque());
    }
}
