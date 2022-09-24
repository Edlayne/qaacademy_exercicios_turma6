package exercicios_medium;
//Exercício 2 - Faça um algoritmo para ler um valor de investimento, com uma taxa
//de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos juros, e
//o total. Considerando que a remuneração será no regime de juros compostos.

import javax.swing.*;
import java.sql.SQLOutput;

public class Exec2 {
    public static void main(String[] args) {

        double valorInvestimento, taxaJuros = 0.05, totalAtualizadoComJuros;
        int ano = 1, tempoInvestido = 10;
        String valorInvestimentoStg = JOptionPane.showInputDialog("Digite um valor de investimento:");
        valorInvestimento = Integer.parseInt(valorInvestimentoStg);
        totalAtualizadoComJuros = valorInvestimento;

        while (ano <= tempoInvestido){
            totalAtualizadoComJuros = (totalAtualizadoComJuros * taxaJuros) + totalAtualizadoComJuros;
            ano++;
        }
        System.out.println("O valor do investimento são:"+ valorInvestimento);
        System.out.println("O valor dos Juros são:" + (valorInvestimento - totalAtualizadoComJuros));
        System.out.println("O valor total do investimento:" +totalAtualizadoComJuros);

    }
}


// Declara variável do tipo numérica: valor Investimento, tavaJuros = 0.05,
//totalAtualizadoComJuros;
//Declarar variável do tipo inteiro: i=1, tempoInvestido = 10;
//valorInvestimento = Ler("1.000,00");
//totalAtualizadoComJuros = valorInvestimento;
//Enquanto(i<=tempoInvestido)
//
//totalAtualizadoComJuros = (totalAtualizadoComJuros * tavaJuros)+ totalAtualizadoComJuros;
