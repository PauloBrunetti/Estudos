package exemplomedia;

import java.util.Scanner;

public class ExemploMedia {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota da A1");
        Double a1 = teclado.nextDouble();

        System.out.println("Digite a nota da A2");
        Double a2 = teclado.nextDouble();

        System.out.println("Digite a nota da A3");
        Double a3 = teclado.nextDouble();

        Double media = (a1 + a2 + a3);

        System.out.println("A média das notas é:" + media);

        if (media >= 70) {
            System.out.println("Você está aprovado!");
        } else {
            System.out.println("Você está reprovado!");
        }

        teclado.close();

    }

}
