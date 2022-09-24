package exercicios_easy;
////Exercício 3 - Faça um algoritmo para ler dois valores, armazenar em variáveis, e
////exibir os valores das variáveis, trocados.

import javax.swing.*;

public class Exec3_2 {
    public static void main(String[] args) {
        String nome, sobrenome, auxiliar;
        nome = JOptionPane.showInputDialog("Digite seu nome");
        sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome");
        auxiliar = nome;
        nome = sobrenome;
        sobrenome = auxiliar;
        System.out.println("O nome é:" + nome + " " + sobrenome);
    }
}


//Inicio Algoritmo
//	Declarar variaveis do texto: nome, sobrenome, auxiliar;
//	nome = Ler("Edlayne");
//	sobrenome = Ler("Morais");
//	auxiliar = nome;
//	nome = sobrenome;
//	sobrenome = auxiliar;
//	Exibir: "O nome é:" + nome + sobrenome;
// Fim do algoritmo