package bonus;

import java.math.BigDecimal;

public class Transacao {
    private final Notificacao notificacao;

    public Transacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void realizarTransacao(Conta conta, BigDecimal valor, boolean isDeposito) {
        if (isDeposito) {
            conta.depositar(valor);
        } else {
            conta.sacar(valor);
        }
        notificacao.enviar("Transacao realizada. Saldo atual: " + conta.consultarSaldo());

    }

    public void realizarTransferencia(Conta contaOrigem, Conta contaDestino, BigDecimal valor) {
        contaOrigem.transferir(valor, contaDestino);
        notificacao.enviar("Transferencia realizada. Saldo atual da conta de origem: "
                + contaOrigem.consultarSaldo());
        notificacao.enviar("Saldo atual da conta destino: " + contaDestino.consultarSaldo());
    }

}
