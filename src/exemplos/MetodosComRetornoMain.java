package exemplos;

public class MetodosComRetornoMain {
    public static void main(String[] args) {
//          Primeira forma
//        System.out.println(saoPaulo());
//        System.out.println(rioDeJaneiro());
//        System.out.println(salvador());
//        System.out.println(fortaleza());
//        System.out.println(curitiba());


        String saoPaulo = Teste();
        System.out.println(saoPaulo);
        String rioDeJaneiro = rioDeJaneiro();
        System.out.println(rioDeJaneiro);
        String salvador = salvador();
        System.out.println(salvador);
        String fortaleza = fortaleza();
        System.out.println(fortaleza);
        String curitiba = curitiba();
        System.out.println(curitiba);

    }
    private static String Teste() {
        return "OK";
    }
    public static String saoPaulo() {return "saoPaulo"; }
    public static String rioDeJaneiro() {
        return "rioDeJaneiro";
    }
    public static String salvador() {return "salvador";}
    public static String fortaleza() {return "fortaleza";}
    public static String curitiba() {return "curitiba";}
}