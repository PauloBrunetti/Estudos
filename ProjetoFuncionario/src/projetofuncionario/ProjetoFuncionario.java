package projetofuncionario;

import java.util.Scanner;

public class ProjetoFuncionario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome.");
        String nome = teclado.nextLine();

        System.out.println("Digite sua  idade.");
        int idade = teclado.nextInt();

        System.out.println("Digite seu cpf.");
        long cpf = teclado.nextLong();

        System.out.println("Digite seu salário.");
        float salario = teclado.nextFloat();

        float salarioDesconto = salario - 0.05F * salario;

        System.out.println("=== Cadastro ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário bruto: " + salario);
        System.out.println("Salário líquido: " + salarioDesconto);

        teclado.close();
    }
}
