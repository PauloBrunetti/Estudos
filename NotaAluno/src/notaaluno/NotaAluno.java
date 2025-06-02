package notaaluno;

import java.util.Scanner;

public class NotaAluno {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a sua nota da A1:");
        double nota1 = teclado.nextDouble();

        System.out.println("Digite a sua nota da A2:");
        double nota2 = teclado.nextDouble();

        System.out.println("Digite a sua nota da A3:");
        double nota3 = teclado.nextDouble();

        double media = (nota1 + nota2 + nota3);
        System.out.println("Sua média é: " + media);

        if (media <= 0 && media >= 70) {
            System.out.println("Você está reprovado!");
        } else if (media > 70 && media <= 100) {
            System.out.println("Você está aprovado!");
        } else {
            System.out.println("Erro: medida inválida.");
        }

        teclado.close();
    }

}
