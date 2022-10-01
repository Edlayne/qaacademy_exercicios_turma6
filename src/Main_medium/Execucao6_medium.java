package Main_medium;

import exercicios_medium.Exercicio6_medium;

import javax.swing.*;

public class Execucao6_medium {
    public static void main(String[] args) {
        String fatorialDigitadoString = JOptionPane.showInputDialog("Digite um número pra calcular o fatorial");
        int fatorial = Integer.parseInt(fatorialDigitadoString);

        Exercicio6_medium exercicio6_medium = new Exercicio6_medium();
        fatorial = exercicio6_medium.calculaFatorial(fatorial);

        System.out.println(fatorial);

    }


}
