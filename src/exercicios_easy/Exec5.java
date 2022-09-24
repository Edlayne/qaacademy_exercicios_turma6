package exercicios_easy;
//Exercício 5 - Faça um algoritmo para ler três números inteiros, armazenar em
//        variáveis, e exibir a soma, a subtração, multiplicação e a média dos três números
//        digitados.


import javax.swing.*;

public class Exec5 { // Inicio da classe
    public static void main(String[] args) { //Inicio
        //  Declarar variaveis do tipo numérico: num1, num2, num3;
        int num1, num2, num3;
        String num1Stg = JOptionPane.showInputDialog("Digite o primeiro número");
        String num2Stg = JOptionPane.showInputDialog("Digite o segundo número");
        String num3Stg = JOptionPane.showInputDialog("Digite o terceiro número");

        num1 = Integer.parseInt(num1Stg);
        num2 = Integer.parseInt(num2Stg);
        num3 = Integer.parseInt(num3Stg);

        System.out.println("A soma dos três números digitaos é:" +(num1+ num2 +num3));
        System.out.println("A subtração dos três números digitaos é:" +(num1- num2 -num3));
        System.out.println("A multiplicação dos três números digitaos é:" +(num1* num2 *num3));
        System.out.println("A média dos três números digitaos é:" +((num1+ num2 +num3)/3));

    }
}// fechamento da classe


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