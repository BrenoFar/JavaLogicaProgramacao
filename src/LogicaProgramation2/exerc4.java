package LogicaProgramation2;
//Crie um programa que solicite ao usuário um
// número e exiba a tabuada desse número de 1 a 10.
// OBS: Para dificultar (Desafio próprio) crie uma tabuada que o usuário
//escolha 4 opções de operação e faça a tabuada até 10 para cada uma delas.

import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean menuActive = true;
        while (menuActive) {
            System.out.println("Digite uma das quatro opções disponíveis: " +
                    "\n1- Somar o número" +
                    "\n2- Subtrair o número." +
                    "\n3- Multiplicar o número." +
                    "\n4- Dividir o número.");
            int escolhaUsuario = input.nextInt();
            switch (escolhaUsuario){
                case 1:
                    System.out.println("Insira o valor do número: ");
                    double numeroUser = input.nextDouble();
                    System.out.println("Tabuada de Adição:");
                    for (int i = 1; i <=10 ; i++) {
                        double resultadoMatematico = numeroUser + i;
                        String mensagem = String.format("%.0f + %d = %.0f",numeroUser,i,resultadoMatematico);
                        System.out.println(mensagem);
                    }
                    menuActive = false;
                    break;
                case 2: //Subtração
                    System.out.println("Insira o valor do número: ");
                    numeroUser = input.nextDouble();
                    System.out.println("Tabuada de Subtração:");
                    for (int i = 1; i <=10 ; i++) {
                        double resultadoMatematico = numeroUser - i;
                        String mensagem = String.format("%.0f - %d = %.0f",numeroUser,i,resultadoMatematico);
                        System.out.println(mensagem);
                    }
                    menuActive = false;
                    break;
                case 3: //Multiplicação
                    System.out.println("Insira o valor do número: ");
                    numeroUser = input.nextDouble();
                    System.out.println("Tabuada de Multiplicação:");
                    for (int i = 1; i <=10 ; i++) {
                        double resultadoMatematico = numeroUser * i;
                        String mensagem = String.format("%.0f x %d = %.0f",numeroUser,i,resultadoMatematico);
                        System.out.println(mensagem);
                    }
                    menuActive = false;
                    break;
                case 4:
                    System.out.println("Insira o valor do número: ");
                    numeroUser = input.nextDouble();
                    System.out.println("Tabuada de Divisão:");
                    for (int i = 1; i <=10 ; i++) {
                        double resultadoMatematico = numeroUser * i;
                        String mensagem = String.format("%.0f / %d = %.0f",numeroUser,i,resultadoMatematico);
                        System.out.println(mensagem);
                    }
                    menuActive = false;
                    break;


                default:
                    System.out.println("Não foi informado nenhuma das duas opções, favor repetir...");
                    break;
            }
        }

    }

}
