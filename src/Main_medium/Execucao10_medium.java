package Main_medium;

import exercicios_medium.Exercicio10_medium;

import javax.swing.*;

public class Execucao10_medium {
    public static void main(String[] args) {
        Exercicio10_medium exercicio10_medium = new Exercicio10_medium();
        String elementoFibonacciString = JOptionPane.showInputDialog("Digite o elemento Fibonacci que você deseja exibir");
        int elementoFibonacci = Integer.parseInt(elementoFibonacciString);
        int [] vetorFibonacci = exercicio10_medium.calculaTermoFibonacci(elementoFibonacci);
        exercicio10_medium.imprimeVetor(vetorFibonacci);
    }
}
