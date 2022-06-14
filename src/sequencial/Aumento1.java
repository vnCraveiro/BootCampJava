package sequencial;

import java.util.Scanner;

public class Aumento1 {
    public static void main(String[] args) {

        double salarioBruto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o sal�rio bruto: R$");
        salarioBruto = sc.nextDouble();

        salarioBruto = salarioBruto * 1.05;

        System.out.printf("O novo salario bruto � de R$:%.2f", salarioBruto);
        sc.close();
    }
}
