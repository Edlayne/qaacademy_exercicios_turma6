package exercicios_medium;
//Exercício 09 - Faça um algoritmo para:
//Criar dois vetores.
//Em um vetor: ler e armazenar o nomes de alunos.
//No outro vetor: ler e armazenar a numeração de cada aluno, de acordo com a
//ordem inserida no vetor de nomes.
//E exiba, o Nome e o número correspondente de cada um.

import javax.swing.*;

public class Exec9 {
    public static void main(String[] args) {

        String[] alunosVetor = new String[5];
        int[] numeroAlunosVetor = new int[5];
        int i = 0;

        while (i < 7){
            alunosVetor[i] = JOptionPane.showInputDialog("Digite o nome do Aluno");
            numeroAlunosVetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
            i++;
        }//fim primeiro enquanto
        i = 0;

        while (i < 7) {
            System.out.println("Nome do Aluno:" + alunosVetor[i] + "-" + "Numero do aluno:" + numeroAlunosVetor[i]);
            i++;

        }
    }// fim main
}//fim classe

//Inicio Algoritmo
//Declarar vetor tipo texto: alunosVetor[7];
//Declarar vetor tipo numerico:numeroAlunosVetor[7];
//Declarar vetor tipo inteiro: i = 0;

//Enquanto(i<7)
//alunosVetor[i] = Ler("Nome Digitado");
//numeroAlunosVetorí] = Ler("numero do aluno digitado");

//i++
//Fim Enquanto

//i=0;
//Enquanto (i<7)
//     Exibir: "Nome do Aluno:"+alunosVetor[i] + "-" + "Número do aluno:" + numeroAlunosVetor[i];

// i++;
// Fim Enquanto
//Fim Algoritmo

