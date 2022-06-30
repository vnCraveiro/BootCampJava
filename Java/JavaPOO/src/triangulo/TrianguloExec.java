package triangulo;

import java.util.Scanner;

public class TrianguloExec {
    public static void main(String[] args) {
        double x,y,z,area,perimetro;
        String tipo;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; 1 <= 2 ; i++){
            System.out.printf("\nDigite os lados do %dº triangulo:\n",i);
            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();

            if (Math.abs(x - y) < z && z < (x+y)){
                if(x == y && y == z)
                    tipo = "Equilátero";
                else if(x == y || x == z || y == z)
                    tipo = "Isósceles";
                    else
                        tipo = "escaleno";
                    perimetro = (x + y+ z)/2.0;
                    area = Math.sqrt(perimetro*(perimetro-x)*(perimetro-y)*(perimetro-z));
                    System.out.printf("\nOs lados %.1f, %.1f e %.1f formam um triangulo %s.",x,y,z,tipo);
                    System.out.printf("\nO perimetro do triangulo é %.1f.",perimetro);
                    System.out.printf("\nA área desse triângulo é %.1f.\n",area);
            }else{
                System.out.printf("\nOs lados informados não são de um triangulo\n\n");
            }
        }
    }
}
