package Main;

import exercicios_easy.Exercicio10_easy;

import javax.swing.*;

public class Execucao10_easy {
    public static void main(String[] args) {
    double valorTotal, valorInvestimento, valorJuros;
    valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor de um investimento:"));
    Exercicio10_easy exercicio10_2_easy = new Exercicio10_easy();
    valorJuros = exercicio10_2_easy.calcularValorJuros(valorInvestimento);
    valorTotal = valorJuros + valorInvestimento;

     System.out.println("Valor Investido: R$" + valorInvestimento);
     System.out.println("Valor Juros: R$" + valorJuros);
     System.out.println("Valor Total com Juros: R$" + valorTotal);
 }
}
