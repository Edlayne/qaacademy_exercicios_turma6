package Main;

import exercicios_easy.Exercicio7_easy;
import exercicios_easy.Exercicio8_easy;

public class Execucao8_easy {

    public static void main(String[] args) {
        String salarioS =" 2.800 ";
        double salario;
        salario = Double.parseDouble(salarioS);
        Exercicio8_easy exercicio8_easy = new Exercicio8_easy();
        System.out.println(" O Imposto de renda será: " + exercicio8_easy.calculaImpostoDeRenda(salario));
         double impostoDeRenda = exercicio8_easy.calculaImpostoDeRenda(salario);
        System.out.println(" O Salario líquido será " + exercicio8_easy.calcularSalarioLiquido(salario, impostoDeRenda));
    }
}


