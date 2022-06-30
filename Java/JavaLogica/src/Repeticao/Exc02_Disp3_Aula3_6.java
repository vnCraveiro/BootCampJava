package Repeticao;

import java.util.Scanner;

public class Exc02_Disp3_Aula3_6 {
    public static void main(String[] args) {
        double salario = 1000;
        double salarionovo = 1000;
        int ano = 2016;
        Scanner sc = new Scanner(System.in);

        System.out.printf("SALARIO ATUAL R$: %.2f.\n",salario);
        System.out.print("\n\nInforme o Ano: ");
        ano = sc.nextInt();
        switch (ano) {
            case 2015:
                salarionovo = salario * 1.880;
                System.out.println("\nVocê teve um reajuste no salario de 8,80%");
                System.out.printf("\nO valor do reajuste foi de %.2f",salarionovo - salario);
                System.out.printf ("\nSeu salario reajustado é de %.2f",salarionovo);
                ano = 2015;
                break;
            case 2016:
                salarionovo = salario * 1.1167;
                System.out.println("\nVocê teve um reajuste no salario de 11,67%");
                System.out.printf("\nO valor do reajuste foi de %.2f",salarionovo - salario);
                System.out.printf ("\nSeu salario reajustado é de %.2f",salarionovo);
                ano = 2016;
                break;
            case 2017:
                salarionovo = salario * 1.647;
                System.out.println("\nVocê teve um reajuste no salario de 6,47%");
                System.out.printf("\nO valor do reajuste foi de %.2f",salarionovo - salario);
                System.out.printf ("\nSeu salario reajustado é de %.2f",salarionovo);
                ano = 2017;
                break;
            case 2018:
                salarionovo = salario * 1.181;
                System.out.println("\nVocê teve um reajuste no salario de 1,81%");
                System.out.printf("\nO valor do reajuste foi de %.2f",salarionovo - salario);
                System.out.printf ("\nSeu salario reajustado é de %.2f",salarionovo);
                ano = 2018;
                break;
            case 2019:
                salarionovo = salario * 1.461;
                System.out.println("\nVocê teve um reajuste no salario de 4,61%");
                System.out.printf("\nO valor do reajuste foi de %.2f",salarionovo - salario);
                System.out.printf ("\nSeu salario reajustado é de %.2f",salarionovo);
                ano = 2019;
                break;
            case 2020:
                salarionovo = salario * 1.468;
                System.out.println("\nVocê teve um reajuste no salario de 4,68%");
                System.out.printf("\nO valor do reajuste foi de %.2f",salarionovo - salario);
                System.out.printf ("\nSeu salario reajustado é de %.2f",salarionovo);
                ano = 2020;
                break;
            case 2021:
                salarionovo = salario * 1.526;
                System.out.println("\nVocê teve um reajuste no salario de 5,26%");
                System.out.printf("\nO valor do reajuste foi de %.2f",salarionovo - salario);
                System.out.printf ("\nSeu salario reajustado é de %.2f",salarionovo);
                ano = 2021;
                break;
            default:
                System.out.printf("O seu salario nao será reajustado ! \nSeu salario é de %.2f", salario);
        }
        sc.close();
    }
}
