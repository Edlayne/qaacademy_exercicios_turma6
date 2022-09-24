package exercicios_easy;
//Exercício 5 - Faça um algoritmo para ler três números inteiros, armazenar em
//        variáveis, e exibir a soma, a subtração, multiplicação e a média dos três números
//        digitados.

//Clean Code = Código limpo

import javax.swing.*;

public class Exec5_2 {
    public static void main(String[] args) {
        //  Declarar variaveis do tipo numérico: soma, subtracao, multiplicacao, media;
        int num1, num2, num3, soma, subtracao, multiplicacao, media;
        String num1Stg = JOptionPane.showInputDialog("Digite o primeiro número");
        String num2Stg = JOptionPane.showInputDialog("Digite o segundo número");
        String num3Stg = JOptionPane.showInputDialog("Digite o terceiro número");

        num1 = Integer.parseInt(num1Stg);
        num2 = Integer.parseInt(num2Stg);
        num3 = Integer.parseInt(num3Stg);

        soma = num1 + num2 + num3;
        subtracao = num1 - num2 - num3;
        multiplicacao = num1 * num2 * num3;
        media = (num1 + num2 + num3) / 3;

        System.out.println("A soma dos três números digitaos é:" + soma);
        System.out.println("A subtração dos três números digitaos é:" + subtracao);
        System.out.println("A multiplicação dos três números digitaos é:" + multiplicacao);
        System.out.println("A média dos três números digitaos é:" + media);

    }
}

//  Inicio Algoritmo
//  Declarar variaveis do tipo numérico: num1, num2, num3, result;
//        num1 = Ler(5);
//        num2 = Ler(6);
//        num3 = Ler(7);
//        result=num1+num2+num3;
//        Exibir = "A soma é:" + num1+ num2 +num3;
//        result=num1-num2-num3;
//        Exibir = "A subtração é: + "num1- num2 -num3;
//        result=num1*num2*num3;
//        Exibir = "A multiplicação é: + "num1* num2 *num3;
//        result=(num1+num2+num3)/3;
//
//        Exibir = "A media é:" + (num1 + num2 + num3)/3;
// Fim do algoritimo


