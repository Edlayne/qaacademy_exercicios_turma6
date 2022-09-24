package exercicios_medium;
//Exercício 10 - Faça um algoritmo que calcule e exiba a sequencia de Fibonacci até
//o 10o elemento. Ex.: 0, 1,1 .. 34. Usando Vetor, para armazenar o resultado.
//A sequencia de Fibonacci, é calcula com a soma dos 2 termos anteriores, sendo o
//primeiro e o segundo são 0 e 1, respectivamente. 0, 1, 1, 2, 3, 5, 8, 13 .. 21.

public class Exec10 {
    public static void main(String[] args) {

        int elemento = 20;
        int[] fibonacci;//forma
        fibonacci = new int[elemento]; //é um objeto
        int i = 2;
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        while (i < elemento) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }//fim while
        i = 0;
        while (i < elemento) {
            System.out.println("Termo: "+i+ "Valor:" + fibonacci[i]);
            i++;


        }
    }
}




//Inicio Algoritmo
//    Declarar variável tipo inteiro: elemento;
//    elemento = Ler("10");
//    Declarar vetor do tipo numérico: fibonacci[elemento];
//    Declarar variável tipo inteiro: i = 2;
//    fibonacci[0] = 0;
//    fibonacci[1] = 1;
//
//    Enquanto (i<elemento)
//        fibonacci[i] = fibonacci[i-I] + fibonacci[i-2];
//i++;
//    Fim Enquanto
//
//i=0;
//    Enquanto(i<elemento)
//    Exibir: fibonacci[i];
//    i++;
//    Fim Enquanto
//Fim Algoritimo



