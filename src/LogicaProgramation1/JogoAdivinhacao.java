package LogicaProgramation1;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomizador = new Random().nextInt(100);
        int tentativas = 1;
        while (tentativas <=5) { // LogicaProgramation1.Loop para as 5 tentativas
            System.out.println("Tentativa de n° " + tentativas); // Demonstra o número de tentativas por LogicaProgramation1.Loop
            System.out.println("Digite o um número entre 0 e 100");
            int respostaUser = input.nextInt();
            tentativas++;

            if (respostaUser == randomizador) {
                String resultado = String.format("Parabéns!!\nVocê acertou!!");
                System.out.println(resultado);
                break;
            } else if (respostaUser > randomizador) {
                System.out.println("O valor que você digitou é acima do número sorteado");

            } else {
                System.out.println("O valor que você digitou é menor do que o número sorteado");
            }
            if (tentativas > 5 && respostaUser != randomizador) {
                System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + randomizador);
            }
        }
    }
}
