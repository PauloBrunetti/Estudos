package projetocalculadora;

import java.util.Scanner;
import projetocalculadora.Calculadora;

public class ProjetoCalculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Digite o primeiro número:");
        double num1 = teclado.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = teclado.nextDouble();

        System.out.println("Escolha a operação\nSoma\nSubtração\nMultiplicação\nDivisão:");
        String operacao = teclado.next();

        double resultado = 0;

        switch (operacao) {
            case "Soma":
                resultado = calc.soma(num1, num2);
                break;
            case "Subtração":
                resultado = calc.subtracao(num1, num2);
                break;
            case "Multiplicação":
                resultado = calc.multiplicacao(num1, num2);
                break;
            case "Divisão":
                resultado = calc.divisao(num1, num2);
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
    
}
