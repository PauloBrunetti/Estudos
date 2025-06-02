package projetoeleitor;

import java.util.Scanner;

/* Desenvolva um progama que leaia a idade do eleitor,
e informe se o voto é obrigatório, opcional, ou não permitido.
O programa deve contem uma estrutura de repitição comlimite de tentativas.*/

public class ProjetoEleitor {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o limite");
        int limite = teclado.nextInt();

        for (int i = 1; i <= limite; i = i + 1) {
            teclado.nextLine();
            System.out.println("Digite seu nome");
            String nome = teclado.nextLine();

            System.out.println("Digite sua idade");
            int idade = teclado.nextInt();

            if (idade >= 18 && idade <= 69) {
                System.out.println("Obrigatório votar!");
            } else if (idade < 16) {
                System.out.println("Proibido votar!");
            } else {
                System.out.println("É opcional votar");
            }

        }

        teclado.close();

    }

}
