package Repeticao;

import java.util.Scanner;

public class Exc01_Disp3_Aula3_6 {
    public static void main(String[] args) {
        int i, aprovado = 0, reprovado = 0;
        double media = 0;
        double total = 0;
        double nota = 0;

        Scanner sc = new Scanner(System.in);

        for (i = 0; i <= 9; i++) {

            System.out.printf("Informe a nota do %dº aluno: ", i+1);
            nota = sc.nextDouble();
            total += nota;
            media = total / i;

            if (nota < 6) {
                System.out.printf("Voce tirou a nota %.1f, Que pena foi Reprovado !\n", nota);
                reprovado++;
            } else {
                System.out.printf("Voce tirou a nota %.1f, Parabens foi Aprovado !\n", nota);
                aprovado++;
            }
        }
        System.out.printf("\n\nA quantidade de alunos é de %d",i);
        System.out.printf("\nA quantidade de alunos reprovados foram de %d.",reprovado);
        System.out.printf("\nA qunatidade de alunos aprovados forem de %d.",aprovado);
        System.out.printf("\nA media da turma foi de %.1f",media);
    }
}
