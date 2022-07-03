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

        System.out.println("Digite os valores de B: ");
        b.x = sc.nextDouble();
        b.y = sc.nextDouble();
        b.z = sc.nextDouble();

            //Triangulo A
            if (a.validar()==true){
                System.out.println(a.toString());
//                if(a.x == a.y && a.y == a.z)
//                    tipo = "Equilátero";
//                else if(a.x == a.y || a.x == a.z || a.y == a.z)
//                    tipo = "Isósceles";
//                else
//                    tipo = "Escaleno";
//                    perimetro = (a.x + a.y+ a.z)/2.0;
//                    area = Math.sqrt(perimetro*(perimetro-a.x)*(perimetro-a.y)*(perimetro-a.z));
            }else {
                System.out.println("\nOs lados informados não são de um triângulo\n\n");
            }

            //Triangulo B
            if (b.validar()==true){
                System.out.println(b.toString());
            }
            else {
                System.out.println("\nOs lados informados não são de um triângulo\n\n");
        }
            sc.close();
    }
}
