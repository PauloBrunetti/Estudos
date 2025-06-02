package projetocalculadora;

public class Calculadora {

    private double ultimoResultado;

    public Calculadora() {
        this.ultimoResultado = 0;
    }

    public double soma(double num1, double num2) {
        this.ultimoResultado = num1 + num2;
        return this.ultimoResultado;
    }

    public double subtracao(double num1, double num2) {
        this.ultimoResultado = num1 - num2;
        return this.ultimoResultado;
    }

    public double ultimoValor() {
        return this.ultimoResultado;
    }

    public double multiplicacao(double num1, double num2) {
        this.ultimoResultado = num1 * num2;
        return this.ultimoResultado;
    }

    public double divisao(double num1, double num2) {
        if (num2 != 0) {
            this.ultimoResultado = num1 / num2;
        } else {
            System.out.println("Divisão por zero!");
            this.ultimoResultado = 0;
        }
        return this.ultimoResultado;
    }

}
