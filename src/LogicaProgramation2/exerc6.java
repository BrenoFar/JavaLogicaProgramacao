package LogicaProgramation2;
//Crie um programa que solicite ao usuário um número
// e calcule o fatorial desse número.

import java.util.Scanner;

//Fatorial = 5! = 5 * 4 * 3 * 2 * 1 -> n! = n * (n - 1) * (n - 2) * (n - 3)
public class exerc6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número para realizarmos o fatorial (Número apenas real)");
        int numeroUser = input.nextInt();
        int totalValor = 1;
        for (int i = numeroUser; i > 1; i--) {
            totalValor *= i; // Multiplica totalValor pelo valor atual de i
        }
        System.out.println("O fatorial de " + numeroUser + " é: " + totalValor);
    }
}
