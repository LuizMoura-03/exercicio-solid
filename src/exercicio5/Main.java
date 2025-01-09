package exercicio5;

import java.security.cert.CertPath;

public class Main {
    public static void main(String[] args) {
        DispositivoEntrada teclado = new Teclado();
        Computador computadorComTeclado = new Computador(teclado);
        computadorComTeclado.usarDispositivo();

        DispositivoEntrada mouse = new Mouse();
        Computador computadorComMouse = new Computador(mouse);
        computadorComMouse.usarDispositivo();

    }
}
