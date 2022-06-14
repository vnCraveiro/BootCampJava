package sequencial;

import java.util.Scanner;

public class Exc02_Disp3_Aula1_7 {

	public static void main(String[] args) {
		String funcionario;
		double salarioBruto, salarioLiquido;
		double DescontoINSS = 0.11;
		
		Scanner sc = new Scanner(System.in);
//---------------------------------------------------------
		System.out.printf("Informe o nome do funcionario: ");
		funcionario = sc.nextLine();
		System.out.printf("Informe o Salario Bruto do funcionario %s: ",funcionario);
		salarioBruto = sc.nextDouble();
		salarioLiquido = salarioBruto * (1 - DescontoINSS);
		System.out.printf("O desconto do INSS foi de R$ %.2f",salarioBruto-salarioLiquido);
		System.out.printf("\nO Salario Liquido do funcionario %s é de R$ %.2f",funcionario,salarioLiquido);

		sc.close();
	}

}
