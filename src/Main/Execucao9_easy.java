package Main;

import exercicios_easy.Exercicio9_easy;

import javax.swing.*;

public class Execucao9_easy {
    public static void main(String[] args) {
        String numeroDigitadoS = JOptionPane.showInputDialog("Digite um número:");
        int numeroDigitado = Integer.parseInt(numeroDigitadoS);
        Exercicio9_easy exercicio9_easy = new Exercicio9_easy();
        exercicio9_easy.calculaTabuada(numeroDigitado);
    }
}






