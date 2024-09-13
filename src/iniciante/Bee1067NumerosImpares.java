package iniciante;

import java.util.Scanner;

public class Bee1067NumerosImpares {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valor = scan.nextInt();

        for (int i = 0; i <= valor; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
