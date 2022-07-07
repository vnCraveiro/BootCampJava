package JavaPOO.src.Aulas.Aula_1.Exercicios.Veiculo;

import java.util.Scanner;

public class CalculoDespesaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passageiro;
        double tanque, consumo, km, valor;

        System.out.println("Informe a quantidade de passageiros: ");
        passageiro = sc.nextInt();
        System.out.println("Capacidade do tanque do veículo? ");
        tanque = sc.nextDouble();
        System.out.println("Consumo por litro: ");
        consumo = sc.nextDouble();
        System.out.println("Distancia em KM: ");
        km = sc.nextDouble();
        System.out.println("Valor do combustível R$: ");
        valor = sc.nextDouble();

        Veiculo onibus = new Veiculo(passageiro, tanque, consumo);
        System.out.printf(onibus.toString());

        double tanques = onibus.tanqueViagem(km);
        double rateio = onibus.dividirDespesas(km, valor);
        System.out.printf("Para a viagem vamos precisar de %.1f tanque(s) de combustivel" +
                "\nCada passageiro terá o custo de R$ %.2f ",tanques,rateio);

    }
}
