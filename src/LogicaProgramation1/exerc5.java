package LogicaProgramation1;

public class exerc5 {
    public static void main (String[]Args) {
        double dolToBrl = 4.94;
        double dolFunds = 55.53; // Valor em doláres

        double conversion = dolFunds * dolToBrl;
        String resultado = String.format("Valor em reais na carteira = R$ %.2f",conversion);
        System.out.println(resultado);

    }
}
