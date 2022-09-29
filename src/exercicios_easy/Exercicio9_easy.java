package exercicios_easy;
// Exercício 9 - Faça um algoritmo para ler um número inteiro entre: 1 a 10,
//        calcular e exibir a tabuada deste número digitado. Ex.: 10 x 1 = 10, .., 10 x 10 =
//        100.

import javax.swing.*;

public class Exercicio9_easy {
    public static void main(String[] args) {
        int num1=0, i =1;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        while (i <= 10){
            System.out.println(num1+ " x " + i + " = " + num1 *i );
            i++;
        }
    }
}



//Exemplo1
//public class Exec9 {
//    public static void main(String[] args) {
//        int numeroDigitado, i=1, resultado;
//        String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um número para calcular a tabuada");
//        numeroDigitado = Integer.parseInt(numeroDigitadoStg);
//        while (i <= 10) {
//            resultado = numeroDigitado *1;
//            System.out.println(numeroDigitado + " X " + i + "=" + resultado);
//            i++; //soma do i+1 pra entrar em loop infinito
//
//        }
//    }//fim do main
//}//fim da classe


//    Início Algoritimo
//    Declarar variáveis do tipo numérica: numeroDigitado, i=1;
//        numeroDigitado = Ler("5");
//        Enquanto(i<=10)
//        Exibir: "Numero" + numeroDigitado + "X" + i + "=" + numeroDigitado * i;
//        i=i+1;
//        Fim Enquanto

//        Fim Algoritimo
//        Enquanto repete enquanto a condição for verdadeira