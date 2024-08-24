package LogicaProgramation2;

import java.util.Scanner;

public class exerc1 { // Crie um programa que solicite ao usuário digitar um número.
    // Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Serve para receber as inputs de dados dos usuário.
        int result = 0;
        while (result == 0) {
            System.out.println("O número não pode ser 0!!\nDigite um número para verificarmos se é positivo ou negativo: ");
            int resultado = input.nextInt();
            if (resultado !=0 && resultado >0) {
                System.out.println("Número é positivo.");
            } else if (resultado !=0 && resultado <0) {
                System.out.println("Número é negativo.");
            }
            else {
                System.out.println("Número ainda consta como 0!! Refaça o teste");
            }
            result = resultado;
        }


    }
}
