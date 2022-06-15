package BootCampJava.src.condicional;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args){
        double peso;
        String nome;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.printf("\n%s, Informe seu peso em KG: ",nome);
        peso = sc.nextDouble();


        sc.close();
    }

}
