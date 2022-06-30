package condicional;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args){
        double peso, altura;
        String nome, classificacao;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.printf("%s, Informe seu peso em KG: ",nome);
        peso = sc.nextDouble();
        System.out.printf("%s, Informe sua altura em Metro:",nome);
        altura = sc.nextDouble();

        double imc = peso/Math.pow(altura, 2);

        if (imc < 18.5) {
            //classificacao = "Abaixo do peso!";
            System.out.printf("\n%s, Você esta abaixo do peso ! Seu IMC é de: %.2f", nome, imc);
        } else if ((imc >= 18.5) && (imc <= 24.9)) {
            System.out.printf("\n%s, Você esta com peso normal ! Seu IMC é de: %.2f", nome, imc);
        } else if ((imc >= 25) && (imc <= 29.9)) {
            System.out.printf("\n%s, Você esta com sobre peso ! Seu IMC é de: %.2f", nome, imc);
        } else if ((imc >= 30) && (imc <= 34.9)) {
            System.out.printf("\n%s, Você esta com Obsidade Nivel I, Seu IMC é de: %.2f", nome, imc);
        } else if ((imc >= 35) && (imc <= 39.9)) {
            System.out.printf("\n%s, Você esta com Obsidade Nivel II, Seu IMC é de: %.2f", nome, imc);
        } else {
            System.out.printf("\n%s, Você esta com Obsidade Mórbida, Seu IMC é de: %.2f", nome, imc);
        }



        sc.close();
    }

}
