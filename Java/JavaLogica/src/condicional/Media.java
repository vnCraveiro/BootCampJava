package BootCampJava.src.condicional;

import java.util.Scanner;

public class Media {
    public static void main(String[] args){

        double n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a 1º nota: ");
        n1 = sc.nextDouble();
        System.out.println("Informe a 2° nota: ");
        n2 = sc.nextDouble();
        System.out.println("Informe a 3° nota: ");
        n3 = sc.nextDouble();

        double media = (n1+n2+n3)/3;
        String resultado;

        if (media >= 6.0) {
            resultado = "Aprovado!";
        } else {
            resultado = "Reprovado!";
        }
         System.out.printf("\nO aluno tiro a media: %.1f e foi %s",media, resultado);

        sc.close();

    }

}
