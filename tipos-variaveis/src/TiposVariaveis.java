public class TiposVariaveis {

    public static void main(String[] args) {

        // =====================
        // TIPOS PRIMITIVOS
        // =====================

        // 1. Inteiros:
        byte idadeByte = 30;
        short populacaoCidade = 25000;
        int populacaoBrasil = 215000000;
        long populacaoMundial = 8000000000L;

        // 2. Decimais:
        float precoProduto = 99.99f;
        double saldoBancario = 1000000.75;

        // 3. Caractere:
        char letraInicial = 'K';

        // 4. Booleano:
        boolean estaLogado = true;

        // =====================
        // TIPOS POR REFERÊNCIA
        // =====================

        // 5. String (texto):
        String nome = "Kaue Dota";
        String cpf = "420.238.874-70";

        // 6. Array (lista fixa):
        int[] numeros = {1, 2, 3, 4, 5};

        // 7. ArrayList (lista dinâmica):
        java.util.ArrayList<String> frutas = new java.util.ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");

        // 8. HashMap (mapa chave → valor):
        java.util.HashMap<String, Integer> estoque = new java.util.HashMap<>();
        estoque.put("Camisa", 10);
        estoque.put("Calça", 5);

        // 9. Date (data e hora):
        java.time.LocalDate hoje = java.time.LocalDate.now();

        // 10. Scanner (entrada de dados):
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Digite seu e-mail:");
        String email = scanner.nextLine();

        // =====================
        // USANDO TODAS AS VARIÁVEIS
        // =====================

        System.out.println("\n=== RESUMO COMPLETO ===");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade (byte): " + idadeByte);
        System.out.println("População da cidade (short): " + populacaoCidade);
        System.out.println("População do Brasil (int): " + populacaoBrasil);
        System.out.println("População mundial (long): " + populacaoMundial);
        System.out.println("Preço do produto (float): R$" + precoProduto);
        System.out.println("Saldo bancário (double): R$" + saldoBancario);
        System.out.println("Letra inicial do nome: " + letraInicial);
        System.out.println("Está logado? " + estaLogado);
        System.out.println("Números no array: ");
        for (int numero : numeros) {
            System.out.println("- " + numero);
        }
        System.out.println("Frutas na lista: " + frutas);
        System.out.println("Estoque de Camisas: " + estoque.get("Camisa"));
        System.out.println("Data de hoje: " + hoje);
        System.out.println("E-mail digitado: " + email);

        // Fechando o scanner para evitar vazamento de recurso:
        scanner.close();
    }
}