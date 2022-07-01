package triangulo;

import geometria.Triangulo;

import java.util.Scanner;

public class TrianguloExec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo a = new Triangulo();
        Triangulo b = new Triangulo();

        System.out.println("Digite os valores de A: ");
        a.x = sc.nextDouble();
        a.y = sc.nextDouble();
        a.z = sc.nextDouble();

        b.x = 15;
        b.y = 10;
        b.z = 13;

        double area,perimetro;
        String tipo;
            //Triangulo A
            if (Math.abs(a.x - a.y) < a.z && a.z < (a.x+a.y)){
                if(a.x == a.y && a.y == a.z)
                    tipo = "Equilátero";
                else if(a.x == a.y || a.x == a.z || a.y == a.z)
                    tipo = "Isósceles";
                else
                    tipo = "escaleno";
                    perimetro = (a.x + a.y+ a.z)/2.0;
                    area = Math.sqrt(perimetro*(perimetro-a.x)*(perimetro-a.y)*(perimetro-a.z));
                    System.out.printf("\nOs lados de A, %.1f, %.1f e %.1f formam um triângulo %s.",a.x,a.y,a.z,tipo);
                    System.out.printf("\nO perimetro do triângulo é %.1f.",perimetro);
                    System.out.printf("\nA área desse triângulo é %.1f.\n",area);
            }else {
                System.out.printf("\nOs lados informados não são de um triângulo\n\n");
            }

            //Triangulo B
            if (Math.abs(b.x - b.y) < b.z && b.z < (b.x+b.y)){
                if(b.x == b.y && b.y == b.z)
                    tipo = "Equilátero";
                else if(b.x == b.y || b.x == b.z || b.y == b.z)
                    tipo = "Isósceles";
                else
                    tipo = "escaleno";
                    perimetro = (b.x + b.y+ b.z)/2.0;
                    area = Math.sqrt(perimetro*(perimetro-b.x)*(perimetro-b.y)*(perimetro-b.z));
                    System.out.printf("\nOs lados de B, %.1f, %.1f e %.1f formam um triângulo %s.",b.x,b.y,b.z,tipo);
                    System.out.printf("\nO perimetro do triângulo é %.1f.",perimetro);
                    System.out.printf("\nA área desse triângulo é %.1f.\n",area);
                }else {
                    System.out.printf("\nOs lados informados não são de um triângulo\n\n");
                }
    }
}
