package Main_medium;

import exercicios_medium.Exercicio2_medium;

import javax.swing.*;

public class Execucao2_medium {
    public static void main(String[] args) {

        String valorInvestimentoS = JOptionPane.showInputDialog("Digite um valor de investimento:");
        double valorInvestimento = Double.parseDouble(valorInvestimentoS);

        Exercicio2_medium exercicio2_medium = new Exercicio2_medium();

        double valorJuros = exercicio2_medium.calculaInvestimentoJurosCompostos(valorInvestimento);
        double valorTotal = exercicio2_medium.calculaValorTotalInvestimento(valorInvestimento, valorJuros);

        System.out.println("O valor dos Investimentos são:" + valorInvestimento);
        System.out.println("O valor dos Juros são:" + valorJuros);
        System.out.println("O valor total do Investimento:" + valorTotal);

    }
}

