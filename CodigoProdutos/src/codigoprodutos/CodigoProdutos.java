package codigoprodutos;

import java.util.Scanner;

public class CodigoProdutos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o c�digo");
        int codigo = teclado.nextInt();
        if (codigo == 110) {
            System.out.println("Borracha");
        } else if (codigo == 123) {
            System.out.println("Caneta");
        } else if (codigo == 23) {
            System.out.println("Caderno");
        } else if (codigo == 234) {
            System.out.println("Cola");
        } else if (codigo == 455) {
            System.out.println("L�pis");
        } else {
            System.out.println("C�digo inv�lido!");
        }
        teclado.close();
    }

}
