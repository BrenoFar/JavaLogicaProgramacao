package LogicaProgramation1;

public class exerc1 {
    public static void main (String [] args ) {
        double nota1 = 5.7;
        double nota2 = 9.9;
        double calcMedia = (nota1 + nota2) / 2;
        String mensagemResultado = String.format("A media do aluno será de: %.2f \nNota 1: %.2f\nNota 2: %.2f", calcMedia, nota1, nota2);
        System.out.println(mensagemResultado);
    }
}
