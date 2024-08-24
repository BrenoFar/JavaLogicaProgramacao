package ProjetoContaBanco;

import java.util.Scanner;

public class Conta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeCliente = "Breno Farias";
        String tipoConta = "Corrente";
        double saldo = 2270; //saldo inicial do cliente

        boolean menuActive = true; //manter o menu principal ativo enquanto funcional - Váriavel auxiliar

        String menuSaldo = String.format(
                "***********************\nDados iniciais do Cliente\n\nNome: %s\nTipo Conta: %s\nSaldo inicial: %.2f\n***********************",nomeCliente,tipoConta, saldo);
        System.out.println(menuSaldo);

        while (menuActive) {

            System.out.println("\nOperações\n");
            System.out.println("1- Consultar Saldo\n2- Receber Valor\n3- Transferir Valor\n4- Sair ");
            int opcao = input.nextInt();

            switch (opcao){
                case 1:
                    String mensagem = String.format("\nSaldo Atual\nR$%.2f", saldo);
                    System.out.println(mensagem);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    double valorReceber = input.nextDouble();
                    saldo += valorReceber;
                    mensagem = String.format("Saldo Atualizado R$%.2f",saldo);
                    System.out.println(mensagem);
                    break;
                case 3:
                    System.out.println("Informe o valor a transferir: ");
                    double valorTransferir = input.nextDouble();
                    if (saldo < valorTransferir) {
                        System.out.println("Transferencia não será realizada! Saldo insuficiente.");
                    } else {
                        saldo -= valorTransferir;
                        mensagem = String.format("Saldo Após transferencia R$%.2f",saldo);
                        System.out.println(mensagem);
                    }
                    break;
                case 4:
                    System.out.println("Você optou por sair, fim do aplicativo...");
                    menuActive = false;
                    break;
                default:
                    System.out.println("\nOpção inserida inválida\n");
                    break;

            }

        }

    }
}
