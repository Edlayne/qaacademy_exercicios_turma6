package exercicios_medium;
//Exercício 5 - Faça um algoritmo para ler 5 números, verificar e exibir, quais dos 5
//números digitados, é o menor.

import javax.swing.*;

public class Exec5 {
    public static void main(String[] args) {

        int numeroDigitado, menorNumero = 0, i = 1;
        String numeroDigitadoString;

        while (i<=5){
            numeroDigitadoString = JOptionPane.showInputDialog("Digite um numero");
            numeroDigitado = Integer.parseInt(numeroDigitadoString);

            if (numeroDigitado<menorNumero || i==1){
                menorNumero = numeroDigitado;
            }
            i++;
        }
        System.out.println("O número:"+menorNumero+"é o menor.");
    }
}





//Inicio Algoritmo
//        Declarar variável do tipo inteiro: numeroDigitado, menorNumero, i=1;
//Enquanto(i<=5)
//
//        numeroDigitado = Ler("numeroDigitado");
//        SE (numeroDigitado<menorNumero ii i==1)
//              menorNumero = numeroDigitado;
//        Fim SE
//i++;
//Fim Enquanto
//Exibir: ("O número:" + menorNumero+ "é p menor.");
//Fim Algoritmo