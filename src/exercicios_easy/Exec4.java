package exercicios_easy;
//Exercício 4 - Faça um algoritmo para ler um número inteiro, armazenar em uma
//        variável, calcular o dobro, e exibir.


import javax.swing.*;

public class Exec4 {
    public static void main(String[] args) {
        // Declarar variaveis do tipo numerico: num1,result;
        int num1, result;
        //  num1 = Ler (6);
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        result = num1 * 2;
        //  Exibir: "O dobro é:" + result;
        System.out.println("O dobro é:" + result);
    }
}

//    Inicio Algoritmo
//    Declarar variaveis do tipo numerico: num1,result;
//        num1 = Ler (6);
//        result= num1*2
//        Exibir: "O dobro é:" + num1*2;
//    Fim do algoritimo