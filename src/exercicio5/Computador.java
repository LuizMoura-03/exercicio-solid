package exercicio5;

public class Computador {
    private DispositivoEntrada disposito;

    public Computador(DispositivoEntrada disposito) {
        this.disposito = disposito;
    }

    public void usarDispositivo() {
        disposito.usar();
    }
}
