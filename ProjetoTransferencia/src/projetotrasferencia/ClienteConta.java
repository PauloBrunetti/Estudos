package projetotrasferencia;

public class ClienteConta {

    private String titular;
    private String cpf;
    private double saldo;
    private double limite;

    // Construtor
    public ClienteConta(ClienteConta titular, String cpf, double saldo, double limite) {
        this.cpf = cpf;
        this.saldo = saldo;
        this.limite = limite;
    }

    // M�todos p�blicos - Interfaces de acesso
    public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Limite: R$" + limite);
        System.out.println("-------------------------------");
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Dep�sito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de dep�sito inv�lido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && (saldo + limite) >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        }
    }

    public boolean transferir(ClienteConta destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transfer�ncia de R$" + valor + " realizada para " + destino.getTitular());
            return true;
        } else {
            System.out.println("Transfer�ncia n�o realizada.");
            return false;
        }
    }

    // Getters e Setters - Encapsulamento
    public String getTitular() {
        return titular;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
