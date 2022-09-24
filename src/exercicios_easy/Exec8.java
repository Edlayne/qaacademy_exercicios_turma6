package exercicios_easy;
// Exercício 8 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
//        valor do salário bruto, valor do salário líquido e o valor do imposto de renda.
//        Respeitando a tabela abaixo:

import javax.swing.*;

public class Exec8 {
    public static void main(String[] args) {

        double salario, salarioLiquido = 0.0, impostoRenda = 0.0;
        String salarioStg = JOptionPane.showInputDialog("Digite o Salário:");
        salario = Double.parseDouble(salarioStg);

        if (salario <= 1903.98) {//inicio se
            impostoRenda = 0;
            salarioLiquido = salario - impostoRenda;
        } //fim se

        if (salario >= 1903.99 && salario <= 2826.65) {//inicio se
            impostoRenda = (salario * 0.075) - 142.80;
            salarioLiquido = salario - impostoRenda;
        } //fim se

        if (salario >= 2826.66 && salario <= 3751.05) {//inicio se
            impostoRenda = (salario * 0.15) - 354.8;
            salarioLiquido = salario - impostoRenda;
        } //fim se

        if (salario >= 3751.06 && salario <= 4664.68) {//inicio se
            impostoRenda = (salario * 0.225) - 6366.13;
            salarioLiquido = salario - impostoRenda;
        } //fim se

        if (salario > 4664.68) {//inicio se
            impostoRenda = (salario * 0.275) - 869.36;
            salarioLiquido = salario - impostoRenda;
        } //fim se

        System.out.println("Seu Salario Bruto será: R$" + salario);
        System.out.println("Seu Salario Liquido será: R$ " + salarioLiquido);
        System.out.println("O valor a ser pago de imposto de renda será: R$ " + impostoRenda);

    }//fim main

}//fim classe


//Inicio do algoritimo
//Declarar variaveis do tipo numérico: salario,IR;
//        salario = Ler (1900,00);
//        Se(salario  >= 00,00 &&  salario <=1903,98)
//        Exibir = ("O valor do salário bruto: " + salario)
//        Exibir = ("O valor do salário liquido" + salario)
//        Exibir = ("O valor do IR é isento" )
//        Fim se
//
//        Se(salario  >= 1903,99 &&  salario <=2826,65)
//        IR = salario*0,075-142,08;
//        Exibir = ("O valor do salário bruto: " + salario)
//        Exibir = ("O valor do salário liquido" + salario - IR)
//        Exibir = ("O valor do IR" + IR)
//        Fim se
//        Se(salario  >= 2826,66 &&  salario <=3751,05)
//        IR = salario*0,15-354,80;
//        Exibir = ("O valor do salário bruto: " )
//        Exibir = ("O valor do salário liquido" )
//        Exibir = ("O valor do IR" )
//        Fim se
//
//        Se(salario  >= 3751,06 &&  salario <= 4664,68)
//        IR = salario*0,225-636,13;
//        Exibir = ("O valor do salário bruto: " )
//        Exibir = ("O valor do salário liquido" )
//        Exibir = ("O valor do IR" )
//        Fim se
//
//        Se(salario = 4664,68);
//        IR = salario*0,275-869,36;
//        Exibir = ("O valor do salário bruto: " )
//        Exibir = ("O valor do salário liquido" )
//        Exibir = ("O valor do IR" )
//        Fim se