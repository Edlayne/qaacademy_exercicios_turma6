package exercicios_medium;
//Exercício 5 - Faça um algoritmo para ler 5 números, verificar e exibir, quais dos 5
//números digitados, é o menor.

import javax.swing.*;

public class Exercicio5_medium {
    public int verificaMenorNumero() {
        int numeroDigitado;
        int menorNumero = 0, i = 1;
        String numeroDigitadoS;

        while (i <= 5) {
            numeroDigitado = lerNumeroDigitado();

            if (numeroDigitado < menorNumero || i == 1) {
                menorNumero = numeroDigitado;
            }
            i++;
        }
        return menorNumero;
    }
    private int lerNumeroDigitado() {

        String numeroDigitadoS = JOptionPane.showInputDialog("Digite um número");
        int numeroDigitado = Integer.parseInt(numeroDigitadoS);

        return numeroDigitado;
    }
}


//public class Exercicio5_medium {
//    public static void main(String[] args) {
//
//        int numeroDigitado, menorNumero = 0, i = 1;
//        String numeroDigitadoString;
//
//        while (i<=5){
//            numeroDigitadoString = JOptionPane.showInputDialog("Digite um numero");
//            numeroDigitado = Integer.parseInt(numeroDigitadoString);
//
//            if (numeroDigitado<menorNumero || i==1){
//                menorNumero = numeroDigitado;
//            }
//            i++;
//        }
//        System.out.println("O número:"+menorNumero+"é o menor.");
//    }
//}



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