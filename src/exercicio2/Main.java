package exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bem-vindo à Calculadora!");
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");

            System.out.print("Digite o número da operação desejada: ");
            int operacaoEscolhida = scanner.nextInt();

            System.out.print("Digite o primeiro número: ");
            int a = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int b = scanner.nextInt();

            String operacao = switch (operacaoEscolhida) {
                case 1 -> "soma";
                case 2 -> "subtracao";
                case 3 -> "multiplicacao";
                case 4 -> "divisao";
                default -> null;
            };

            if (operacao == null) {
                System.out.println("Operação invalida! tente novamente.");
            } else {
                int resultado = calculadora.calcular(operacao, a, b);
                System.out.println("O resultado é: " + resultado);
            }
            System.out.println("Deseja realizar outra operação? (s/n): ");
            String resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("s");
        }

        System.out.println("Obrigado por usar a calculadora! ");
        scanner.close();

    }
}
