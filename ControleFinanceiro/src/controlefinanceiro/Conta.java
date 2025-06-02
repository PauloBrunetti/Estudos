package controlefinanceiro;

import java.util.ArrayList;
import java.util.List;

public class Conta {

    private List<Transacao> transacoes;

    public Conta() {
        this.transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    public double calcularSaldo() {
        double saldo = 0;
        for (Transacao t : transacoes) {
            if (t.getTipo().equalsIgnoreCase("entrada")) {
                saldo += t.getValor();
            } else if (t.getTipo().equalsIgnoreCase("saida")) {
                saldo -= t.getValor();
            }
        }
        return saldo;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}
