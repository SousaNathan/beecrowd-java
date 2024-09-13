package iniciante;

import java.util.Scanner;

public class Bee1071SomaImparesConsecutivosI {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        int aux;
        int soma = 0;

        if (valor1 > valor2) {
            aux = valor1;
            valor1 = valor2;
            valor2 = aux;
        }

        for (int i = valor1 + 1; i < valor2; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);
    }
}
