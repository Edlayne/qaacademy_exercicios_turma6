package exercicios_medium;
//Exercício 1 - Faça um algoritmo para verificar e exibir de 0 a 100, quais são os
//        números Pares e ímpares.

public class Exec1 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) ;
        if (i % 2 == 0) {
            System.out.println(i % 2);
            System.out.println("O número é:" + i + i + "é par");
        } else {
            System.out.println(i % 2);
            System.out.println("O número é:" + i + i + "é impar");
        }
        i++;
    }

}

// Inicio Algoritmo
//Declarar variável tipo inteiro: i=0;
//
//ENQUANTO (i<=100)
    //SE(i%2==0)
        //Exibir: "O número:"+i+"É par!"
    //Fim SE
//SE Não
        //Exibir: "O número:"+i+"É ímpar!"
    //Fim SE
//i++
//FIM ENQUANTO

//Fim Algoritmo