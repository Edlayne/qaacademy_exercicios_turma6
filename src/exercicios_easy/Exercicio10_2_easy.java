package exercicios_easy;
//Exercício 10 - Faça um algoritmo para ler um valor de investimento, com uma
//taxa de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos
//juros e o total com juros. Considerando que a remuneração será no regime de
//juros simples.(em cima do valor que ele investiu.

//Usando While

public class Exercicio10_2_easy {

    public double calcularValorJuros(double valorInvestimento) {
        double valorJuros = 0.0, taxaJuros = 0.05, ano = 1;
        valorInvestimento = 1000.00;

        while(ano <= 10) {
            valorJuros = valorJuros + (valorInvestimento * taxaJuros);
            ano = ano + 1;
        }
        return valorJuros;
    }
}





//public class Exercicio10_2_easy {
//    public static void main(String[] args) {
//        double valorJuros = 0.0, taxaJuros = 0.05, valorInvestimento, valorTotal, ano =1;
//        valorInvestimento = 1000.00;
//
//        While(ano <= 10){
//            valorJuros = valorJuros + (valorInvestimento * taxaJuros);
//            ano = ano + 1;
//        }
//        valorTotal = valorJuros + valorInvestimento;
//
//        System.out.println("Valor Investido: R$" + valorInvestimento);
//        System.out.println("Valor Juros: R$" + valorJuros);
//        System.out.println("Valor Total com Juros: R$" + valorTotal);
//
//    }
//}
