package carrinhocompras;

import java.util.Scanner;

public class CarrinhoCompras {

    public static void main(String[] args) {
        int n;
        for (n = 1; n <= 101; n++) {
            System.out.println(n);
            Scanner teclado = new Scanner(System.in);
            System.out.println("Quantidade de produtos");
            int quantidade = teclado.nextInt();

            System.out.println("O carrinho possui " + (quantidade == 0
                    ? "zero produtos" : quantidade == 1 ? "possui um produto" : +quantidade + " produtos"));

        }
    }

}
