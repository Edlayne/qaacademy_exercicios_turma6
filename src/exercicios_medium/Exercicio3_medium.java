package exercicios_medium;
//Exercício 3 - Faça um algoritmo para calcular e exibir a soma de todos os
//       números de 0 a 1000. E parar se caso a soma atingir 1500(ou mais).

public class Exercicio3_medium {
    public void somaNumerosAcumulados() {

        int i = 0, soma = 0;

        while (i <= 1000) {
            soma = soma + 1;
            System.out.println(soma);
            i++;
            if (soma >= 1500) {
                break;
            }
        }
    }
}

//public class Exercicio3_medium {
//    public static void main(String[] args) {
//
//        int i = 0, soma = 0;
//
//        while (i <= 1000) {
//            soma = soma + 1;
//            System.out.println(soma);
//            i++;
//            if (soma >= 1500) {
//                break;//Serve para finalizar o enquanto.
//
//            }
//
//        }
//
//    }
//}





//Inicio Algoritmo
// Declarar variável do inteira: i = 0, soma;
//    Enquanto(i<=1000)
//        soma = soma+i;
//        Exibir: soma;
//        i++;
//    SE(soma>=1500)
//        para enquanto;/break
//    Fim SE
//  Fim Enquanto
//Fim Algoritmo
