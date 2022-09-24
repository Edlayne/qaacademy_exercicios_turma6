package exercicios_easy;
//2-) Faça um algoritimo para ler e exibir uma palavra

import javax.swing.*;

public class Exec2 {
    public static void main(String[] args) {
      //  Declarar variável do tipo texto palavra;
        String palavra;
      //palavra = Ler ("Curso");
      palavra = JOptionPane.showInputDialog("Digite sua palavra aqui!");
     // Exibir: "A palavra é:" + varPalavra;
        System.out.println("A Palavra é:" + palavra);

    }

}

//Início do algorítimo
//	Declarar uma variavel do tipo texto	varPalavra;
//	varPalavra = Ler( "Curso");
//	Exibir: "A palavra é:" varPalavra;
//Fim do algoritimo

