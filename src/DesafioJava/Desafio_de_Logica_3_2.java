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
        double precoUn;
        double valorC = 0, valorE = 0, valorV = 0;
        double custoC = 0, custoE = 0, custoV = 0;
        int quantidade, quantC = 0, quantE = 0, quantV = 0;
        int quantidadeTotalC = 0, quantidadeTotalE = 0, quantidadeTotalV = 0;
        double precoTotalC = 0, precoTotalE = 0, precoTotalV = 0;
        double totalizadorC = 0, totalizadorE = 0, totalizadorV = 0;
        String descricao, loja;
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
            quantidade = 0;
            precoUn = 0;

            while (categoria != 'C' && categoria != 'E' && categoria != 'V') {
                categoria = sc.next().charAt(0);
                categoria = Character.toUpperCase(categoria);
                switch (categoria) {
                    case 'C':
                        quantC = quantC + 1;
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.printf("\nItem %d",quantC);
                        System.out.print("\nVoce informou a categoria (C) Cama, Mesa e Banho\n");

                        System.out.print("\nInforme o Nome do produto: ");
                        descricao = sc.next();
                        while (quantidade <= 0) {
                            System.out.print("Informe a Quatidade do item que possui em estoque: ");
                            sc.nextLine();
                            quantidade = sc.nextInt();
                            if (quantidade <= 0){
                                System.out.println("A Quantidade deve ser maior que 0 Unidade.");
                            }
                        }
                        while (precoUn <= 0) {
                            System.out.print("Informe o custo unitario do item R$: ");
                            precoUn = sc.nextDouble();
                            if (precoUn <= 0) {
                                System.out.println("O preço deve ser maior que R$ 0,00.");
                            }
                        }
                        System.out.print("\nItem Cadastrado!!\n");
                        quantidadeTotalC = quantidadeTotalC + quantidade;
                        precoTotalC = precoTotalC + precoUn;
                        totalizadorC = precoTotalC*quantidadeTotalC; //MULTIPLICA O PRECO PELA QUANTIDADE
                        custoC = precoUn * 0.3741; //ALIQUOTA DE IMPOSTO DE 37,41%
                        valorC = precoUn + custoC * 1.30; //LUCRO DE 30%
                        System.out.printf("\nPreço sugerido por UND com lucro de 30%% é de R$: %.2f",valorC);
                        System.out.printf("\nValor do imposto cobrado por UND R$: %.2f\n",custoC);
                        break;

                    case 'E': //ELETRODOMESTICO
                        quantE = quantE + 1;
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.printf("\nItem %d",quantE);
                        System.out.print("\nVoce informou a categoria (E) Eletrodomestico\n");

                        System.out.print("\nInforme o Nome do produto: ");
                        descricao = sc.next();
                        while (quantidade <= 0) {
                            System.out.print("Informe a Quatidade do item que possui em estoque: ");
                            sc.nextLine();
                            quantidade = sc.nextInt();
                            if (quantidade <= 0){
                                System.out.println("A Quantidade deve ser maior que 0 Unidade.");
                            }
                        }
                        while (precoUn <= 0) {
                            System.out.print("Informe o custo unitario do item R$: ");
                            precoUn = sc.nextDouble();
                            if (precoUn <= 0) {
                                System.out.println("O preço deve ser maior que R$ 0,00.");
                            }
                        }
                        System.out.print("\nItem Cadastrado!!\n");
                        quantidadeTotalE = quantidadeTotalE + quantidade;
                        precoTotalE = precoTotalE + precoUn;
                        totalizadorE = precoTotalE*quantidadeTotalE; //MULTIPLICA O PRECO PELA QUANTIDADE
                        custoE = precoUn * 0.4314; //ALIQUOTA DE IMPOSTO DE 43,14%
                        valorE = precoUn + custoE * 1.35; //LUCRO DE 35%
                        System.out.printf("\nPreço sugerido por UND com lucro de 35%% é de R$: %.2f",valorE);
                        System.out.printf("\nValor do imposto cobrado por UND R$: %.2f\n",custoE);
                        break;

                    case 'V': //VESTUARIO
                        quantV = quantV + 1;
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.printf("\nItem %d",quantV);
                        System.out.print("\nVoce informou a categoria (V) Vestuario\n");

                        System.out.print("\nInforme o Nome do produto: ");
                        descricao = sc.next();
                        while (quantidade <= 0) {
                            System.out.print("Informe a Quatidade do item que possui em estoque: ");
                            sc.nextLine();
                            quantidade = sc.nextInt();
                            if (quantidade <= 0){
                                System.out.println("A Quantidade deve ser maior que 0 Unidade.");
                            }
                        }
                        while (precoUn <= 0) {
                            System.out.print("Informe o custo unitario do item R$: ");
                            precoUn = sc.nextDouble();
                            if (precoUn <= 0) {
                                System.out.println("O preço deve ser maior que R$ 0,00.");
                            }
                        }
                        System.out.print("\nItem Cadastrado!!\n");
                        quantidadeTotalV = quantidadeTotalV + quantidade;
                        precoTotalV = precoTotalV + precoUn;
                        totalizadorV = precoTotalV*quantidadeTotalV; //MULTIPLICA O PRECO PELA QUANTIDADE
                        custoV = precoUn * 0.3842; //ALIQUOTA DE IMPOSTO DE 38,42%
                        valorV = precoUn + custoV * 1.50; //LUCRO DE 50%
                        System.out.printf("\nPreço sugerido por UND com lucro de 50%% é de R$: %.2f",valorV);
                        System.out.printf("\nValor do imposto cobrado por UND R$: %.2f\n",custoV);
                        break;

                    default:
                        System.out.print("\nVoce digitou uma categoria invalida!, Digite uma categoria valida\n(C) Cama, Mesa e Banho \n(E) Eletrodoméstico \n(V) Vestuario\n\nOpção:");
                }
            }

            //RELATORIO FINAL GERAL
            System.out.print("\nDeseja continuar ?\nCaso sim, Digite (1) Continuar\nCaso Não, Digite (2) Encerrar\n");
            int lista = sc.nextInt();
                if (lista == 1){
                    System.out.println("\nCerto, continuando..");
                    continuar = true;
                    }
                        else{
                            continuar = false;

                            System.out.print("\nCadastros Encerrados...\nRELATORIO DE CADASTROS:");
                            System.out.print("\n\n>>>>CATEGORIA CAMA MESA E BANHO<<<");
                            System.out.printf("\nForam cadastrados %d tipos de Produtos na Categoria Cama, mesa e banho", quantC);
                            System.out.printf("\nA Quantidade Total de unidades cadastradas na Categoria Cama, mesa e banho é de %d UNIDADES", quantidadeTotalC);
                            System.out.printf("\nO custo total da mercadoria cadastrado na Categoria Cama, mesa e banho é de R$ %.2f",totalizadorC);

                            System.out.print("\n\n>>>>CATEGORIA ELETRODOMESTICO<<<<");
                            System.out.printf("\nForam cadastrados %d tipos de Produtos na Categoria Eletrodomestico", quantE);
                            System.out.printf("\nA Quantidade Total de unidades cadastradas na Categoria Eletrodomestico é de %d UNIDADES", quantidadeTotalE);
                            System.out.printf("\nO custo total da mercadoria cadastrado na Categoria Eletrodomestico é de R$ %.2f",totalizadorE);

                            System.out.print("\n\n>>>>CATEGORIA VESTUARIO<<<<");
                            System.out.printf("\nForam cadastrados %d tipos de Produtos na Categoria Cama, mesa e banho", quantV);
                            System.out.printf("\nA Quantidade Total de unidades cadastradas na Categoria Cama, mesa e banho é de %d UNIDADES", quantidadeTotalV);
                            System.out.printf("\nO custo total da mercadoria cadastrado na Categoria Cama, mesa e banho é de R$ %.2f",totalizadorV);

                            System.out.print("\n\n>>>>SOMATORIA DAS CATEGORIAS<<<<");
                            System.out.printf("\nA quantidade total de tipos de Produtos cadastrados nas categorias foram de: %d", quantC + quantE + quantV);
                            System.out.printf("\nA quantidade total de todos estoque é de %d UNIDADES",quantidadeTotalC + quantidadeTotalE + quantidadeTotalV);
                            System.out.printf("\nO custo total do estoque de todas categorias é de R$ %.2f\n", totalizadorC + totalizadorE + totalizadorV);
                }
        }
        sc.close();
    }
}
