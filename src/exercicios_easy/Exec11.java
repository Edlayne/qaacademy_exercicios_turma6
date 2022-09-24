package exercicios_easy;
//Exercício 11 - Faça um algoritmo para ler um número inteiro, somar 2 ao número
//        digitado, até completar 100 iterações. Por ex.: Digitou 10. 10+2, 12+2, 14+2, Até
//        completar 100 iterações.

import javax.swing.*;

public class Exec11 {
    public static void main(String[] args) {
        int numeroDigitado;
        int i = 1;
        String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um número");
        numeroDigitado = Integer.parseInt(numeroDigitadoStg);

        while (i <= 100) {
            numeroDigitado = numeroDigitado + 2;

            System.out.println("O Total somado é:" + numeroDigitado);
            i++;


        }


    }


}

//Inicio Algoritimo
// Declarar variáveis do tipo inteiro: numeroDigitado, i = 1;
//    numeroDigitado = Ler("10");
//
//    Enquanto (i<=100)
//        numeroDigitado = numeroDigitado +2;
//    Exibir: "O Total somado é:" + numeroDigitado
//    i++;
//Fim Algoritimo