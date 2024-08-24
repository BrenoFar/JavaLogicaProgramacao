package LogicaProgramation1;

public class exerc6 {
    static double calcularDesconto (double preco, double percDesconto) {
        double precoDescontado = preco * percDesconto;
        double valorFinal = preco - precoDescontado;
        return valorFinal;
    }
    public static void main (String[]Args){
        double precoOriginal = 99;
        double desconto = 0.1; // 0.1 = 10%
        String resultado = String.format("Preço Original: R$%.2f\nO preço do produto após o desconto será de: R$%.2f",precoOriginal,calcularDesconto(precoOriginal,desconto));
        System.out.println(resultado);



    }
}
