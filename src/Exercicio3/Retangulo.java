package Exercicio3;

public class Retangulo implements Forma{
    protected int largura;
    protected int altura;

    public Retangulo() {}

    public  Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public int getArea() {
        return largura * altura;
    }
}

