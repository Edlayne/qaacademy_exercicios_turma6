package exercicios_easy;
//Exercício 6 - Faça um algoritmo para ler duas notas, calcular a média. E
//SE - a média > 5 Exibir aprovado, SE a média < 5 exibir reprovado, se media = 5
//exibir exame.


import javax.swing.*;

public class Exercicio6_1_easy {
    public static void main(String[] args) {
        int nota1, nota2, media;

        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota"));
        media = (nota1 + nota2) / 2;


        if (media > 5) {
            System.out.println("Aprovado");
        }
        if (media < 5) {
            System.out.println("Reprovado");
        }
        if (media == 5) {
            System.out.println("Exame");
        }

    }
}