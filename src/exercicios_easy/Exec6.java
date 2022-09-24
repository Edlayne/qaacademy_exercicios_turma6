package exercicios_easy;
//Exercício 6 - Faça um algoritmo para ler duas notas, calcular a média. E
//SE - a média > 5 Exibir aprovado, SE a média < 5 exibir reprovado, se media = 5
//exibir exame.

import javax.swing.*;

public class Exec6 {
    public double calcularNotas (double nota1, double nota2, double nota3){
        System.out.println();

    }
}





    public static void main(String[] args) {
        //  Declarar variaveis do tipo numérico: nota1,nota2,resultado;
        double nota1, nota2;
        //double - armazena numero real, mais preciso.
        double resultado;
        String nota1Stg, nota2Stg;
        nota1Stg = JOptionPane.showInputDialog("Por favor, digite a primeira nota:");
        nota2Stg = JOptionPane.showInputDialog("Por favor digite a segunda nota:");

        nota1 = Integer.parseInt(nota1Stg);
        nota2 = Integer.parseInt(nota2Stg);
        resultado = (nota1 + nota2) / 2;
        System.out.println(resultado);
        if (resultado > 5) {//inicio
            System.out.println("Aprovado");
        }// fim se

        if (resultado < 5) {//inicio se
            System.out.println("Reprovado");
        } //fim se

        if (resultado == 5) {//inicio se
            System.out.println("Exame");

        } //fim se

    }//fim metodo

}//fim classe


//  Declarar variaveis do tipo numérico: nota1,nota2,result
//  Inicio do algoritimo
//        n1 = Ler(9);
//        n2 = Ler(6);
//        result = (nota1+nota2)/2;
//        Se(media > 5)
//        Exibir = "Aprovado";
//        Fim Se
//        Se media < 5
//        Fim Se
//        Exibir = "Reprovado";
//        Fim Se
//        Se(media == 5)
//        Exibir = "Exame";
//        Fim Se
// Fim Algoritimo