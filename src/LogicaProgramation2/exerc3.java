package LogicaProgramation2;

import java.util.Scanner;

public class exerc3 {
    //Crie um menu que oferece duas opções ao usuário:
    // "1. Calcular área do quadrado" e "2. Calcular área do círculo".
    // Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
    public static void main(String[] args) {
        // Área de um quadrado = Lado * lado ou l²
        // Área de um circulo = pi * raio ao quadrado ou pi * R²
        //Considerar pi como 3.14
        Scanner input = new Scanner(System.in);

        boolean menuActive = true;
        while (menuActive) {
            System.out.println("Digite uma das duas opções disponíveis: " +
                    "\n1- Calcular a área do quadrado" +
                    "\n2- Calcular a área do circulo");
            int escolhaUsuario = input.nextInt();
            switch (escolhaUsuario){
                case 1:
                    System.out.println("Insira o valor do lado do quadrado: ");
                    double ladoQuadrado = input.nextDouble();
                    double areaQuadrado = ladoQuadrado * ladoQuadrado;
                    String resultado = String.format("A área do quadrado de lado %.1f é igual á: %.1f",ladoQuadrado,areaQuadrado);
                    System.out.println(resultado);
                    menuActive = false;
                    break;
                case 2:
                    System.out.println("Insira o valor do raio: ");
                    double raioValor = input.nextDouble();
                    double areaCirculo = 3.14 * (raioValor * raioValor);
                    resultado = String.format("A área do circulo de raio %.2f é igual á: %.2f",raioValor,areaCirculo);
                    System.out.println(resultado);
                    menuActive = false;
                    break;
                default:
                    System.out.println("Não foi informado nenhuma das duas opções, favor repetir...");
                    break;
            }
        }
    }
}
