package Main;

import exercicios_easy.Exec4;

import javax.swing.*;

public class Execucao {


    public static void main(String[] args) {
        String numeroDigitadoUsuario = JOptionPane.showInputDialog("Digite um numero");
        int numeroDigitado = Integer.parseInt(numeroDigitadoUsuario);
        Exec4 exec4 = new Exec4();
        System.out.println(" O dobro de " + numeroDigitado + " = "+exec4.calcularDobro(numeroDigitado));
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
// Exemplo 2
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
//Exemplo 2
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
//    System.out.println(exec4.calcularDobro(numeroDigitado));
//}
//}
//----------------------------------------------------------------------------------------------------------------------
//Exec4 exemplo3
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