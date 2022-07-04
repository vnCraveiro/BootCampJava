package triangulo;

import geometria.Triangulo;

import java.util.Scanner;

public class TrianguloExec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo a = new Triangulo();
        Triangulo b = new Triangulo();


        entrada(a);
            //Triangulo A
            if (a.validar()==true){
                System.out.println(a.toString());
            }else {
                System.out.println("\nOs lados informados não são de um triângulo\n");
            }
        entrada(b);
            //Triangulo B
            if (b.validar()==true){
                System.out.println(b.toString());
            }
            else {
                System.out.println("\nOs lados informados não são de um triângulo\n");
        }
    }

    public static void entrada(Triangulo lado){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores dos lados: ");
        lado.x = sc.nextDouble();
        lado.y = sc.nextDouble();
        lado.z = sc.nextDouble();
    }
}
