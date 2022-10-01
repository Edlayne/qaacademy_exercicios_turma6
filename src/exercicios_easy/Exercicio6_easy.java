package exercicios_easy;
//Exercício 6 - Faça um algoritmo para ler duas notas, calcular a média. E
//SE - a média > 5 Exibir aprovado, SE a média < 5 exibir reprovado, se media = 5
//exibir exame.




public class Exercicio6_easy {
    public String calcularMedia(int nota1, int nota2) {
        int media;
        String retorno = "";
        media = (nota1 + nota2) / 2;

        if (media > 5) {//inicio
            retorno = "Aprovado";
        }//fim se

        if (media < 5) {//inicio
            retorno = "Reprovado!!!";
        }//fim se

        if (media == 5) {//inicio
            retorno = "Exame!!!";
        }//fim se
        return retorno;
    }
}



//public class Exercicio6_easy {
//    public String verificaAprovacao(double nota1, double nota2, double nota3) {
//        double resultado;
//
//        resultado = (nota1 + nota2 + nota3) / 2;
//
//        if (resultado > 7) {//inicio
//            return "Você está Aprovado! Parabéns!!!";
//        }//fim se
//
//        if (resultado < 7) {//inicio
//            return "Você está Reprovado!!!";
//        }//fim se
//
//        if (resultado == 7) {//inicio
//            return "Você está de Exame!!!";
//        }//fim se
//        return "Não foi possível calcular sua nota";
//    }
//}



//    public static void main(String[] args) {
//        int nota1, nota2, media;
//        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota"));
//        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota"));
//        media = (nota1 + nota2) / 2;
//        if (media > 5) {
//            System.out.println(media);
//            System.out.println("Aprovado");
//        }
//        if (media < 5) {
//            System.out.println(media);
//            System.out.println("Reprovado");
//        }
//        if (media == 5) {
//            System.out.println(media);
//            System.out.println("Exame");
//        }
//    }
//}

/// Declarar variaveis do tipo numérico: nota1,nota2,result
//  Inicio do algoritimo
//        n1 = Ler(9);
//        n2 = Ler(6);
//       result = (nota1+nota2)/2;
//        Se(media > 5)
//        Exibir = "Aprovado";
//        Fim Se
//        Se media < 5
//        Fim Se
//        Exibir = "Reprovado";
//        Fim Se
//        Se(media == 5)
//       Exibir = "Exame";
//        Fim Se
//  Fim Algoritimo
