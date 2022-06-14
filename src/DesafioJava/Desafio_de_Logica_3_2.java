package DesafioJava;

import java.util.Scanner;

public class Desafio_de_Logica_3_2 {

//	Uma loja varejista de departamentos está catalogando os produtos em estoque com as seguintes informações:
//	• Preço unitário
//	• Quantidade
//	• Categoria (aceitar somente C [cama, mesa e banho], E [eletrodomésticos] e V [vestuário])
//	A loja trabalha com 15 tipos produtos.
//	
//	•Calcule e mostre:
//		•1. O cálculo de impostos:
//			Tipo 				   Alíquota*
//			Cama, mesa e banho 		37,41%
//			Eletrodoméstico 		43,14%
//			Vestuário 				38,42%
//
//		>Calcule e mostre:
//		•2. Calcular a margem de lucro:
//			Tipo 					Margem
//			Cama, mesa e banho 		30%
//			Eletrodoméstico 		35%
//			Vestuário 				50%
//			
//		•3. Qual é o valor total dos produtos em estoque separados por categoria?

    public static void main(String[] args) {
        double precoUn, precoTot;
        int quantidadeUn, quantidadeTot, cod;
        String categoria, descricao, loja;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o nome da Loja: ");
        loja = sc.nextLine();
        System.out.printf(""
                + " ________________________________________________________\n"
                + "|                                                        |\n"
                + "|                Inventario da %s                |\n"
                + "|________________________________________________________|\n", loja);
        System.out.printf("\nInforme a Categoria do Item a ser cadastrado conforme as categorias abaixo.");
        System.out.printf("\n(C) Cama, Mesa e Banho \n(E) Eletrodoméstico \n(V) Vestuario\n\nOpção: ");
        categoria = sc.next();
        System.out.print("\nInforme o Codigo desejado para o produto: ");
        cod = sc.nextInt();
        System.out.printf("\nInforme o Nome do produto: ");
        descricao = sc.nextLine();//VERIFICAR OQUE COLOCAR NA STRING QUE ACATE TODAS AS INFORMACOES DIGITADAS.
        System.out.printf("\nInforme a Quatidade do item %s que possui em estoque: ", descricao);
        quantidadeUn = sc.nextInt();
        System.out.printf("\nInforme o preço unitario do item R$: ");
        precoUn = sc.nextDouble();

        System.out.print("\n| CODIGO |             NOME             | QTD UN | PRECO R$ |");
        System.out.printf("\n| %d | %s   | %d | %.2f |", cod, descricao, quantidadeUn, precoUn);


        sc.close();
    }

}
