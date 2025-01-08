package Exercicio3;

public class Retangulo implements Forma{
    protected int largura;
    protected int altura;

    public void Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;

    } public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    @Override
    public int getArea() {
        return largura * altura;
    }

}

