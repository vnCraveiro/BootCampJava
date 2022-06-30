package Repeticao;

import java.util.Scanner;

public class MediaAlunosFor {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int contador;
            double total = 0;

            for (contador = 0; contador <= 9; contador++){
              System.out.printf("\n\nDigite a %dº Nota: ",contador+1 );
             double nota = sc.nextDouble();
             total += nota;
            }

            double media = total / contador;

            System.out.printf("\n\nTotal de alunos da classe %d\n.",contador);
            System.out.printf("\nO total de nota dos alunos %.1f.",total);
            System.out.printf("\nA media da classe é de %.1f.\n",media);

            sc.close();
    }
}
