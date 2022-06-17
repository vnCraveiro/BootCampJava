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
        double preco = 0, precoTot = 0, imposto = 0, lucro = 0;
        double valorC = 0, valorE = 0, valorV = 0, valorTot = 0;
        double custoC = 0, custoE = 0, custoV = 0, custoTot = 0;
        int quantidade = 0, quantidadeTot = 0, quantC = 0, quantE = 0, quantV = 0;
        String descricao, loja, cod;
        boolean continuar = true;
        char categoria = ' ';
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome da Loja: ");
        loja = sc.nextLine();
        System.out.printf(""
                + " ________________________________________________________\n"
                + "                                                        \n"
                + "                Inventario da %s                \n"
                + "_________________________________________________________\n", loja);
        for (int contador = 0; continuar == true; contador++) {
            System.out.print("\nInforme a Categoria do Item a ser cadastrado conforme as categorias abaixo.");
            System.out.print("\n(C) Cama, Mesa e Banho \n(E) Eletrodoméstico \n(V) Vestuario\n\nOpção: ");
            categoria = ' ';
            while (categoria != 'C' && categoria != 'E' && categoria != 'V') {
                categoria = sc.next().charAt(0);
                categoria = Character.toUpperCase(categoria);
                switch (categoria) {
                    case 'C':
                        System.out.print("\nVoce informou a categoria (C) Cama, Mesa e Banho\n");
                        imposto = 37.41;
                        lucro = 30;
                        quantC = quantC++;
                        valorC = valorC + preco;
                        custoC = custoC + preco;

                        break;
                    case 'E':
                        System.out.print("\nVoce informou a categoria (E) Eletrodoméstico\n");
                        imposto = 43.14;
                        lucro = 50;
                        quantE = quantE++;
                        valorE = valorE + preco;
                        custoE = custoE + preco;
                        break;
                    case 'V':
                        System.out.print("\nVoce informou a categoria (V) Vestuario\n");
                        imposto = 38.42;
                        lucro = 50;
                        quantV = quantV++;
                        valorV = valorV + preco;
                        custoV = custoV + preco;
                        break;
                    default:
                        System.out.print("\nVoce digitou uma categoria invalida!, Digite uma categoria valida\n(C) Cama, Mesa e Banho \n(E) Eletrodoméstico \n(V) Vestuario\n\nOpção:");
                }
            }
            System.out.print("\nInforme o Codigo desejado para o produto: ");
            cod = sc.next();
            System.out.print("Informe o Nome do produto: ");
            descricao = sc.next();//AO PASSA ESSA FUNÇAO, ELA PULA DIRETO PARA A OUTRA LINHA E NAO DEIXA ESCREVER.
            System.out.print("Informe a Quatidade do item que possui em estoque: ");
            sc.nextLine();
            quantidade = sc.nextInt();
            System.out.print("Informe o preço unitario do item R$: ");
            preco = sc.nextDouble();
            System.out.print("\nItem Cadastrado!!\n");

            //RELATORIO FINAL GERAL
            System.out.print("\nDeseja continuar ?\nCaso sim, Digite (1) Continuar\nCaso Não, Digite (2) Encerrar\n");
            int lista = sc.nextInt();
                if (lista == 1){
                    System.out.println("\nCerto, continuando..");
                    continuar = true;
                    }
                        else{
                            continuar = false;
                            //CATEGORIA CAMA MESA E BANHO
                            System.out.println("\nCadastros Encerrados...\nRELATORIO DE CADASTROS:");
                            System.out.printf("\nA Quantidade de itens cadastrados na Categoria Cama, mesa e banho é de %d", quantC);
                            System.out.printf("\nO custo total da mercadoria cadastrado na Categoria Cama, mesa e banho é de R$ %.2f", custoC);
                            System.out.printf("\nO valor total da mercadoria cadastrado na Categoria Cama, mesa e banho é de R$ %.2f", valorC);
                            System.out.printf("\nO preço sugerido de cada produto na Categoria Cama, mesa e banho é de %.2f", lucro);

                            //CATEGORIA ELETRONICOS
                            System.out.printf("\nA Quantidade de itens cadastrados na Categoria Eletronicos é de %d", quantE);
                            System.out.printf("\nO valor total da mercadoria cadastrado na Categoria Eletronicos é de R$ %.2f", valorE);
                            System.out.printf("\nO custo total da mercadoria cadastrado na Categoria Eletronicos é de R$ %.2f", custoE);
                            System.out.printf("\nO preço sugerido de cada produto na Categoria Eletronicos é de %.2f", lucro);

                            //CATEGORIA VESTUARIO
                            System.out.printf("\nA Quantidade de itens cadastrados na Categoria Vestuario é de %d", quantE);
                            System.out.printf("\nO valor total da mercadoria cadastrado na Categoria Vestuario é de R$ %.2f", valorE);
                            System.out.printf("\nO custo total da mercadoria cadastrado na Categoria Vestuario é de R$ %.2f", custoV);
                            System.out.printf("\nO preço sugerido de cada produto na Categoria Vestuario é de %.2f", lucro);

                }
        }
        sc.close();
    }

}
