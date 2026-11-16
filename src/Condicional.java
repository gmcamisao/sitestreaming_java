public class Condicional {
    static void main(String[] args) {
        int anoDeLancamento = 2014;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.7;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2014){
             System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
             System.out.println("Filme antigo que vale a pena assistir!");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Necessário alugar");
        }
    }
}
