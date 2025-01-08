package Exercicio3;

public class Triangulo implements Forma{
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public  int getArea() {
        return (base * altura) / 2;
    }
}
