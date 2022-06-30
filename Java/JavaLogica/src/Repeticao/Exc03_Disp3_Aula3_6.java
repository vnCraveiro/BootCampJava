package Repeticao;

import java.util.Scanner;

public class Exc03_Disp3_Aula3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.print("Informe o tamanho da base em cm²: ");
        base = sc.nextDouble();
        System.out.print("Informe a altura do triangulo em cm²: ");
        altura = sc.nextDouble();

        while (base <=0 ) {
            System.out.print("A base nao pode ser menor que 0cm², informe outro numero: ");
            base = sc.nextDouble();
            }
        while (altura <= 0) {
            System.out.print("A altura nao pode ser menor que 0cm², informe outro numero: ");
            altura = sc.nextDouble();
            }


        area = (base*altura)/2;

        System.out.printf("A Area de seu tringulo é de %.2f CM²",area);




        sc.close();
    }
}
