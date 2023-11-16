import java.util.Scanner;

public class exc1m8 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Declarando a variável para armazenar a nota
        int nota;

        // Solicitando ao usuário para inserir a média
        System.out.printf("Digite sua média: ");
        
        // Lendo a nota fornecida pelo usuário
        nota = sc.nextInt();
        
        // Verificando se a nota é maior ou igual a 6
        if (nota >= 6) {
            // Se a condição for verdadeira, imprime "Aprovado!"
            System.out.println("Aprovado!");
        } else {
            // Se a condição for falsa, imprime "Reprovado"
            System.out.println("Reprovado");
        }

        // Fechando o Scanner 
        sc.close();
    }
}
