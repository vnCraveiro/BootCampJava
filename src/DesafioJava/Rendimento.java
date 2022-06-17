package DesafioJava;

import java.util.Scanner;

public class Rendimento {
    public static void main(String[] args) {
        double saldo1,saldo2,total;
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe o Saldo da conta:");
        saldo1 = sc.nextDouble();
        System.out.print("Informe o saldo do aplicativo:");
        saldo2 = sc.nextDouble();

        System.out.printf("O rendedimento foi de %.2f",saldo1-saldo2);
    }
}
