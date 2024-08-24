package LogicaProgramation2;

import java.util.Scanner;
//Peça ao usuário para inserir dois números inteiros.
// Compare os números e imprima uma mensagem
// indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

public class exerc2 {
    public static boolean compararIgualdade (int num1, int num2) {
        if (num1 == num2) {
            String igualdade = String.format("Ambos números são iguais\nNúmero 1: %d\nNúmero 2: %d",num1,num2);
            System.out.println(igualdade);
            return true;
        } else {
            String igualdade = String.format("Ambos número são diferentes\nNúmero 1: %d\nNúmero 2: %d",num1,num2);
            System.out.println(igualdade);
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = input.nextInt();

        compararIgualdade(n1,n2); // compara Igualdades
        if (n1 > n2) { // checa se o primeiro número é maior
            System.out.println("O primeiro número é maior");
        } else if (n2 > n1) { // checa se o segundo número é maior
            System.out.println("O segundo número é maior.");
        }
    }
}
