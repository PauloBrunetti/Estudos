package projetotemperatura;

import java.util.Scanner;

public class ProjetoTemperatura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a temperatura");
        double temperatura = teclado.nextDouble();

        if (temperatura <= 10) {
            System.out.println("Está frio!");
        } else if (temperatura <= 25) {
            System.out.println("O clima está bom!");
        } else {
            System.out.println("O clima está quente!");
        }

        teclado.close();
    }

}
