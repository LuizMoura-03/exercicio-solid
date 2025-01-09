package bonus;

import java.math.BigDecimal;

public class ContaCorrente implements Conta {
    private BigDecimal saldo = BigDecimal.ZERO;

    @Override
    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);

    }

    @Override
    public void sacar(BigDecimal valor) {
        saldo = saldo.subtract(valor.add(calcularTaxa()));

    }

    @Override
    public BigDecimal calcularTaxa() {
        return BigDecimal.valueOf(10.0);
    }

    @Override
    public BigDecimal consultarSaldo() {
        return saldo;
    }

    @Override
    public void transferir(BigDecimal valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

}
