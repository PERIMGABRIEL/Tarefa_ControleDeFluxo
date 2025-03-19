import java.util.Scanner;

public class ControleDeNotas {

    public static void main(String[] args) {
        // Criando o scanner para ler os valores do console
        Scanner scanner = new Scanner(System.in);

        // Lendo as quatro notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        // Calculando a média das quatro notas
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Exibindo a média calculada
        System.out.println("A média das notas é: " + media);

        // Condicional para verificar o status do aluno
        if (media >= 7) {
            // Se a média for maior ou igual a 7, o aluno está aprovado
            System.out.println("Aluno aprovado!");
        } else if (media >= 5) {
            // Se a média for maior ou igual a 5, o aluno está de recuperação
            System.out.println("Aluno em recuperação!");
        } else {
            // Se a média for menor que 5, o aluno está reprovado
            System.out.println("Aluno reprovado!");
        }

        // Fechar o scanner
        scanner.close();
    }
}
