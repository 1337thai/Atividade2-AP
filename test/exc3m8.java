import java.util.Scanner;

public class exc3m8 {
    public static void main(String[] args) {
        // Criando um objeto Scanner 
        Scanner sc = new Scanner(System.in);

        // Solicitando ao usuário que digite um número de 1 a 7
        System.out.println("Digite um número de 1 a 7 para saber o dia correspondente:");
        int x = sc.nextInt();
        sc.nextLine();

        // Utilizando a estrutura switch para determinar o dia correspondente ao número fornecido
        switch (x) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                // Se o número não estiver entre 1 e 7, imprime "Opção inválida" e encerra o programa
                System.out.println("Opção inválida");
                // Fechando o Scanner
                sc.close();
               
        }
    }
}
