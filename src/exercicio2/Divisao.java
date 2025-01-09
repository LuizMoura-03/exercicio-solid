package exercicio2;

public class Divisao implements Operacao{
    @Override
    public int Calculcar(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: Não pode dividir por zero!");
        }
        return a / b;
    }
}
