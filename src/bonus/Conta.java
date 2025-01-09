package bonus;

import java.math.BigDecimal;

public interface Conta {
    void depositar(BigDecimal valor);

    void sacar(BigDecimal valor);

    BigDecimal calcularTaxa();

    BigDecimal consultarSaldo();

    void transferir(BigDecimal valor, Conta ContaDestino);

}
