package controlefinanceiro;

import java.util.Scanner;
import java.time.LocalDate;

public class ControleFinanceiro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conta minhaConta = new Conta();

        int opcao = 0;
        do {
            System.out.println("\n--- Controle Financeiro ---");
            System.out.println("1. Adicionar entrada (receita)");
            System.out.println("2. Adicionar saída (despesa)");
            System.out.println("3. Ver saldo atual");
            System.out.println("4. Listar transações");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Descrição da entrada: ");
                    String descEntrada = teclado.nextLine();
                    System.out.print("Valor da entrada: ");
                    double valorEntrada = teclado.nextDouble();
                    minhaConta.adicionarTransacao(new Transacao(descEntrada, valorEntrada, LocalDate.now(), "entrada"));
                    break;
                case 2:
                    System.out.print("Descrição da saída: ");
                    String descSaida = teclado.nextLine();
                    System.out.print("Valor da saída: ");
                    double valorSaida = teclado.nextDouble();
                    minhaConta.adicionarTransacao(new Transacao(descSaida, valorSaida, LocalDate.now(), "saida"));
                    break;
                case 3:
                    System.out.println("Saldo atual: R$ " + minhaConta.calcularSaldo());
                    break;
                case 4:
                    System.out.println("--- Transações ---");
                    for (Transacao t : minhaConta.getTransacoes()) {
                        System.out.println(t.getData() + " | " + t.getTipo() + " | " + t.getDescricao() + " | R$" + t.getValor());
                    }
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        teclado.close();
    }
}
