package imparoupar;

import java.util.Scanner;

public class ImparOuPar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um n�mero");
        int numero = teclado.nextInt();
        int resto = numero % 2;

        System.out.println("O n�mero " + numero + " � " + (numero == 0 ? "zero" : (resto == 0 ? "par" : "�mpar")));

    }

}
