package exercicios_medium;
//Exercício 4 - Faça um algoritmo para calcular e exibir a multiplicação de todos os
//números de 1 a 1000. E toda vez que resultado chegar ou ultrapassar 1000, faça
//que o resultado das multiplicações volte a ser 1.

public class Exercicio4_medium {

    public void multiplicacaoNumerosAteMil() {

        int i = 1, resultadoMultiplicacao = 1;

        while (i <= 1000) {
            resultadoMultiplicacao = resultadoMultiplicacao * i;
            System.out.println("O resultado da multiplicação é:" + resultadoMultiplicacao);
            if (resultadoMultiplicacao >= 1000) {
                resultadoMultiplicacao = 1;
                System.out.println("Foi Zerado");
           }
           i++;
        }
    }
}



//
//public class Exercicio4_medium {
//    public static void main(String[] args) {
//
//        int i = 1, resultadoMultiplicacao = 1;
//
//        while (i <= 1000) {
//            resultadoMultiplicacao = resultadoMultiplicacao * i;
//            System.out.println("O resultado da multiplicação é:" + resultadoMultiplicacao);
//            if (resultadoMultiplicacao >= 1000) {
//                resultadoMultiplicacao = 1;
//
//            }
//            i++;
//
//        }
//
//    }
//}
