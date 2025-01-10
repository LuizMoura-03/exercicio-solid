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
        BigDecimal taxa = calcularTaxa();
        if (saldo.compareTo(valor.add(taxa)) >= 0) {
            saldo = saldo.subtract(valor.add(taxa));
        } else {
            System.out.println("Saldo insuficiente!");
        }
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
        BigDecimal taxa = calcularTaxa();
        if (saldo.compareTo(valor.add(taxa)) >= 0) {
            this.sacar(valor); // Retira o valor da conta atual (incluindo a taxa)
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferencia!");
        }
    }
}
