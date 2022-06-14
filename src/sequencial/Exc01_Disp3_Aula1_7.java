package sequencial;
//(1) Calcule e mostre a média ponderada de 4 valores informados pelo usuario.


import java.util.Scanner;

public class Exc01_Disp3_Aula1_7 {
	
	public static void main(String[]args) {
		
		double n1,n2,n3,n4;
		double mediaPonderada;
		String usuario;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o Usuario:");
		usuario = sc.nextLine();
		System.out.printf("%s, Informe a Primeria nota: ",usuario);
		n1 = sc.nextDouble();
		n1 = (n1*2); //ponderado, atribuido o peso de 2
		System.out.printf("%s, Informe a Segunda nota: ",usuario);
		n2 = sc.nextDouble();
		n2 = (n2*2); //ponderado, atribuido o peso de 2
		System.out.printf("%s, Informe a Terceira nota: ",usuario);
		n3 = sc.nextDouble();
		n3 = (n3*3); //ponderado, atribuido o peso de 3
		System.out.printf("%s, Informe a Quarta Nota: ",usuario);
		n4 = sc.nextDouble();
		n4 = (n4*3); //ponderado, atribuido o peso de 3
		System.out.printf("********************************************\n");
		System.out.printf("%s, Os numeros informados foram atribuido os pesos 2 nas duas primeiras notas e 3 nas duas ultimas notas.",usuario );
		mediaPonderada = (n1+n2+n3+n4)/10;
		System.out.printf("\n********************************************\n");
		System.out.printf("%s, A media ponderada é de: %.2f ",usuario, mediaPonderada);
	
	
	
		sc.close();
	}
}
