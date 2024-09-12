package iniciante;

import java.util.Scanner;

public class Bee1021NotasEMoedas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        int centavos = (int) Math.round(valor * 100);

        double[] notas = { 100.00, 50.00, 20.00, 10.00, 5.00, 2.00 };
        double[] moedas = { 1.00, 0.50, 0.25, 0.10, 0.05, 0.01 };

        System.out.println("NOTAS:");

        for (double nota : notas) {

            int valorNotaCentavos = (int) (nota * 100);
            int qtdNota = centavos / valorNotaCentavos;
            System.out.println(qtdNota + " nota(s) de R$ " + String.format("%.2f", nota));
            centavos %= valorNotaCentavos;
        }

        System.out.println("MOEDAS:");

        for (double moeda : moedas) {
            int valorMoedaCentavos = (int) (moeda * 100);
            int qtdMoeda = centavos / valorMoedaCentavos;
            System.out.println(qtdMoeda + " moeda(s) de R$ " + String.format("%.2f", moeda));
            centavos %= valorMoedaCentavos;
        }

        scanner.close();
    }
}
