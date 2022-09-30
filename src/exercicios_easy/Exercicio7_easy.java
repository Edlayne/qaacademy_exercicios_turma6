package exercicios_easy;
//Exercício 7 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
//valor do INSS a ser pago. Respeitando a tabela abaixo:

public class Exercicio7_easy {
    public double calculaInss(double salario1) {
     double inss =0.0;
     
        if (salario1 <= 1045.00) {
            inss = salario1 * 0.075;
        }
        if (salario1 >= 1045.01 && salario1 <= 2089.60) {
            inss = salario1 * 0.09;
        }
        if (salario1 >= 2089.61 && salario1 <= 3134.40) {
            inss = salario1 * 0.12;
        }
        if (salario1 >= 3134.41 && salario1 <= 6101.06) {
            inss = salario1 * 0.14;
        }
        if (salario1 >= 6101.06) {
            inss = 6101.06 * 0.14;
        }
        return inss;
    }
}

































//public class Exercicio7_easy {
//    public static void main(String[] args) {
//
//        double salario, inss = 0.0; //declaração das variaveis
//        String salarioStg = JOptionPane.showInputDialog("Digite um valor de Salário:"); //Leitura da digitação
//        salario = Double.parseDouble(salarioStg);//Conversão e atribuição na variavel salario
//
//        if (salario <= 1045.00) { //abertura
//            inss = salario * 0.075; // 7,5%
//        }//fechamento if
//
//        if (salario >= 1045.01 && salario <= 2089.60) {//abertura
//            inss = salario * 0.09; //9%
//        }//fechamento if
//
//        if (salario >= 2089.61 && salario <= 3134.40) {//abertura
//            inss = salario * 0.12; //12%
//        }//fechamento if
//
//        if (salario >= 3134.41 && salario <= 6101.06) {//abertura
//            inss = salario * 0.14; //14
//        }//fechamento if
//
//        if (salario >= 6101.06) {//abertura
//            inss = 6101.06 * 0.14;
//        }//fechamento if
//
//        System.out.println("O Valor do inss a ser pago é R$" + inss);
//    }
//}


//    Declarar variaveis do tipo numérico: salario,inss;
//        Inicio do algoritimo
//        salario = Ler(2100);
//        SE (salario <= 1045,000)
//        inss = salario*0,075;
//        Exibir = "O valor que você deve será:" + inss;
//        Fim Se
//
//        SE (salario = > 1045,01 && <= 2089,60)
//        inss = salario* 0,09
//        Exibir = ("O valor que você deve será:" + inss);
//        Fim Se
//
//        SE (salario = > 2089,51 && <= 33134,40);
//        inss = salario* 0,12
//        Exibir = ("O valor que você deve será:" + inss);
//        Fim Se
//
//        SE (salario = > 3134,41 && <= 6101,06);
//        inss = valor1* 0,14
//        Exibir = ("O valor que você deve será:" + inss);
//        Fim Se