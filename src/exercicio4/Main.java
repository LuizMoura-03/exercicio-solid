package exercicio4;

public class Main {
    public static void main(String[] args) {
        Programador desenvolvedor = new Desenvolvedor();
        desenvolvedor.programar();

        AtendenteInterface atendente = new Atendente();
        atendente.atenderCliente();
    }
}
