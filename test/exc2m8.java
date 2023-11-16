import java.util.Scanner;

public class exc2m8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir três números inteiros
        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro número inteiro:");
        int numero3 = scanner.nextInt();

        // Verificar e exibir o menor número
        int menorNumero = encontrarMenorNumero(numero1, numero2, numero3);

        System.out.println("O menor número é: " + menorNumero);

        scanner.close();
    }

    // Método para encontrar o menor número
    private static int encontrarMenorNumero(int num1, int num2, int num3) {
        int menor = num1;

        // Verificar se num2 é menor que o atual menor
        if (num2 < menor) {
            menor = num2;
        }

        // Verificar se num3 é menor que o atual menor
        if (num3 < menor) {
            menor = num3;
        }

        return menor;
    }
}
