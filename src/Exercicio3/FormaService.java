package Exercicio3;

import java.util.Scanner;

public class FormaService {
    private Scanner scanner;

    public FormaService() {
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("===Bem vindo, Escolha uma forma Geometrica para calcular a área ===");
            System.out.println("1. - Retangulo");
            System.out.println("2. - Quadrado");
            System.out.println("3. - Triangulo");
            System.out.println("Digite o numero da forma: ");
            int escola = scanner.nextInt();

            Forma forma = null;

            switch (escola) {
                case 1:
                    System.out.println("Digite a largura do retangulo: ");
                    int largura = scanner.nextInt();
                    System.out.print("Digite a altura do retângulo: ");
                    int altura = scanner.nextInt();
                    forma = new Retangulo(largura, altura);
                    break;

                case 2:
                    System.out.print("Digite o lado do quadrado: ");
                    int lado = scanner.nextInt();
                    forma = new Quadrado(lado);
                    break;

                case 3:
                    System.out.print("Digite a base do triângulo: ");
                    int base = scanner.nextInt();
                    System.out.print("Digite a altura do triângulo: ");
                    int alturaTriangulo = scanner.nextInt();
                    forma = new Triangulo(base, alturaTriangulo);
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

            if (forma != null) {
                System.out.println("A área da forma é: " + forma.getArea());
            }
            System.out.print("Deseja calcular a área de outra forma? (s/n): ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }
        System.out.println("Obrigado por usar nosso sistema de cálculo de área!");
        scanner.close();
    }
}
