package BootCampJava.src.condicional;

import java.util.Scanner;

public class EstruturaCondicionalComposta {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num;
          String resultado;

          System.out.println("Informe um numero: ");
          num = sc.nextInt();

          if (num % 2 == 0) {
               resultado = "Par";
          } else {
               resultado = "Impar";
          }
          System.out.printf("\nO número %d é %s", num,resultado);
          System.out.println("\n Encerrando o programa!");

          sc.close();
     }
}
