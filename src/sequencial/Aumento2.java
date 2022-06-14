package sequencial;

import java.util.Scanner;

public class Aumento2 {

    public static void main(String[] args) {
        double salarioBruto, aumento, salarioBrutoNovo;
        String funcionario;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome do Funcionario: ");
        funcionario = sc.nextLine();
        System.out.print("Informe o sal�rio bruto a ser reajustado em R$:");
        salarioBruto = sc.nextDouble();
        System.out.print("Informe o percentual de aumento(%):");
        aumento = sc.nextDouble();

        salarioBrutoNovo = salarioBruto * (1 + aumento / 100);

        System.out.printf("O salario antigo era o valor de R$: %.2f\n", salarioBruto);
        System.out.printf("O novo salario bruto do %s � de R$: %.2f", funcionario, salarioBrutoNovo);


        sc.close();
    }

}
