package exercicios_easy;
//Exercício 4 - Faça um algoritmo para ler um número inteiro, armazenar em uma
//        variável, calcular o dobro, e exibir.

import javax.swing.*;

public class Exec4 { //inicio da classe
    public static void main(String[] args) {
        //    Declarar variável do tipo numérico: numero;
        int num1;
        // numero = Ler ();
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        //        Exibir: numero*2;
        System.out.println("O dobro é " + num1 * 2);

    }

}//fim da classe


//    Inicio Algoritmo
//    Declarar variaveis do tipo numerico: num1,result;
//        num1 = Ler (6);
//        result= num1*2
//        Exibir: "O dobro é:" + num1*2;
//    Fim do algoritimo