public class Main {

    static void main(String[] args) {
    // Inicio do site Screen Match
        System.out.println("Bem vindo ao Screen Match!");
        System.out.println("Filme: Interestelar");

    // Informações do filme Interestelar
        int anoDeLancamento = 2014;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.7;

        // Nota média para o filme e sinopse
        double media = (8.7 + 8.5 + 7) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme de ficção científica que explora os mistérios do universo.
                Lançado em 2014.
                Ótimo filme!
                """;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);

    }
}