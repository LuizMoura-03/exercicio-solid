package exercicio1;

public class Main {
    public static void main(String[] args) {
        GeradorRelatorioFianceiro gerador = new GeradorRelatorioFianceiro();
        ReportSender sender = new ReportSender() ;

        gerador.gerarRelatorio();
        sender.enviarPorEmail();

    }
}