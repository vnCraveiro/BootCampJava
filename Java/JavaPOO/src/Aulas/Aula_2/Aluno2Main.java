package JavaPOO.src.Aulas.Aula_2;

import java.util.Scanner;

public class Aluno2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Data de nascimento (dd/mm/yyyy): ");
        String nascimento = sc.next();
        System.out.println("Data de matricula (dd/mm/yyyy): ");
        String matricula = sc.next();

        Aluno aluno = new Aluno(nome, nascimento, matricula);
        System.out.println(aluno);

        sc.close();
    }
}
