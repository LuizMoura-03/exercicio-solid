package exercicio2;

public class Calculadora {
    public int calcular(String operacao, int a, int b) {
        switch (operacao) {
            case "soma":
                return a + b;
            case "subtracao":
                return a - b;
            case "multiplicacao":
                return a * b;
            case "divisao":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Erro: Divisão por Zero");
                    return 0;
                }
            default:
                System.out.println("Operração invalida");
                return 0;
        }
    }
}
