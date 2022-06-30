package Exercicios_Treino;

/*2. imprima a m�dia aritm�tica dos n�meros 8,9 e 7.
 * A m�dia dos n�meros 4, 5 e 6.
 * A soma das duas m�dias.
 * A m�dia das m�dias.*/

public class Exc02_ListaJavaBasico {

    public static void main(String[] args) {

        double n4 = 4, n5 = 5, n6 = 6, n8 = 8, n9 = 9, n7 = 7;
        double media1, media2;

//------------------------------------------------------
        media1 = (n8 + n9 + n7) / 3;
        media2 = (n4 + n5 + n6) / 3;

        System.out.printf("Nº 8 + 9 + 7 = (1º Media: %.2f) \nNº 4 + 5 + 6 = (2º Media: %.2f)\n", media1, media2);
        System.out.print("------------------------------");
        System.out.printf("\nA soma das medias é de: %.2f ", media1 + media2);
        System.out.print("\n------------------------------");
        System.out.printf("\nA media das medias é de: %.2f", (media1 + media2) / 2);
    }
}
