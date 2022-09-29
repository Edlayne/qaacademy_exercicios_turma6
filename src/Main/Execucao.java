package Main;

import exercicios_easy.Exec5;

import javax.swing.*;

public class Execucao {
    public static void main(String[] args) {
        String primeiroNumeroDigitado1 = JOptionPane.showInputDialog("Digite o primeiro número");
        String segundoNumeroDigitado2 = JOptionPane.showInputDialog("Digite o segundo número");
        String terceiroNumeroDigitado3 = JOptionPane.showInputDialog("Digite o terceiro número");

        int primeiroNumeroDigitado = Integer.parseInt(primeiroNumeroDigitado1);
        int segundoNumeroDigitado = Integer.parseInt(segundoNumeroDigitado2);
        int terceiroNumeroDigitado = Integer.parseInt(terceiroNumeroDigitado3);

        System.out.println("A Soma dos números digitados será: " + Exec5.soma(primeiroNumeroDigitado, segundoNumeroDigitado, terceiroNumeroDigitado));
        System.out.println("A Subtração dos números digitados será: " + Exec5.subtracao(primeiroNumeroDigitado, segundoNumeroDigitado, terceiroNumeroDigitado));
        System.out.println("A Multiplicação dos números digitados será: " + Exec5.multiplicacao(primeiroNumeroDigitado, segundoNumeroDigitado, terceiroNumeroDigitado));
        int soma = Exec5.soma(primeiroNumeroDigitado, segundoNumeroDigitado, terceiroNumeroDigitado);
        System.out.println("A Média dos números digitados será: " + Exec5.soma(primeiroNumeroDigitado, segundoNumeroDigitado, terceiroNumeroDigitado));
    }
}
//----------------------------------------------------------------------------------------------------------------------
//Exec2
    //    public static void main(String[] args){
    //  Exec2 exec2 = new Exec2();
    //  System.out.println(exec2.exibirPalavra("A palavra é" + "Palavra"));
    //    }
    //}
//---------------------------------------------------
// Exec2 exemplo 2
//    public static void main(String[] args){
//  Exec2 exec2 = new Exec2();
// String palavra = exec2.exibirPalavra ("Palavra");
//  System.out.println(palavra);
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
//Exec3
//public static void main(String[] args) {
//    Exec3_1 exec3 = new Exec3_1();
//    System.out.println(exec3.inverterNomes("Edlayne","Morais"));
//}
//}
//----------------------------------------------------------------------------------------------------------------------
//Exec3 exemplo 2
//       public static void main(String[] args) {
//         String primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor");
//         String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor");
//          Exec3 exec3 = new Exec3(); //Instanciando a classe Exec3
//          System.out.println(exec3.inverterNomes(primeiroValor, segundoValor));//Faço chamada e valor
//        }
//      }
//----------------------------------------------------------------------------------------------------------------------
//Exec3
//  public static void main(String[] args) {
//      Exec3_2 exec3_2 = new Exec3_2();
//      System.out.println(exec3_2.inverterNomes("Teste","Ok"));
//  }
//}
//----------------------------------------------------------------------------------------------------------------------
//Exec4
//    public static void main(String[] args) {
//        Exec4 exec4 = new Exec4();
//        System.out.println("O dobro é:" + exec4.calcularDobro(4));
//        }
//    }
//----------------------------------------------------------------------------------------------------------------------
//Exec4 exemplo 2
//public static void main(String[] args) {
//    String numeroDigitadoUsuario = JOptionPane.showInputDialog("Digite um numero");
//    int numeroDigitado = Integer.parseInt(numeroDigitadoUsuario);
//    Exec4 exec4 = new Exec4();
//    System.out.println(" O dobro de " + numeroDigitado + " = "+exec4.calcularDobro(numeroDigitado));
//}
//}
//----------------------------------------------------------------------------------------------------------------------
//Exec4 exemplo 3
//public static void main(String[] args) {
//    String numeroDigitadoUsuario = JOptionPane.showInputDialog("Digite um numero");
//    int numeroDigitado = Integer.parseInt(numeroDigitadoUsuario);
//    Exec4 exec4 = new Exec4();
//    System.out.println(" O dobro de " + numeroDigitado + " = "+exec4.calcularDobro(numeroDigitado));
//}
//}
//----------------------------------------------------------------------------------------------------------------------

//Exec5
//public static void main(String[] args) {
//    Exec5 exec5 = new Exec5();
//    System.out.println(exec5.calcularMedia(3, 10, 9));
//  }
//}
//-----------------------------------------------------------------------------------------------------------------------
// Exec5 exemplo 2
//public static void main(String[] args) {
//    String primeiroNumeroDigitado1 = JOptionPane.showInputDialog("Digite o primeiro número");
//    String segundoNumeroDigitado2 = JOptionPane.showInputDialog("Digite o segundo número");
//    String terceiroNumeroDigitado3 = JOptionPane.showInputDialog("Digite o terceiro número");
//
//    int primeiroNumeroDigitado = Integer.parseInt(primeiroNumeroDigitado1);
//    int segundoNumeroDigitado = Integer.parseInt(segundoNumeroDigitado2);
//    int terceiroNumeroDigitado = Integer.parseInt(terceiroNumeroDigitado3);
//
//    System.out.println("A Soma dos numeros digitados será: " + Exec5.soma(primeiroNumeroDigitado, segundoNumeroDigitado, terceiroNumeroDigitado));
//    System.out.println("A Subtração os numeros digitados será: " + Exec5.subtracao(primeiroNumeroDigitado, segundoNumeroDigitado, terceiroNumeroDigitado));
//    System.out.println("A Multiplicação dos numeros digitados será: " + Exec5.multiplicacao(primeiroNumeroDigitado, segundoNumeroDigitado, terceiroNumeroDigitado));
//    int soma = Exec5.soma(primeiroNumeroDigitado, segundoNumeroDigitado, terceiroNumeroDigitado);
//    System.out.println("A Mdia dos numeros digitados será: " + Exec5.soma(primeiroNumeroDigitado, segundoNumeroDigitado, terceiroNumeroDigitado));
//}
//}
//-----------------------------------------------------------------------------------------------------------------------