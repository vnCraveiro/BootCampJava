package JavaPOO.src.Aulas.Aula_3;

import JavaPOO.src.Aulas.Aula_3.entidade.Contrato;
import JavaPOO.src.Aulas.Aula_3.entidade.Departamento;
import JavaPOO.src.Aulas.Aula_3.entidade.Funcionario;
import JavaPOO.src.Aulas.Aula_3.entidade.enums.Nivel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmpresaMain {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Departamento: ");
        String departamento = sc.nextLine();
        System.out.print("Nome do funcionario: ");
        String func = sc.nextLine();
        System.out.print("Nivel do funcionario: ");
        String nivelFuncionario = sc.nextLine();
        nivelFuncionario = nivelFuncionario.toUpperCase();
        System.out.print("Salario base: ");
        double salario = sc.nextDouble();

        Funcionario funcionario = new Funcionario(func, Nivel.valueOf(nivelFuncionario),salario,new Departamento(departamento));

        System.out.print("Quantidade contratos associados: ");
        int qtdContrado = sc.nextInt();

        for (int i = 1; i <= qtdContrado; i++){
            System.out.printf("\nContrato nº "+i+":");
            System.out.print("Data (DD/MM/AAAA):");
            Date data = sdf.parse(sc.next());
            System.out.print("Valor da hora: ");
            double valorHora = sc.nextDouble();
            System.out.print("Quantidade de horas: ");
            int qtdHora = sc.nextInt();
            Contrato contrato = new Contrato(data, valorHora, qtdHora);
            funcionario.addContrato(contrato);
        }

        System.out.print("\nInforme o mês e o ano (MM/AAAA):");
        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno.substring(0,2));
        int ano = Integer.parseInt(mesAno.substring(3));
        System.out.println("\n\nNome do funcionario: "+funcionario.getNome());
        System.out.println("Departamento: "+funcionario.getDepartamento().getNome());
        System.out.printf("Salário de "+mesAno+" é R$: "+String.format("%.2f", funcionario.ganho(ano, mes)));

    }
}
