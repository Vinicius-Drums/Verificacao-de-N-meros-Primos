import java.util.Scanner;

public class VerificadorPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário inserir um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Chama a função para verificar se o número é primo
        if (numPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }

    // Função para verificar se o número é primo
    private static boolean numPrimo(int numero) {
        // Verifica se o número é menor ou igual a 1
        if (numero <= 1) {
            return false;
        }

        // Loop para verificar se o número é divisível apenas por 1 e por si mesmo
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                // O número é divisível por algum outro número além de 1 e ele mesmo
                return false;
            }
        }

        // Se nenhum divisor foi encontrado, o número é primo
        return true;
    }
}
