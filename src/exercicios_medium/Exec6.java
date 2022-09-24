package exercicios_medium;
//Exercício 6 - Faça um algoritmo para ler um número inteiro, calcular e exibir o
//Fatorial do número digitado. Ex.: Digitou 10. 10*(10-1)*(10-2)*(10-3).. *(10-1) =
//3.628.800

import javax.swing.*;

public class Exec6 {
    public static void main(String[] args) {

        int fatorial, i;
        String fatorialDigitadoString = JOptionPane.showInputDialog("Digite um número pra calcular o fatorial");
        fatorial = Integer.parseInt(fatorialDigitadoString);
        i = fatorial;

        while (i>=1){
            fatorial = fatorial * (i-1);
            i--;

        }
        System.out.println("O fatorial do número digitado é" + fatorial);

    }

}



//Enquanto (i>=1)
//fatorial = fatorial * (i-1);
//i--;
//Fim Enquanto
//Exibir ("O fatorial do número digitado é"+fatorial).
