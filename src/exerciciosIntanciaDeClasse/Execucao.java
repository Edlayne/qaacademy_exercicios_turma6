package exerciciosIntanciaDeClasse;

public class Execucao {
    public static void main(String[] args) {
        ExercicioTeste exercicioTeste = new ExercicioTeste();

        System.out.println(exercicioTeste.nome);
        System.out.println(exercicioTeste.idade);

        exercicioTeste.falar();
        exercicioTeste.correr();
        exercicioTeste.dormir();
    }
}
