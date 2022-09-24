package exercicios_easy;
//Exercício 5 - Faça um algoritmo para ler três números inteiros, armazenar em
//        variáveis, e exibir a soma, a subtração, multiplicação e a média dos três números
//        digitados.

//Clean Code = Código limpo

import javax.swing.*;

public class Exec5_3 {
    public static void main(String[] args) {
        //  Declarar variaveis do tipo numérico: soma, sub, mult, media;
        int numero1, numero2, numero3, soma, sub, mult, media;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));

        soma = numero1 + numero2 + numero3;
        sub = numero1 - numero2 - numero3;
        mult = numero1 * numero2 * numero3;
        media = soma / 3;

        System.out.println("A soma é:" + soma);
        System.out.println("A subtração é:" + sub);
        System.out.println("A multiplicação é:" + mult);
        System.out.println("A média é:" + media);

    }
}