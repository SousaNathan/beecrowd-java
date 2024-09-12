package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1001ExtremamenteBasico {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro número:");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Segundo número:");
        int segundoNumero = scanner.nextInt();
        int resultado = primeiroNumero + segundoNumero;

        System.out.println("Resultado da soma: " + resultado);
    }
}
