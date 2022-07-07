package JavaPOO.src.Aulas.Aula_1.triangulo;

import java.util.Locale;
import java.util.Scanner;

public class TrianguloMain {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
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
