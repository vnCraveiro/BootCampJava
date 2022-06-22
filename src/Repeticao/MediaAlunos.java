package Repeticao;

import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int contador = 0;

        while(contador <= 9){
            System.out.printf("\nDigite a %dº nota: ",contador+1);
            double nota = sc.nextDouble();
            total += nota; //total = total+nota;
            contador++; //contador = contador+1
        }

        double media = total / contador;

        System.out.printf("\n\nTotal de todas as notas é %.1f",total);
        System.out.printf("\nTotal de alunos é de %d", contador);
        System.out.printf("\nA media da turma é de %.1f",media);

        sc.close();
    }
}
