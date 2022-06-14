package sequencial;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        double n1, n2, n3;
        double media;

        Scanner sc = new Scanner(System.in);
        //-------INFORMACAO DE VALORES-------------\\
        System.out.print("Informe o valor de N1:");
        n1 = sc.nextDouble();
        System.out.print("Informe o valor de N2:");
        n2 = sc.nextDouble();
        System.out.print("Informe o valor de N3:");
        n3 = sc.nextDouble();

        //------CALCULANDO A MEDIA----------------\\
        media = (n1 + n2 + n3) / 3;

        System.out.printf("A Media e de %f", media);

        sc.close();
    }

}
