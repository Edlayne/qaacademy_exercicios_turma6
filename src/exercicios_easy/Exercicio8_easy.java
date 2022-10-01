package exercicios_easy;
// Exercício 8 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
//        valor do salário bruto, valor do salário líquido e o valor do imposto de renda.
//        Respeitando a tabela abaixo:


public class Exercicio8_easy {
    public String calculaImpostoDeRenda(double salario) {//salario é parametro
        double ir = 0;

        if (salario <= 1903.98) {
            return "Isento imposto de renda";

        }else{

        if (salario >= 1903.99 && salario <= 2826.65) {
            ir = (salario * 0.075) - 142.80;
        }
        if (salario >= 2826.66 && salario <= 3751.05) {
            ir = (salario * 0.15) - 354.80;
        }
        if (salario >= 3751.06 && salario <= 4664.68) {
            ir = (salario * 0.225) - 636.13;
        }
        if (salario > 4664.68) {
            ir = (salario * 0.275) - 869.36;
        }
        return "Salario Bruto:" + salario + "Salario Liquido:"+ salario + ir + "Imposto a pagar:" + ir;
            }
    }
}




//public class Exercicio8_easy {
//
//    public double calculaImpostoDeRenda(double salario) {
//
//        double salarioLiquido = 0.0, impostoRenda = 0;
//
//        if (salario <= 1903.98) {
//            impostoRenda = 0;
//         }
//        if (salario >= 1903.99 && salario <= 2826.65) {
//            impostoRenda = (salario * 0.075) - 142.80;
//        }
//        if (salario >= 2826.66 && salario <= 3751.05) {
//            impostoRenda = (salario * 0.15) - 354.80;
//        }
//        if (salario >= 3751.06 && salario <= 4664.68) {
//            impostoRenda = (salario * 0.225) - 636.13;
//        }
//        if (salario > 4664.68) {
//            impostoRenda = (salario * 0.275) - 869.36;
//        }
//        return impostoRenda;
//    }
//    public double calcularSalarioLiquido(double salario, double impostoDeRenda) {
//        return salario - impostoDeRenda;
//
//    }
//}


//public class Exercicio8_easy {
//    public static void main(String[] args) {
//        double salario, ir=0;
//        salario = Double.parseDouble(JOptionPane.showInputDialog("Digit seu salario"));
//        if(salario > 0 && salario <= 1903.98 ) {
//            System.out.println("Isento de imposto de renda");
//        }else{
//            if(salario >= 1903.99 && salario <= 2826.65){
//                ir = (salario * 0.075)-142.80;
//            }
//            if(salario >=2826.66 && salario <= 3751.05) {
//                ir = (salario * 0.15) - 354.80;
//            }
//            if(salario >=3751.06 && salario <= 4664.68) {
//                ir = (salario * 0.225)-636.13;
//            }
//            if(salario > 4664.68){
//                ir = (salario * 0.275)-869.36;
//            }
//        }
//        System.out.println("Salario Bruto:  "+ salario);
//        System.out.println("Salario Liquido:  "+  (salario - ir));
//        System.out.println("Imposto a pagar:  " +  ir);
//
//
//    }//fim main
//
//}//fim classe


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