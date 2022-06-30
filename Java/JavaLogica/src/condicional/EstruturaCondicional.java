package condicional;

import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Informe um número: ");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.printf("O numero %d é par! \n", num);
        }
        System.out.println("\n Encerrando a execução");
    sc.close();
    }

}
