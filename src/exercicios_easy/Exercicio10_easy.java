package exercicios_easy;
//Exercício 10 - Faça um algoritmo para ler um valor de investimento, com uma
//taxa de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos
//juros e o total com juros. Considerando que a remuneração será no regime de
//juros simples.(em cima do valor que ele investiu.

public class Exercicio10_easy {
    public static void main(String[] args) {
        double valorJuros, taxaJuros = 0.05, valorInvestimento, valorTotal;
        valorInvestimento = 1000.00;
        valorJuros = (10 * taxaJuros) * valorInvestimento;
        valorTotal = valorJuros + valorInvestimento;

        System.out.println("Valor Investido: R$" + valorInvestimento);
        System.out.println("Valor Juros: R$" + valorJuros);
        System.out.println("Valor Total com Juros: R$" + valorTotal);

    }
}

// Portugol
//  Início Algoritimo
//	Declarar variáveis do tipo numérico: valorInvestimento, taxajuros = 0,05, valorJuuros, valorTotal;
//	valorInvestimento = Ler ("1000");
//	taxajuros = 0,05 * 10;
//	valorJuros = valorInvestimento * taxajuros;
//	 valorTotal = valorJuros+valorInvestimento
//	 Exibir: "Você investiu:" + valorInvestimento;
//	 Exibir: "Rendeu:" + valorJuros + "de Juros";
//	 Exibir: "O Valor total são:" + valorTotal;
//  Fim Algoritimo
