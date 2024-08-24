package LogicaProgramation2;
//Crie um programa que solicite ao usuário a entrada
// de um número inteiro.
// Verifique se o número é par ou ímpar e
// exiba uma mensagem correspondente.

// para saber se o número é par, o resto da divisão tem que ser 0.

import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número para verificarmos se é par ou impar: ");
        double numeroUser = input.nextDouble();

        boolean validacaoPar;
        if (numeroUser % 2 == 0) {
            validacaoPar = true;
            String resultado = String.format("O número %.0f é par.",numeroUser);
            System.out.println(resultado);
        } else {
            String resultado = String.format("O número %.0f é impar.",numeroUser);
            System.out.println(resultado);
        }


    }
}
