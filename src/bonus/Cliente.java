package bonus;

public class Cliente {
    private final String nome;
    private final String cpf;
    private final String email;
    private final Conta conta;

    public Cliente(String nome, String cpf, String email, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public Conta getConta() {
        return conta;
    }
}
