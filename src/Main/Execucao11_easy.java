package Main;

import exercicios_easy.Exercicio11_easy;

import javax.swing.*;

public class Execucao11_easy {
    public static void main(String[] args) {
        String numeroDigitadoS = JOptionPane.showInputDialog("Digite um número inteiro");
        int numeroDigitado = Integer.parseInt(numeroDigitadoS);

        Exercicio11_easy exercicio11_easy = new Exercicio11_easy();
        System.out.println(exercicio11_easy.somaDois(numeroDigitado));
    }

}
