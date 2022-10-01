package exercicios_medium;
//Exercício 8 - Faça um algoritmo para exibir todos os meses digitados
//anteriormente.

public class Exercicio8_medium {
    public String[] criaVetorMeses() {

        String[] vetorMeses;
        vetorMeses = new String[12];

        vetorMeses[0] = "Janeiro";
        vetorMeses[1] = "Fevereiro";
        vetorMeses[2] = "Março";
        vetorMeses[3] = "Abril";
        vetorMeses[4] = "Maio";
        vetorMeses[5] = "Junho";
        vetorMeses[6] = "Julho";
        vetorMeses[7] = "Agosto";
        vetorMeses[8] = "Setembro";
        vetorMeses[9] = "Outubro";
        vetorMeses[10] = "Novembro";
        vetorMeses[11] = "Dezembro";

        return vetorMeses;
       }
     public static void imprimeValoresVetor(String[] vetorMeses) {
        int i = 0;
        while (i <= 12) {
            System.out.println("O mês:" + (i + 1) + "-" + vetorMeses[i]);
            i++;

        }
    }
}

//public class Exercicio8_medium {
//    public static void main(String[] args) {
//        //Exercicio 07
//
//        String [] vetorMeses;
//        vetorMeses = new String[12];
//
//        vetorMeses[0] = "Janeiro";
//        vetorMeses[1] = "Fevereiro";
//        vetorMeses[2] = "Março";
//        vetorMeses[3] = "Abril";
//        vetorMeses[4] = "Maio";
//        vetorMeses[5] = "Junho";
//        vetorMeses[6] = "Julho";
//        vetorMeses[7] = "Agosto";
//        vetorMeses[8] = "Setembro";
//        vetorMeses[9] = "Outubro";
//        vetorMeses[10] = "Novembro";
//        vetorMeses[11] = "Dezembro";
//        //Exercicio 08
//        int i = 0;
//        while (i <= 12) {
//            System.out.println("O mês:" + (i + 1) + "-" + vetorMeses[1]);
//            i++;
//    }
//}

//Inicio Algoritmo
//Declarar variável do tipo inteiro: i=0;
//Enquanto (i<12)
//        Exibir: "O mês:" +(i+1)+"-"vetorMeses[i];
//Fim Enquanto
//Fim Algoritmo