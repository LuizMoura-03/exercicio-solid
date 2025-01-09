package bonus;

import java.math.BigDecimal;

public class Transacao {
    private final Notificacao notificacao;

    public Transacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void realizarTrasacao(Conta conta, BigDecimal valor, boolean isDeposito) {
        if (isDeposito) {
            conta.depositar(valor);
        } else {
            conta.sacar(valor);
        }

        notificacao.enviar("Transacao realizada. Saldo atual: " + conta.consultarSaldo());

    }

}
